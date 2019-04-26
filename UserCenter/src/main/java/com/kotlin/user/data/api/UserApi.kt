package com.kotlin.user.data.api

import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 *Author Aatoken
 *Date 2019/4/26 15:51
 *Description
 */
interface UserApi {


    @POST
    fun regitser(@Body req: RegisterReq):Observable<BaseResp<String>>



}