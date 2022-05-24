
public class Totalworkinghour {

    public void Totalworkinghour() {
        int hour = 100;
        int wage = 20;
        System.out.println("Wages for employee working 100 hrs : " +(hour * wage));

    }

    void Totalworkingdays() {
        int hour = 8;
        int wage = 20;
        int monthly = (hour * wage * 20);
        System.out.println("20 days Wage of an Employee: " +(monthly));
    }

    public static void main(String[] args) {
        Totalworkinghour employee = new Totalworkinghour();
        employee.Totalworkinghour();
        employee.Totalworkingdays();
    }
}
