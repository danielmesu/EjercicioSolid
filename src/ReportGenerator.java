public class ReportGenerator 
{
    private IReportsFormat reportFormat;

    public ReportGenerator(IReportsFormat reportFormat) 
    {
        this.reportFormat = reportFormat;
    }

    public void generateReport(EmployeeManager employeeManager) 
    {
        reportFormat.generate(employeeManager);
    }
}
