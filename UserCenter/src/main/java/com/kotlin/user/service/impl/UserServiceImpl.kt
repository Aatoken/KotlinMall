package com.kotlin.user.service.impl

import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.base.rx.BaseException
import com.kotlin.user.data.repository.UserRepository
import com.kotlin.user.service.UserService
import rx.Observable
import rx.functions.Func1


/**
 *Author Aatoken
 *Date 2019/4/26 8:53
 *Description 用户服务的具体实现
 */
class UserServiceImpl : UserService {


    override fun register(mobile: String, pwd: String, verifyCode: String)
            : Observable<Boolean> {
        val repository = UserRepository()
        return repository.register(mobile, pwd, verifyCode)
                .flatMap(object : Func1<BaseResp<String>, Observable<Boolean>> {
                    override fun call(t: BaseResp<String>): Observable<Boolean> {

                        if (t.status != 0) {
                            return Observable.error(BaseException(t.status, t.message))
                        }
                        return Observable.just(true)
                    }

                })
    }


    override fun userinfo(): Observable<String> {
        val repository = UserRepository()
        return repository.userinfo().flatMap(object : Func1<String, Observable<String>> {
            override fun call(t: String?): Observable<String> {
                return Observable.just(t)
            }
        })

    }
}