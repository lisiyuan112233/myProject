package com.sia.member.utils;

public class UserContextUtil<T> {
    private  final ThreadLocal<T> tl = new ThreadLocal<>();
    public  void saveUser(T user){
        tl.set(user);
    }
    public T getUser(){
        return tl.get();
    }
}
