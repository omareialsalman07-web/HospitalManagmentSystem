package Models.Employees;

import java.time.LocalDate;

import Models.Hopital.ResidentialInfo.ResidentialInfo;

public class Doctor extends Employee
{
    private String specialization;
    private String licenseNumber;

    public Doctor(
            String fullName,
            LocalDate birthDate,
            ResidentialInfo residentialInfo,
            String userName,
            String password,
            Contract contract,
            String specialization,
            String licenseNumber)
    {
        super(
                fullName,
                birthDate,
                residentialInfo,
                userName,
                password,
                contract);

        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }

    public String getLicenseNumber()
    {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber)
    {
        this.licenseNumber = licenseNumber;
    }
}