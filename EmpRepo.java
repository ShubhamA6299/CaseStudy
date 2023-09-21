import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpRepo {
    private List<Emp> empList;

    public EmpRepo() {
        empList = new ArrayList<>();
    }

    public void addEmp(Emp emp) {
        empList.add(emp);
    }

    public Emp findByEmpId(int empId) throws RuntimeException {
    	Optional<Emp> emp = empList.stream()
                .filter(e -> e.getEmpId() == empId)
                .findAny();
        return emp.orElseThrow(()->new RuntimeException("Emp Not Found!"));
    }

    public Emp empUpdate(Emp emp, int empId) {
        Emp old = findByEmpId(empId);
        old.setEmpId(emp.getEmpId());
        old.setCity(emp.getCity());
        old.setDesignation(emp.getDesignation());
        old.setEmpName(emp.getEmpName());
        old.setSalary(emp.getSalary());
        return emp;
    }
    
    public List<Emp> findAll() 
    {
    	return empList;
    }
    
    public List<Emp> findByDesg(String desg)
    {
    	return empList.stream()
    			.filter(e -> e.getDesignation().equalsIgnoreCase(desg))
    			.collect(Collectors.toList());
    }
    
    public List<Emp> findByCity(String city)
    {
    	return empList.stream()
    			.filter(e -> e.getCity().equalsIgnoreCase(city))
    			.collect(Collectors.toList());
    }
    
    public void delete(int empId)
    {
    	Emp emp = findByEmpId(empId);
    	empList.remove(emp);
    }

    public void displayAllEmps() {
        empList.forEach(System.out::println);
    }
}
