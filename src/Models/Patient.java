package Models;

import java.time.LocalDate;
import java.util.ArrayList;

import Models.MedicalProcedures.MedicalProcedure;
import Models.ResidentialInfo.ResidentialInfo;

public class Patient extends User {
    private Appointment _Appointment;
    private Doctor _Doctor;
    private ArrayList<MedicalProcedure> _MedicalProcedure;
    private Room room;
    private String diseaseDescription;
    
    
    
    public Patient(String _Name, LocalDate _BDate, ResidentialInfo _ResidentialInfo, String _UserName, String _Password,
            Appointment _Appointment, Doctor _Doctor, Room room,
            String diseaseDescription)
    {
        super(_Name, _BDate, _ResidentialInfo, _UserName, _Password);
        this._Appointment = _Appointment;
        this._Doctor = _Doctor;
        this._MedicalProcedure = new ArrayList<>();
        this.room = room;
        this.diseaseDescription = diseaseDescription;
    }
    public Appointment get_Appointment() {
        return _Appointment;
    }
    public void set_Appointment(Appointment _Appointment) {
        this._Appointment = _Appointment;
    }
    public Doctor get_Doctor() {
        return _Doctor;
    }
    public void set_Doctor(Doctor _Doctor) {
        this._Doctor = _Doctor;
    }
    
    public ArrayList<MedicalProcedure> get_MedicalProcedure() {
        return _MedicalProcedure;
    }

    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public String getDiseaseDescription() {
        return diseaseDescription;
    }
    public void setDiseaseDescription(String diseaseDescription) {
        this.diseaseDescription = diseaseDescription;
    }

}
