import java.util.ArrayList;
import java.util.List;

public class Management
{
    private List<Employee> Employees;
    public Management()
    {
        Employees=new ArrayList<>();
    }
    public void addEmployee(Employee employee)
    {
        Employees.add(employee);
    }
    public void displayAll()
    {
        for (int i =0;i<Employees.size();i++)
        {
            Employee e=Employees.get(i);
            System.out.println(e.getId());
            System.out.println(e.getName());
            System.out.println(e.getAddress());
            System.out.println(e.getDepartment());
        }
    }
    public void deleteEmployee(int id) {
        Employee employeeToDelete = null;
        for (int i = 0; i < Employees.size(); i++) {
            Employee employee = Employees.get(i);
            if (employee.getId() == id) {
                employeeToDelete = employee;
                break;
            }
        }

        if (employeeToDelete != null) {
            Employees.remove(employeeToDelete);
            System.out.println("Employee deleted: " + employeeToDelete.getName());
        } else {
            System.out.println("Employee not found with ID: " + id);
        }
    }


}
