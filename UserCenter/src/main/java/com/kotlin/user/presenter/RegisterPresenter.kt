package com.kotlin.user.presenter

import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.impl.UserServiceImpl



/**
 *Author Aatoken
 *Date 2019/4/25 23:42
 *Description 注册业务逻辑代码
 */
class RegisterPresenter : BasePresenter<RegisterView>() {


    fun register(mobile: String, verifyCode: String, pwd: String) {

        /**
         * 业务逻辑
         */
        var userServiceImpl=UserServiceImpl()
        userServiceImpl.register(mobile,verifyCode,pwd)
                .execute(object :BaseSubscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })

    }


    fun userinfo()
    {
        var userServiceImpl=UserServiceImpl()
        userServiceImpl.userinfo()
                .execute(object :BaseSubscriber<String>(){
                    override fun onNext(t: String) {
                      mView.userinfoResult(t)
                    }
                })
    }

}