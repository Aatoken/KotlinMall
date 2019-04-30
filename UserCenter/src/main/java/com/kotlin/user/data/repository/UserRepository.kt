package com.kotlin.user.data.repository

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.RegisterReq
import com.kotlin.user.data.protocol.UserInfoReq
import rx.Observable

/**
 *Author Aatoken
 *Date 2019/4/26 16:22
 *Description
 */

class UserRepository {

    fun register(mobile: String, pwd: String, verifyCode: String)
            : Observable<BaseResp<String>> {

        return RetrofitFactory.instances.create(UserApi::class.java)
                .regitser(RegisterReq(mobile, pwd, verifyCode))
    }

    fun userinfo(): Observable<String> {
        return RetrofitFactory.instances.create(UserApi::class.java)
                .userInfo()
    }


}