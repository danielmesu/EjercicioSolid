public class EmployeeManager implements IEmployeeOperations 
{
    @Override
    public void addEmployee(Employee employee)
    {
        System.out.println("Adding new employee. Name: " + employee.getName());
    }

    @Override
    public void removeEmployee(String name)
    {
        System.out.println("Removing an employee. Name: " + name);
    }

    @Override
    public Employee getEmployee(String name)
    {
        System.out.println("Getting an employee. Name: " + name);
        return new Employee(name, "");
    }
}