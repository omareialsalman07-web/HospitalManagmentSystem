package Models.Employees;

import java.time.LocalDate;

import Models.Base.User;
import Models.Hospital.ResidentialInfo.ResidentialInfo;

public class Employee extends User {
    protected Contract _Contract;

    public Employee(String _Name, LocalDate _BDate, ResidentialInfo _ResidentialInfo, String _UserName,
            String _Password, Contract _Contract) 
    {
        super(_Name, _BDate, _ResidentialInfo, _UserName, _Password);
        this._Contract = _Contract;
    }
    public Contract get_Contract() {
        return _Contract;
    }
    public void set_Contract(Contract _Contract) {
        this._Contract = _Contract;
    }
}
