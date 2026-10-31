package src.records;

public record EmployeeRecord(String name, Integer number) {
    public static final String DEFAULT_EMPLOYEE_NAME = "George";
    public String nameInUpperCase(){
        return this.name.toUpperCase();
    }

    public static void printWhatever(){
        System.out.println("whatever");
    }
}
