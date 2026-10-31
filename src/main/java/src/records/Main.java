package src.records;

public class Main {

    public static void main(String[] args) {
        EmployeeRecord er = new EmployeeRecord("Steve", 147852369);

        System.out.println(er.nameInUpperCase());
        EmployeeRecord.printWhatever();
        System.out.println(EmployeeRecord.DEFAULT_EMPLOYEE_NAME);
    }
}
