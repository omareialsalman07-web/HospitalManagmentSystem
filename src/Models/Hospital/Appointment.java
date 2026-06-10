package Models.Hospital;

import Models.Patient;
import Models.Employees.Doctor;
import java.time.LocalDateTime;

public class Appointment {
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private int roomId;
    private LocalDateTime appointmentTime;
    private boolean isAdmitted;

    // Constructor
    public Appointment(String appointmentId, Patient patient, Doctor doctor, int roomId, LocalDateTime appointmentTime) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.roomId = roomId;
        this.appointmentTime = appointmentTime;
        this.isAdmitted = false; // Default state
    }

    // Getters and Setters
    public String getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public boolean isAdmitted() {
        return isAdmitted;
    }

    public boolean isEnded() {
        return appointmentTime.isBefore(LocalDateTime.now());
    }

    public void setAdmitted(boolean admitted) {
        isAdmitted = admitted;
    }
}