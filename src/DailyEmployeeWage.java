public class DailyEmployeeWage{

    public DailyEmployeeWage() {
    }

    void employeewage() {
        int wageperhour = 20;
        int fulldayhour = 8;
        System.out.println("daily wage of employee :"+(wageperhour *  fulldayhour));
    }

    public static void main(String[] args) {

        DailyEmployeeWage employee = new DailyEmployeeWage();
        employee.employeewage();
    }
}
