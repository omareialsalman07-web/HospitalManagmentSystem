package Models.Base;

import java.time.LocalDate;
import java.time.Period;

import Models.Hospital.ResidentialInfo.ResidentialInfo;

public class Person {
    private String _FullName;
    private LocalDate _BDate;
    private int _Age;
    private ResidentialInfo _ResidentialInfo;

    public Person(String _Name, LocalDate _BDate, ResidentialInfo _ResidentialInfo) {
        this._FullName = _Name;
        this._BDate = _BDate;
        this._ResidentialInfo = _ResidentialInfo;
        _UpdateAge();
    }
    public String get_FullName() {
        return _FullName;
    }
    public void set_FullName(String _Name) {
        this._FullName = _Name;
    }

    public LocalDate get_BDate() {
        return _BDate;
    }
    public void set_BDate(LocalDate _BDate) {
        this._BDate = _BDate;
    }

    public int get_Age() {
        return _Age;
    }
    private void _UpdateAge(){
        _Age = Period.between(_BDate, LocalDate.now()).getYears();
    }
    
    public ResidentialInfo get_ResidentialInfo() {
        return _ResidentialInfo;
    }
    public void set_ResidentialInfo(ResidentialInfo _ResidentialInfo) {
        this._ResidentialInfo = _ResidentialInfo;
    }

    
}