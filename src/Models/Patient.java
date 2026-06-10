package Models;

import java.time.LocalDate;

import Models.Base.User;
import Models.Enums.BloodType;
import Models.Hospital.ResidentialInfo.ResidentialInfo;

public class Patient extends User {

    private BloodType bloodType;
    private String diseaseDescription;
    
    public Patient(String _Name, LocalDate _BDate, ResidentialInfo _ResidentialInfo, String _UserName, String _Password,
            String diseaseDescription, BloodType bloodType)
    {
        super(_Name, _BDate, _ResidentialInfo, _UserName, _Password);
        this.diseaseDescription = diseaseDescription;
        this.bloodType = bloodType;
    }
    
    public String getDiseaseDescription() {
        return diseaseDescription;
    }
    public void setDiseaseDescription(String diseaseDescription) {
        this.diseaseDescription = diseaseDescription;
    }

}
