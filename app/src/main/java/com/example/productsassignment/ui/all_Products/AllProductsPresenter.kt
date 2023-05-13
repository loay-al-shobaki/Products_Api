package com.example.productsassignment.ui.all_Products

import com.example.productsassignment.DataProduct.ProductImp
import com.example.productsassignment.model.Products

class AllProductsPresenter (val allProductsView: AllProductsView){

    private val productImp = ProductImp()

    fun getCurrentProductsStatus()=
        productImp.getAllProducts(
            ::onGetProductsStatusSuccess,
            ::onGetProductsStatuFailure
        )

    private fun onGetProductsStatusSuccess (productsData: Products)=
        allProductsView.onGetProductsStatusSuccess(productsData)

    private fun onGetProductsStatuFailure (message:Exception)=
        allProductsView.onGetProductsStatuFailure(message)
}