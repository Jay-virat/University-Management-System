package university.management.system;

public class Faculty {
    private String name;
    private String id;
    private String department;
    private String qualification;

    public Faculty(String name, String id, String department, String qualification) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.qualification = qualification;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public String getDepartment() { return department; }
    public String getQualification() { return qualification; }

    @Override
    public String toString() {
        return name + " | " + id + " | " + department + " | " + qualification;
    }
}
