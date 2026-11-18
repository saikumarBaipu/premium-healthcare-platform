# Phase 2: Security & Authentication


Scope:
- registration/login
- JWT access and refresh tokens
- token revocation
- password hashing
- RBAC: PATIENT, DOCTOR, ADMIN, SUPPORT
- resource-level authorization
- audit events
- rate limiting
Acceptance:
- unauthorized APIs return 401
- unauthorized resources return 403
- refresh rotation works
- sensitive fields never appear in logs
