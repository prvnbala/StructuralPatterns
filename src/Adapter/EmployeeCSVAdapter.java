package Adapter;

public class EmployeeCSVAdapter implements Employee{
    private EmployeeCSV instance;

    public EmployeeCSVAdapter(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getDetails().split(",")[0];
    }

    @Override
    public String getFirstName() {
        return instance.getDetails().split(",")[1];
    }

    @Override
    public String getLastName() {
        return instance.getDetails().split(",")[2];
    }

    @Override
    public String getEmail() {
        return instance.getDetails().split(",")[3];
    }
}
