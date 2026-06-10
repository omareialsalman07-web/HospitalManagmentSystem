package Models.Hospital.MedicalProcedures;

import java.time.LocalDateTime;

public class LabTest extends MedicalProcedure {

    private String testName;

    public LabTest(LocalDateTime dateTime, String notes, String testName) {
        super(dateTime, notes);
        this.testName = testName;
    }

    public String getTestName() {
        return testName;
    }

    @Override
    public String getType() {
        return "LAB_TEST";
    }
}