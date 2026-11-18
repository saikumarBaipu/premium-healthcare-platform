package com.healthcare.appointmentservice.repository;

import com.healthcare.appointmentservice.domain.AppointmentSlot;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface AppointmentSlotRepository extends JpaRepository<AppointmentSlot, UUID> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("select s from AppointmentSlot s where s.id = :id")
    Optional<AppointmentSlot> findForUpdate(@Param("id") UUID id);
}
