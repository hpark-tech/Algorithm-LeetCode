SELECT patient_id, patient_name, conditions
FROM Patients
WHERE FIND_IN_SET('DIAB1', conditions) > 0 OR conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%' OR conditions LIKE '% DIAB1';
