package Models;

import java.time.LocalDate;
import Models.ResidentialInfo.ResidentialInfo;

public class Employee extends User {
    private Contract _Contract;

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
