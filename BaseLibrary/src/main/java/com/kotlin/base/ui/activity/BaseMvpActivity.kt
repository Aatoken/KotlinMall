package com.kotlin.base.ui.activity

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.presenter.view.BaseView

/**
 *Author Aatoken
 *Date 2019/4/25 23:31
 *Description 基础mvp的activity
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {


    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError() {

    }


    lateinit var mPresenter:T

}