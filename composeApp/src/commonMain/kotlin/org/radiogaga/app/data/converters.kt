package org.radiogaga.app.data

import city_list.composeapp.generated.resources.Res
import city_list.composeapp.generated.resources.country
import city_list.composeapp.generated.resources.population
import org.radiogaga.app.data.dto.CityDto
import org.radiogaga.app.domain.City

fun CityDto.toDomain(): City {
    val subtTitle = Res.string.country.toString() +
            this.country +
            Res.string.population.toString() +
            this.population

    return City(
        title,
        subtTitle,
        latitude,
        longitude
    )
}
