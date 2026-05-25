package Models.ResidentialInfo;

class NonJordanianResidentInfo implements ResidentialInfo {
    private String residenceNumber;
    private String nationality;

    public NonJordanianResidentInfo(String residenceNumber, String nationality) {
        this.residenceNumber = residenceNumber;
        this.nationality = nationality;
    }

    @Override
    public void validate() {

        if (residenceNumber == null || residenceNumber.isBlank()) {
            throw new IllegalArgumentException("Residence number is required.");
        }

        if (nationality == null || nationality.isBlank()) {
            throw new IllegalArgumentException("Nationality is required.");
        }
    }

    public String getResidenceNumber() {
        return residenceNumber;
    }

    public String getNationality() {
        return nationality;
    }
}