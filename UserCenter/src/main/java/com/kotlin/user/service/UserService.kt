package com.kotlin.user.service

import rx.Observable


/**
 *Author Aatoken
 *Date 2019/4/26 8:50
 *Description 用户服务
 */
interface UserService {


    //用户注册
    fun register(mobile:String,pwd:String,verifyCode:String): Observable<Boolean>



}