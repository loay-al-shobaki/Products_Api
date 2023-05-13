package com.example.productsassignment.ui.fragrances

import com.example.productsassignment.DataProduct.ProductImp
import com.example.productsassignment.model.Products
import com.example.productsassignment.ui.fragrances.FragrancesView

class FragrancesPresenter(private var fragrancesView: FragrancesView) {

    private val productImp = ProductImp()

    fun getCurrentFragrancesStatus()=
        productImp.getFragrances(
            ::onGetFragrancesStatusSuccess,
            ::onGetFragrancesStatuFailure
        )

    private fun onGetFragrancesStatusSuccess (productsData: Products)=
        fragrancesView.onGetFragrancesStatusSuccess(productsData)

    private fun onGetFragrancesStatuFailure (message:Exception)=
        fragrancesView.onGetFragrancesStatuFailure(message)

}