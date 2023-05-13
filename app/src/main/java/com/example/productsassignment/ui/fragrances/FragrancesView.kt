package com.example.productsassignment.ui.fragrances

import com.example.productsassignment.model.Products

interface FragrancesView {
    fun onGetFragrancesStatusSuccess(Products: Products)
    fun onGetFragrancesStatuFailure(e: Exception)
}