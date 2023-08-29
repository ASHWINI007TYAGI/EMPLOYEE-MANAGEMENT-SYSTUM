public class Employee
{
    private int id;
    private String Name;
    private String Address;
    private String Department;
    public Employee(int id,String Name, String Address, String Department)
    {
        this.id=id;
        this.Name=Name;
        this.Address=Address;
        this.Department=Department;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return Name;
    }
    public String getAddress()
    {
        return Address;
    }
    public String getDepartment()
    {
        return Department;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public void setAddress(String Address)
    {
        this.Address=Address;
    }
    public void setDepartment(String Department)
    {
        this.Department=Department;
    }
    public void setId(int id)
    {
        this.id=id;
    }
}
