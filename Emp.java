

public class Emp {
    private int empId;
    private String empName;
    private String designation;
    private String city;
    private int salary;

    public Emp(int empId, String empName, String designation, String city, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.city = city;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", city=" + city
                + ", salary=" + salary + "]";
    }
}
