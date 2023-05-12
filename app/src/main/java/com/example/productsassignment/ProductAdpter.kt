package com.example.productsassignment

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.productsassignment.databinding.ItemProductBinding
import com.example.productsassignment.model.Product
import com.example.productsassignment.model.Products
import com.squareup.picasso.Picasso

class ProductAdpter(private var activity: Activity, val list: List<Product?>?) :
    RecyclerView.Adapter<ProductAdpter.ProductViewHoloder>() {
    inner class ProductViewHoloder(var bindingItem: ItemProductBinding) : RecyclerView.ViewHolder(bindingItem.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHoloder {
        val binding = ItemProductBinding.inflate(activity.layoutInflater, parent, false)
        return ProductViewHoloder(binding)
    }

    override fun getItemCount() = list!!.size

    override fun onBindViewHolder(holder: ProductViewHoloder, position: Int) {
        val currentProduct = list?.get(position)
        holder.bindingItem.also {
            Picasso.get().load(currentProduct?.images?.get(0)).into(it.imgProduct)
            it.txtTitle.text=currentProduct?.title
            it.txtPrice.text=currentProduct?.price.toString()+" $"
            it.txtDescription.text=currentProduct?.description
            it.materialRatingBar.rating=currentProduct?.rating!!.toFloat()
        }
    }
}