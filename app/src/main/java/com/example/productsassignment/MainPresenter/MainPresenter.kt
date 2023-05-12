package com.example.productsassignment.MainPresenter

import com.example.productsassignment.DataProduct.ProductImp
import com.example.productsassignment.model.Products

class MainPresenter (private var iMainView: IMainView){

    private val productImp = ProductImp()

    fun getCurrentProductsStatus()=
        productImp.getProducts(
            ::onGetProductsStatusSuccess,
            ::onGetProductsStatuFailure
        )

    private fun onGetProductsStatusSuccess (productsData:Products)=
        iMainView.onGetProductsStatusSuccess(productsData)

    private fun onGetProductsStatuFailure (message:Exception)=
        iMainView.onGetProductsStatuFailure(message)

}
