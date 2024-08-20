package org.radiogaga.app.feature.search.data.network

import org.radiogaga.app.core.data.dto.CityDto

sealed interface CityResponse {
    class CityList(val value: List<CityDto>) : CityResponse
}