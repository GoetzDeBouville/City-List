package org.radiogaga.app.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CityDto(
    @SerialName("name") val title : String,
    @SerialName("latitude") val latitude: Float,
    @SerialName("longitude") val longitude: Float,
    @SerialName("country") val country: String,
    @SerialName("population") val population: Int,
    @SerialName("is_capital") val isCapital: Boolean
)