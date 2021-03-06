package com.kotlin.base.ext

import com.kotlin.base.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


/**
 *Author Aatoken
 *Date 2019/4/26 9:47
 *Description 扩展方法
 */

fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>) {

    this.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)
}
