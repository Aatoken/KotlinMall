package com.kotlin.user.presenter.view

import com.kotlin.base.presenter.view.BaseView

/**
 *Author Aatoken
 *Date 2019/4/25 23:42
 *Description
 */
interface RegisterView : BaseView {

    /**
     * 返回注册结果
     */
    fun onRegisterResult(result: Boolean)

}