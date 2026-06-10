package Services.Hospital;

import Models.Patient;
import Models.Hospital.Appointment;
import Services.PatientService;

public class AdmissionService {
    private final PatientService patientService;
    private final RoomService roomService;

    // Injected once at startup
    public AdmissionService(PatientService ps, RoomService rs) {
        this.patientService = ps;
        this.roomService = rs;
    }

    public void admit(String userName, Appointment appointment) throws Exception {
        Patient patient = patientService.findByUserName(userName);

        if(patient == null)
            throw new Exception("Patient is null");

        appointment.setAdmitted(true);
        roomService.AssignToRoom(appointment.getRoomId(), patient);
    }
}