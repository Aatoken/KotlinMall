package com.kotlin.base.data.protocol

/**
 *Author Aatoken
 *Date 2019/4/26 15:49
 *Description
 */
class BaseResp<out T>(val status:Int,val message:String,val data:T) {
}