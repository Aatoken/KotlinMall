package com.kotlin.user.presenter.view

import com.kotlin.base.presenter.view.BaseView

/**
 *Author Aatoken
 *Date 2019/4/25 23:42
 *Description 注册的view
 */
interface RegisterView : BaseView {

    /**
     * 返回注册结果
     */
    fun onRegisterResult(result: Boolean)

    fun userinfoResult(string:String)

}