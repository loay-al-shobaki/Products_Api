package com.example.productsassignment.ui.groceries

import com.example.productsassignment.model.Products

interface GroceriesView {

    fun onGetGroceriesStatusSuccess(Products: Products)
    fun onGetGroceriesStatuFailure(e: Exception)
}