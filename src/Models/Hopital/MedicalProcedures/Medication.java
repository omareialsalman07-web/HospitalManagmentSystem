package Models.Hopital.MedicalProcedures;

import java.time.LocalDateTime;

public class Medication extends MedicalProcedure {
    
    private String drugName;
    private String dosage;

    public Medication(LocalDateTime dateTime, String notes, String drugName, String dosage) {
        super(dateTime, notes);
        this.drugName = drugName;
        this.dosage = dosage;
    }

    public String getDrugName() {
        return drugName;
    }

    public String getDosage() {
        return dosage;
    }

    @Override
    public String getType() {
        return "MEDICATION";
    }
}