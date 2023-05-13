package com.example.productsassignment.ui.groceries

import com.example.productsassignment.DataProduct.ProductImp
import com.example.productsassignment.model.Products
import com.example.productsassignment.ui.fragrances.FragrancesView

class GroceriesPresenter(private var groceriesView: GroceriesView) {

    private val productImp = ProductImp()


    fun getCurrentGroceriesStatus()=
        productImp.getGroceries(
            ::onGetGroceriesStatusSuccess,
            ::onGetGroceriesStatuFailure
        )

    private fun onGetGroceriesStatusSuccess (productsData:Products)=
        groceriesView.onGetGroceriesStatusSuccess(productsData)

    private fun onGetGroceriesStatuFailure (message:Exception)=
        groceriesView.onGetGroceriesStatuFailure(message)

}