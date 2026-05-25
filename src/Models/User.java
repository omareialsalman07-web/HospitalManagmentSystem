package Models;

import java.time.LocalDate;
import Models.ResidentialInfo.ResidentialInfo;

public class User extends Person {
    private String _UserName;
    private String _Password;

    public User(String _Name, LocalDate _BDate, ResidentialInfo _ResidentialInfo, String _UserName, String _Password) {
        super(_Name, _BDate, _ResidentialInfo);
        this._UserName = _UserName;
        this._Password = _Password;
    }

    public String get_UserName() {
        return _UserName;
    }
    public void set_UserName(String _UserName) {
        this._UserName = _UserName;
    }
    
    public String get_Password() {
        return _Password;
    }
    public void set_Password(String _Password) {
        this._Password = _Password;
    }
    
}
