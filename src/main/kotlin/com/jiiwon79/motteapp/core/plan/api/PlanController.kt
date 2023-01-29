package com.jiiwon79.motteapp.core.plan.api

import com.jiiwon79.motteapp.core.plan.database.PlanEntity
import com.jiiwon79.motteapp.core.plan.dto.CreatePlanDto
import com.jiiwon79.motteapp.core.plan.service.PlanService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/plan")
class PlanController(
    private val planService: PlanService
) {
    @GetMapping("")
    fun getPlan(): List<PlanEntity> {
        return planService.getPlan()
    }

    @PostMapping("")
    fun createPlan(
        @RequestBody createPlanDto: CreatePlanDto
    ): PlanEntity {
        return planService.createPlan(createPlanDto)
    }
}