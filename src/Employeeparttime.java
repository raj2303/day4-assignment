public class Employeeparttime {

    public void employeeparttime(){

        int wageperhour = 20;
        int parttimehour = 8;
        int i = (wageperhour*parttimehour*8);
        System.out.println("part time employee & wage :" +(wageperhour*parttimehour*8));

    }
    public static void main(String[] args) {
        Employeeparttime employee = new Employeeparttime();
        employee.employeeparttime();
    }
}
