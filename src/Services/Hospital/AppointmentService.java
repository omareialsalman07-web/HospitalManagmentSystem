package Services.Hospital;

import java.util.ArrayList;

import Models.Hospital.Appointment;

public class AppointmentService {
    ArrayList<Appointment> appointments;

    public AppointmentService()
    {
        load();
    }

    public boolean add(Appointment appointment){
        if(appointment != null)
        {
            appointments.add(appointment);
            return true;
        }

        return false;
    }

    public Appointment findAppoitment(String appointmentId)
    {
        for(Appointment ap : appointments)
        {
            if(ap.getAppointmentId().equals(appointmentId)) return ap;
        }

        return null;
    }

    private void load()
    {
        appointments = new ArrayList<>();
    }
}
