package com.healthcare.appointmentservice.domain;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "appointment_slots",
       uniqueConstraints = @UniqueConstraint(name = "uk_doctor_slot", columnNames = {"doctor_id", "starts_at"}))
public class AppointmentSlot {
    @Id
    private UUID id;

    @Column(name = "doctor_id", nullable = false)
    private UUID doctorId;

    @Column(name = "starts_at", nullable = false)
    private Instant startsAt;

    @Column(nullable = false)
    private boolean booked;

    @Version
    private long version;

    protected AppointmentSlot() {}

    public UUID getId() { return id; }
    public UUID getDoctorId() { return doctorId; }
    public Instant getStartsAt() { return startsAt; }
    public boolean isBooked() { return booked; }
    public long getVersion() { return version; }
}
