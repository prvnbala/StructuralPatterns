package Adapter;

public class EmployeeDBAdapter implements Employee{
    private EmployeeDB instance;
    public EmployeeDBAdapter(EmployeeDB instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getfName();
    }

    @Override
    public String getLastName() {
        return instance.getlName();
    }

    @Override
    public String getEmail() {
        return instance.getEmail();
    }
}
