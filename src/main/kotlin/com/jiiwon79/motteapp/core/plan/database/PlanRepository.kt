package com.jiiwon79.motteapp.core.plan.database

import org.springframework.data.jpa.repository.JpaRepository

interface PlanRepository: JpaRepository<PlanEntity, Long>