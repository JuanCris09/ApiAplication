ALTER TABLE pacientes
    DROP COLUMN urbanización,
    DROP COLUMN codigoPostal,
    DROP COLUMN provincia,
    ADD COLUMN calle VARCHAR(100) NOT NULL AFTER telefono;