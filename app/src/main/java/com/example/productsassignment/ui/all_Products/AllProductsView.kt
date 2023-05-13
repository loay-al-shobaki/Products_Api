package com.example.productsassignment.ui.all_Products

import com.example.productsassignment.model.Products

interface AllProductsView {
    fun onGetProductsStatusSuccess(Products: Products)
    fun onGetProductsStatuFailure(e: Exception)
}