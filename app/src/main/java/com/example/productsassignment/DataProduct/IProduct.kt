package com.example.productsassignment.DataProduct

import com.example.productsassignment.model.Products
import java.lang.Exception


interface IProduct {

    fun getProducts(
        onGetProductsStatusSuccess:(Products:Products)->Unit,
        onGetProductsStatuFailure:(e:Exception)->Unit
    )
}