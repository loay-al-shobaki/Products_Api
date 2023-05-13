package com.example.productsassignment.DataProduct

import com.example.productsassignment.model.Products
import java.lang.Exception


interface IProduct {

    fun getAllProducts(
        onGetProductsStatusSuccess:(Products:Products)->Unit,
        onGetProductsStatuFailure:(e:Exception)->Unit
    )
    fun getSmartPhones(
        onGetSmartPhonesStatusSuccess:(Products:Products)->Unit,
        onGetSmartPhonesStatuFailure:(e:Exception)->Unit
    )

    fun getFragrances(
        onGetFragrancesStatusSuccess:(Products:Products)->Unit,
        onGetFragrancesStatuFailure:(e:Exception)->Unit
    )
    fun getGroceries(
        onGetGroceriesStatusSuccess:(Products:Products)->Unit,
        onGetGroceriesStatuFailure:(e:Exception)->Unit
    )
}