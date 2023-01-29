package com.jiiwon79.motteapp.core.plan.dto

import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate

data class CreatePlanDto (
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    val date: LocalDate,
    val title: String,
    val tag: String,
    val content: String? = null,
    val location: String? = null,
)