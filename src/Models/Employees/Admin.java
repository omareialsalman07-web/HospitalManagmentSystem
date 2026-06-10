package Models.Employees;

import java.time.LocalDate;

import Models.Hospital.ResidentialInfo.ResidentialInfo;

public final class Admin extends Employee
{
    public Admin(
            String fullName,
            LocalDate birthDate,
            ResidentialInfo residentialInfo,
            String userName,
            String password,
            Contract contract)
    {
        super(
                fullName,
                birthDate,
                residentialInfo,
                userName,
                password,
                contract);
    }
}