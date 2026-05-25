package Models;

import java.time.LocalDateTime;

public class Appointment {

    private LocalDateTime dateTime;

    public Appointment(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isEnded() {
        return dateTime.isBefore(LocalDateTime.now());
    }
}