public class App 
{
    public static void main(String[] args) 
    {
        EmployeeManager employeeManager = new EmployeeManager();

        Employee employee1 = new Employee("Daniel Melo", "Cundinamarca");
        Employee employee2 = new PartTimeEmployee("Jorge Zuloaga", "Tolima");

        employeeManager.addEmployee(employee1);
        employeeManager.addEmployee(employee2);

        ISalaryCalculator salaryCalculator = new SimpleSalaryCalculator();
        
        System.out.println(employee1.getName() + "'s salary: " + salaryCalculator.calculateSalary(employee1));
        System.out.println(employee2.getName() + "'s salary: " + salaryCalculator.calculateSalary(employee2));

        ReportGenerator reportGenerator = new ReportGenerator(new PdfReport());
        reportGenerator.generateReport(employeeManager);
    }
}
