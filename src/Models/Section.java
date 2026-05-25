package Models;

import java.util.ArrayList;

public class Section {
    private String _Name;
    private String _Description;
    private ArrayList<Room> _Rooms;

    public String get_Name() {
        return _Name;
    }

    public Section(String _Name, String _Description) {
        this._Name = _Name;
        this._Description = _Description;
        this._Rooms = new ArrayList<>();
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public String get_Description() {
        return _Description;
    }

    public void set_Description(String _Description) {
        this._Description = _Description;
    }

    public ArrayList<Room> get_Rooms() {
        return _Rooms;
    }
}