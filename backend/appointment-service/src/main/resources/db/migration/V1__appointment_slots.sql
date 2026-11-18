CREATE TABLE appointment_slots (
    id BINARY(16) NOT NULL PRIMARY KEY,
    doctor_id BINARY(16) NOT NULL,
    starts_at TIMESTAMP(6) NOT NULL,
    booked BOOLEAN NOT NULL DEFAULT FALSE,
    version BIGINT NOT NULL DEFAULT 0,
    created_at TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    updated_at TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    CONSTRAINT uk_doctor_slot UNIQUE (doctor_id, starts_at),
    INDEX idx_slot_doctor_time (doctor_id, starts_at)
);
