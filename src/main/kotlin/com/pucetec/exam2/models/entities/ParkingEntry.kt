package com.pucetec.exam2.models.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "ticket")
data class ParkingEntry(
    @Column
    var ticketId: Int,

    @Column(nullable = false, length = 150)
    var assignedFloor: String,

    @Column(length = 10)
    var entryTime: Int? = 10,

    @Column(nullable = false, length = 500)
    var exitTime: String,

) : BaseEntity()