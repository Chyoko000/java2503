package com.situ.demo.liushao.login.dao.impl;


import com.situ.demo.liushao.login.dao.LoginDao;
import com.situ.demo.liushao.login.entity.User;
import com.situ.demo.liushao.login.utils.Utilss;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: untitled1
 * @ClassName LoginDaoImpl
 * @description:  接口的实现类
 * @author: 刘庆东
 * @create: 2025−03-26 09:20
 * @Version 1.0
 **/

public class LoginDaoImpl implements LoginDao {

    //获取本地文件的长度
    private long getFileSize(){
        File file = new File(Utilss.URL);
        long length = file.length();//调用方法获取文件的大小
        return length;
    }

    //获取记事本的中的用户信息
    private Map<String, User> getUserInfo(){
        Map<String,User> map = new HashMap<>();
        //读取数据
        ObjectInputStream ois = null;

        try {
            //读取流
            ois = new ObjectInputStream(new FileInputStream(new File(Utilss.URL)));
            //读取数据
            map= (Map<String, User>) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭流
            if(ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return  map;
    }

    @Override
    public boolean register(User user) {
        //返回值
        boolean flag=false;
        //写入数据  key 用户名  vlue 是User用户  beijingliushao
        Map<String,User> map = new HashMap<>();
        //获取一下文件大小
        long fileSize = getFileSize();

        //判断
        if(fileSize>0){
              //记事本中有数据
            map=getUserInfo();
        }

        if(map.get(user.getUsername())!=null){
            //证明这个用户名被注册过了
            flag=false;
        }else {
            //可以注册
            try {
                //写入流
                oos = new ObjectOutputStream(new FileOutputStream(new File(Utilss.URL)));
                //key  value
                map.put(user.getUsername(),user);
                //执行写入
                //进行重覆盖
                oos.writeObject(map);
                oos.flush();
                // 修改注册标识
                flag=true;


            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                if(oos!=null){
                    try {
                        oos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }


        return flag;
    }




    @Override
    public boolean login(User user) {
        boolean flag=false;

        Map<String,User> map = new HashMap<>();

        long nums = getFileSize();

        if(nums>0){
            map =getUserInfo();
        }

        if(map.get(user.getUsername())!=null  &&
                map.get(user.getUsername()).getPassword().equals(user.getPassword())){
            //合法用户
            flag=true;
        }


        return flag;
    }
}
