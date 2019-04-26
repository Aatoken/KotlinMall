package com.kotlin.base.presenter

import com.kotlin.base.presenter.view.BaseView


/**
 *Author Aatoken
 *Date 2019/4/25 23:16
 *Description 基础presenter
 */
open class BasePresenter<T: BaseView> {

    lateinit var mView:T


}