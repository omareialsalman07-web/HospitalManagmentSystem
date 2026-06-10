package Models.Employees;

import java.time.LocalDate;

import Models.Hospital.ResidentialInfo.ResidentialInfo;

public class Nurse extends Employee
{
    private String department;
    private String shift;

    public Nurse(
            String fullName,
            LocalDate birthDate,
            ResidentialInfo residentialInfo,
            String userName,
            String password,
            Contract contract,
            String department,
            String shift)
    {
        super(
                fullName,
                birthDate,
                residentialInfo,
                userName,
                password,
                contract);

        this.department = department;
        this.shift = shift;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getShift()
    {
        return shift;
    }

    public void setShift(String shift)
    {
        this.shift = shift;
    }
}