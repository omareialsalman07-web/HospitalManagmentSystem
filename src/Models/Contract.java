package Models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Contract {

    private LocalDate startDate;
    private LocalDate endDate;
    private double salary;

    public Contract(LocalDate startDate, LocalDate endDate, double salary) {

        if (startDate == null) {
            throw new IllegalArgumentException("Start date is required.");
        }

        if (endDate != null && endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date cannot be before start date.");
        }

        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }

        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isActive() {
        LocalDate today = LocalDate.now();

        return !today.isBefore(startDate)
                && (endDate == null || !today.isAfter(endDate));
    }

    public boolean isExpired() {
        return endDate != null && endDate.isBefore(LocalDate.now());
    }

    public long getDurationInDays() {
        LocalDate effectiveEnd = (endDate != null)
                ? endDate
                : LocalDate.now();

        return ChronoUnit.DAYS.between(startDate, effectiveEnd);
    }
}