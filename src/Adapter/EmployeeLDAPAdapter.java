package Adapter;

public class EmployeeLDAPAdapter implements Employee{
    private EmployeeLDAP instance;

    public EmployeeLDAPAdapter(EmployeeLDAP employeeLDAP) {
        this.instance = employeeLDAP;
    }

    @Override
    public String getId() {
        return instance.geteId();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMailId();
    }
}
