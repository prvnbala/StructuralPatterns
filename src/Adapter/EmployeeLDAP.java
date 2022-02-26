package Adapter;

public class EmployeeLDAP {
    private String eId;
    private String surname;
    private String givenName;
    private String mailId;

    public EmployeeLDAP(String eId, String surname, String givenName, String mailId) {
        this.eId = eId;
        this.surname = surname;
        this.givenName = givenName;
        this.mailId = mailId;
    }

    public String geteId() {
        return eId;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMailId() {
        return mailId;
    }
}
