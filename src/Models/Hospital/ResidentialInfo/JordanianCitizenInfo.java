package Models.Hospital.ResidentialInfo;

class JordanianCitizenInfo implements ResidentialInfo {
    private String nationalNumber;
    private String idCardNumber;

    public JordanianCitizenInfo(String nationalNumber, String idCardNumber) {
        this.nationalNumber = nationalNumber;
        this.idCardNumber = idCardNumber;
    }

    @Override
    public void validate() {

        if (nationalNumber == null || nationalNumber.isBlank()) {
            throw new IllegalArgumentException("National number is required.");
        }

        if (idCardNumber == null || idCardNumber.isBlank()) {
            throw new IllegalArgumentException("ID card number is required.");
        }
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }
}