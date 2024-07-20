public interface IEmployeeOperations 
{
    void addEmployee(Employee employee);
    void removeEmployee(String name);
    Employee getEmployee(String name);
}