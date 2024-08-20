package org.radiogaga.app.core.data

import org.radiogaga.app.core.data.dto.CityDto
import org.radiogaga.app.core.domain.model.City

fun CityDto.toDomain(): City {
    val subTitle = "Country: $country population $population"

    return City(
        title,
        subTitle,
        latitude,
        longitude
    )
}
