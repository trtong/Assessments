package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 10/12/2018.
 */
public enum LabStatus {

    COMPLETED("COMPLETED"),
    INCOMPLETE("INCOMPLETE"),
    PENDING("PENDING");

    private String value;

    LabStatus(String value) {
    }

    public String getValue (LabStatus l) {
        return value;
    }
}
