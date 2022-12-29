package com.cacttuseducation.remotedatashowinginrecycleview.model

data class UserResponse(
    val users : List<User>,
    val total : Int ,
    val skip : Int ,
    val limit : Int
)

data class User(
    val id : Int ,
    val firstName : String?,
    val lastName : String?,
    val age : Int ,
    val address : Address,
    val university : String?
)

data class Address(
    val address : String?,
    val city : String?,
    val coordinates : Coordinates,
    val postalCode : String?
)

data class Coordinates(
    val lat : Double,
    val lng : Double
)