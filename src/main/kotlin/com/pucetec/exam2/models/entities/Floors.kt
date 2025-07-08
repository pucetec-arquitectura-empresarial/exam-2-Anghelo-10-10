package com.pucetec.exam2.models.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.Table

@Entity
@Table(name = "floors")
data class Floors(

    @Column(nullable = false, length = 150)
    var level: String,

    @Column(length = 10)
    var totalCapacity: Int? = 10,

    @Column(nullable = false, length = 500)
    var occupiedSpots: String,

) : BaseEntity()