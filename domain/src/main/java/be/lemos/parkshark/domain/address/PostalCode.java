package be.lemos.parkshark.domain.address;

public class PostalCode {

    private int postalCode;
    private String postalCodeLabel;

    public PostalCode() {
    }

    public PostalCode(int postalCode, String postalCodeLabel) {
        this.postalCode = postalCode;
        this.postalCodeLabel = postalCodeLabel;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getPostalCodeLabel() {
        return postalCodeLabel;
    }
}
