package com.kotlin.base.rx

import rx.Subscriber


/**
 *Author Aatoken
 *Date 2019/4/26 9:26
 *Description
 */
open class BaseSubscriber<T> : Subscriber<T>() {
    override fun onNext(t: T) {
    }

    override fun onCompleted() {
    }

    override fun onError(e: Throwable?) {
    }
}