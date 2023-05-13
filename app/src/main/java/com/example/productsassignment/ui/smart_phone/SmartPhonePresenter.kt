package com.example.productsassignment.ui.smart_phone

import com.example.productsassignment.DataProduct.ProductImp
import com.example.productsassignment.model.Products

class SmartPhonePresenter(private  val  smartPhoneView: SmartPhoneView) {
    private val productImp = ProductImp()




    fun getCurrentSmartPhonesStatus()=
        productImp.getSmartPhones(
            ::onGetSmartPhonesStatusSuccess,
            ::onGetSmartPhonesStatuFailure
        )

    private fun onGetSmartPhonesStatusSuccess (productsData: Products)=
        smartPhoneView.onGetSmartPhonesStatusSuccess(productsData)

    private fun onGetSmartPhonesStatuFailure (message:Exception)=
        smartPhoneView.onGetSmartPhonesStatuFailure(message)




}