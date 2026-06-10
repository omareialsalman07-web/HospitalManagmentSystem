package Services;

import java.util.ArrayList;

import Models.Patient;

public class PatientService {
    
    private ArrayList<Patient> patients;

    public PatientService()
    {
        load();
    }

    public boolean add(Patient patient)
    {
        if(patient != null){
            patients.add(patient);
            return true;
        }
        
        return false;
    }

    public Patient findByUserName(String userName)
    {
        for(Patient p : patients)
        {
            if(p.get_UserName().equals(userName))
            {
                return p;
            }
        }

        return null;
    }

    private void load()
    {
        // load patients from file
        patients = new ArrayList<>();
    }
}
