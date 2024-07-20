public class PdfReport implements IReportsFormat 
{
    @Override
    public void generate(EmployeeManager employeeManager) 
    {
       System.out.println("Generating PDF report");
    }
}
