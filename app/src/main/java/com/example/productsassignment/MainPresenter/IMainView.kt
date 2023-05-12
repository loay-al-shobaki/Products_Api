package com.example.productsassignment.MainPresenter

import com.example.productsassignment.model.Products

interface IMainView {

    fun onGetProductsStatusSuccess(Products: Products)
    fun onGetProductsStatuFailure(e: Exception)
}