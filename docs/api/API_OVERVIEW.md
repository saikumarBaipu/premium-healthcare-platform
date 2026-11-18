# API Overview

Base path: /api/v1

POST /auth/register
POST /auth/login
POST /auth/refresh
GET  /doctors
GET  /doctors/{id}
GET  /doctors/{id}/availability
POST /appointments
GET  /appointments
PATCH /appointments/{id}
POST /consultations/{id}/start
POST /prescriptions
GET  /medical-records
POST /payments
POST /payments/webhook

All endpoints use DTOs, validation, structured errors, authorization, correlation IDs and OpenAPI documentation.
