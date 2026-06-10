package Models.Hospital.MedicalProcedures;

import java.time.LocalDateTime;

public abstract class MedicalProcedure {

    private LocalDateTime dateTime;
    private String notes;

    public MedicalProcedure(LocalDateTime dateTime, String notes) {
        this.dateTime = dateTime;
        this.notes = notes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getNotes() {
        return notes;
    }

    public abstract String getType();
}