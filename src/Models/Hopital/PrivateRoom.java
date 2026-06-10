package Models.Hopital;

import Models.Patient;

public class PrivateRoom extends Room {
    
    private Patient _Patient;

    public PrivateRoom(Section _Section, int _Number, Patient _Patient) {
        super(_Section, _Number);
        this._Patient = _Patient;
    }

    public Patient get_Patient() {
        return _Patient;
    }

    public void set_Patient(Patient _Patient) {
        this._Patient = _Patient;
    }

    @Override
    public boolean isBlank() {
        return _Patient == null;
    }

    @Override
    public boolean isFull() {
        return _Patient != null;
    }
}
