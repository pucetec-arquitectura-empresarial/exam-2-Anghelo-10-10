package com.pucetec.exam2.models.requests

import java.time.LocalDateTime

data class ParkingEntryRequest(
    var id: Long,
    var assignedFloor: String,
    var entryTime: Int,
)