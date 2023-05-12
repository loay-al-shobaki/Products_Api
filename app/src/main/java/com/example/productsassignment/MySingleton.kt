package com.example.productsassignment

import android.app.Application
import android.text.TextUtils
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class MySingleton:Application() {

    val  TAG ="loay"
    private var mRequestQueue:RequestQueue?=null

    companion object{
         var mInstance:MySingleton?=null

         fun getInstance():MySingleton?{
            return mInstance
        }

    }

    override fun onCreate() {
        super.onCreate()
    mInstance=this
    }
    private  fun getRequestQueue():RequestQueue?{
        if (mRequestQueue==null)
            mRequestQueue = Volley.newRequestQueue(this)
        return mRequestQueue
    }
    fun<T> addRequestQueue(req:Request<T>){
        req.tag=TAG
        getRequestQueue()?.add(req)
    }

     fun<T> addRequestQueue(req:Request<T>,Tag:String){
        req.tag=if (TextUtils.isEmpty(Tag)) TAG else Tag
        getRequestQueue()?.add(req)
    }

    fun cancelPendingRequest(tag:Any?){
        if (mRequestQueue!=null)
            mRequestQueue!!.cancelAll(tag)
    }

}