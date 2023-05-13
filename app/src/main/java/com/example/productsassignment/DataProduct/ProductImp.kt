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
        const val URL_ALL_PRODUCTS = "https://dummyjson.com/products"
        const val URL_SMARTPHONES = "https://dummyjson.com/products/category/smartphones"
        const val URL_FRAGRANCES = "https://dummyjson.com/products/category/fragrances"
        const val URL_GROCERIES = "https://dummyjson.com/products/category/groceries"
    }

    override fun getAllProducts(
        onGetProductsStatusSuccess: (Products: Products) -> Unit,
        onGetProductsStatuFailure: (e: Exception) -> Unit
    ) {
        val RequestProduct = JsonObjectRequest(Request.Method.GET, URL_ALL_PRODUCTS, null,
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

    override fun getSmartPhones(
        onGetSmartPhonesStatusSuccess: (Products: Products) -> Unit,
        onGetSmartPhonesStatuFailure: (e: Exception) -> Unit
    ) {
        val RequestProduct = JsonObjectRequest(Request.Method.GET, URL_SMARTPHONES, null,
            { response ->
                val products=   Gson().fromJson(response.toString(),Products::class.java)
                onGetSmartPhonesStatusSuccess(products)
                Log.d("loay", "getProducts: ${products}")
            },
            { error ->
                onGetSmartPhonesStatuFailure(error)
            })
        MySingleton.getInstance()!!.addRequestQueue(RequestProduct)
    }

    override fun getFragrances(
        onGetFragrancesStatusSuccess: (Products: Products) -> Unit,
        onGetFragrancesStatuFailure: (e: Exception) -> Unit
    ) {
        val RequestProduct = JsonObjectRequest(Request.Method.GET, URL_FRAGRANCES, null,
            { response ->
                val products=   Gson().fromJson(response.toString(),Products::class.java)
                onGetFragrancesStatusSuccess(products)
                Log.d("loay", "getProducts: ${products}")
            },
            { error ->
                onGetFragrancesStatuFailure(error)
            })
        MySingleton.getInstance()!!.addRequestQueue(RequestProduct)
    }

    override fun getGroceries(
        onGetGroceriesStatusSuccess: (Products: Products) -> Unit,
        onGetGroceriesStatuFailure: (e: Exception) -> Unit
    ) {
        val RequestProduct = JsonObjectRequest(Request.Method.GET, URL_GROCERIES, null,
            { response ->
                val products=   Gson().fromJson(response.toString(),Products::class.java)
                onGetGroceriesStatusSuccess(products)
                Log.d("loay", "getProducts: ${products}")
            },
            { error ->
                onGetGroceriesStatuFailure(error)
            })
        MySingleton.getInstance()!!.addRequestQueue(RequestProduct)
    }


}
