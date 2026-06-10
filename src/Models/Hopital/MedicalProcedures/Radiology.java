package Models.Hopital.MedicalProcedures;

import java.time.LocalDateTime;

public class Radiology extends MedicalProcedure {

    private String scanType;

    public Radiology(LocalDateTime dateTime, String notes, String scanType) {
        super(dateTime, notes);
        this.scanType = scanType;
    }
    
    public String getScanType() {
        return scanType;
    }

    @Override
    public String getType() {
        return "RADIOLOGY";
    }
}