package com.example.productsassignment.DataProduct

import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.example.productsassignment.MySingleton
import com.example.productsassignment.model.Products
import com.google.gson.Gson
import java.lang.Exception

class ProductImp : IProduct {
    companion object {
        const val URL = "https://dummyjson.com/products"
    }

    override fun getProducts(
        onGetProductsStatusSuccess: (Products: Products) -> Unit,
        onGetProductsStatuFailure: (e: Exception) -> Unit
    ) {
        val RequestProduct = JsonObjectRequest(Request.Method.GET, URL, null,
            { response ->
                val products=   Gson().fromJson(response.toString(),Products::class.java)
                onGetProductsStatusSuccess(products)
                Log.d("loay", "getProducts: ${products}")
            },
            { error ->
             onGetProductsStatuFailure(error)
            })
        MySingleton.getInstance()!!.addRequestQueue(RequestProduct)
    }


}
