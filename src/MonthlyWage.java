public class MonthlyWage {


    public void EmployeeWage() {
        int hour = 8;
        int wage = 20;
        int monthly = (hour*wage*20);
        System.out.println("Monthly Wage of an Employee: "+monthly);
    }

    public static void main(String[] args) {

        MonthlyWage employee = new MonthlyWage();
        employee.EmployeeWage();
    }


}