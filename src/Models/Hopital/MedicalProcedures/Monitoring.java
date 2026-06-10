package Models.Hopital.MedicalProcedures;

import java.time.LocalDateTime;

public class Monitoring extends MedicalProcedure {
    
    private String measurementType;
    private double value;

    public Monitoring(LocalDateTime dateTime, String notes, String measurementType, double value) {
        super(dateTime, notes);
        this.measurementType = measurementType;
        this.value = value;
    }

    public String getMeasurementType() {
        return measurementType;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String getType() {
        return "MONITORING";
    }
}
