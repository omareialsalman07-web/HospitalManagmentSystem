package Models.Hospital;

import java.util.ArrayList;

import Models.Patient;

public class SharedRoom extends Room{
    private ArrayList<Patient> _Patients;
    private int _MaxCapicity = 4;

    public SharedRoom(Section _Section, int _Number, int _MaxCapicity) {
        super(_Section, _Number);
        this._Patients = new ArrayList<>();
        this._MaxCapicity = _MaxCapicity;
    }

    public ArrayList<Patient> get_Patients() {
        return _Patients;
    }

    /*public void set_Patients(ArrayList<Patient> _Patients) {
        this._Patients = _Patients;
    }*/

    public int get_MaxCapicity() {
        return _MaxCapicity;
    }

    @Override
    public void addPatient(Patient p) throws Exception {
        if (isFull()) throw new Exception("Room is full");
        _Patients.add(p);
    }

    @Override
    public boolean isBlank() {
        return _Patients.size() == 0;
    }

    @Override
    public boolean isFull() {
        return _Patients.size() >= 4;
    }
}
