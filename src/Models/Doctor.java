package Models;

import java.time.LocalDate;
import java.util.ArrayList;

import Models.ResidentialInfo.ResidentialInfo;

public class Doctor extends Employee {
    private ArrayList<Patient> _Patients;

   

    public Doctor(String _Name, LocalDate _BDate, ResidentialInfo _ResidentialInfo, String _UserName, String _Password,
            Contract _Contract) 
    {
        super(_Name, _BDate, _ResidentialInfo, _UserName, _Password, _Contract);
        this._Patients = new ArrayList<>();
    }

    public ArrayList<Patient> get_Patients() {
        return _Patients;
    }
}
