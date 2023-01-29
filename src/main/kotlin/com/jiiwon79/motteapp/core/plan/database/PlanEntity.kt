package com.jiiwon79.motteapp.core.plan.database

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity(name = "plan")
class PlanEntity (
    var date: LocalDate,
    val title: String,
    val tag: String,
    val content: String? = null,
    val location: String? = null,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0L
}