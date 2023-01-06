package com.cacttuseducation.remotedatashowinginrecycleview.model

data class Product(
    val id : Int,
    val title : String?,
    val description : String?,
    val price : Int,
    val discountPercentage : Double,
    val rating : Double,
    val stock : Int,
    val images : List<String>
)