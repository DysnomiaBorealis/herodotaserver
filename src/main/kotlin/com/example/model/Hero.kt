package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Hero(
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating : Double,
    val position: Int,
    val power: List<String>,
    val comfort: String,
    val pick: List<String>,
    val abilities: List<String>,
    val roleTypes: List<String>
)