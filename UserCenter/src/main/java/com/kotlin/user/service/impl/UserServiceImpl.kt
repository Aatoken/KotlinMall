package com.kotlin.user.service.impl

import com.kotlin.user.service.UserService
import rx.Observable


/**
 *Author Aatoken
 *Date 2019/4/26 8:53
 *Description
 */
class UserServiceImpl : UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String)
            : Observable<Boolean> {

        return Observable.just(true)
    }


}