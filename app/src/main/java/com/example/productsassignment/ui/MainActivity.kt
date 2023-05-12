package com.example.productsassignment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.productsassignment.databinding.ActivityMainBinding
import com.example.productsassignment.MainPresenter.IMainView
import com.example.productsassignment.MainPresenter.MainPresenter
import com.example.productsassignment.ProductAdpter

import com.example.productsassignment.model.Products


class MainActivity : AppCompatActivity(), IMainView {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val presenter = MainPresenter(this)
        presenter.getCurrentProductsStatus()

    }

    override fun onGetProductsStatusSuccess(productsData: Products) {
        val adpter =ProductAdpter(this,productsData.products)
        binding.recyclerProducts.adapter=adpter
    }

    override fun onGetProductsStatuFailure(e: Exception) {
        TODO("Not yet implemented")
    }
}