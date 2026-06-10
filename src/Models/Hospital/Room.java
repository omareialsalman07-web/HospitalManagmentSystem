package Models.Hospital;

import Models.Patient;

public abstract class Room {
    private Section _Section;
    private int _ID;

    public Room(Section _Section, int _Number) {
        this._Section = _Section;
        this._ID = _Number;
    }

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _Number) {
        this._ID = _Number;
    }

    public Section get_Section() {
        return _Section;
    }

    public void set_Section(Section _Section) {
        this._Section = _Section;
    }

    public abstract void addPatient(Patient p) throws Exception;
    public abstract boolean isBlank();
    public abstract boolean isFull();
}
