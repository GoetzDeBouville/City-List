package org.radiogaga.app.data

import org.radiogaga.app.data.dto.CityDto
import org.radiogaga.app.domain.City

fun CityDto.toDomain(): City {
    val subtTitle = "Страна: ${this.country} население: ${this.population}"

    return City(
        title,
        subtTitle,
        latitude,
        longitude
    )
}
