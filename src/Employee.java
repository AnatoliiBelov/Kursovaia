public class Employee {
    private String lastName;
    private String firstName;
    private String middleName;
    private int department;
    private int salary;
    private final int  id;
    private int counter = 1;

    public Employee(String lastName, String firstName, String middleName, int department, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id+" Сотрудник ФИО:" +lastName+" "+firstName+" "+middleName+" "+ "Департамент: "+department+" "+"Зарплата: "+salary;
    }




}
