package com.jiiwon79.motteapp.core.plan.service

import com.jiiwon79.motteapp.core.plan.database.PlanEntity
import com.jiiwon79.motteapp.core.plan.database.PlanRepository
import com.jiiwon79.motteapp.core.plan.dto.CreatePlanDto
import org.springframework.stereotype.Service

interface PlanService {
    fun getPlan(): List<PlanEntity>
    fun createPlan(createPlanDto: CreatePlanDto): PlanEntity
}

@Service
class PlanServiceImpl(
    private val planRepository: PlanRepository
): PlanService {
    override fun getPlan(): List<PlanEntity> {
        return planRepository.findAll()
    }

    override fun createPlan(createPlanDto: CreatePlanDto): PlanEntity {
        val newPlan = PlanEntity(
            date = createPlanDto.date,
            title = createPlanDto.title,
            tag = createPlanDto.tag,
            content = createPlanDto.content,
            location = createPlanDto.location,
        )

        return planRepository.save(newPlan)
    }
}