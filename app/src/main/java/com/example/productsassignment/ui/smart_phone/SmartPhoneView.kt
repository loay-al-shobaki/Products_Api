package com.example.productsassignment.ui.smart_phone

import com.example.productsassignment.model.Products

interface SmartPhoneView {

    fun onGetSmartPhonesStatusSuccess(Products: Products)
    fun onGetSmartPhonesStatuFailure(e: Exception)


}