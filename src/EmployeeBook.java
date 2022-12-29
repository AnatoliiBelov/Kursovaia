public class EmployeeBook {
    private final int departmentNumbers = 5;
    private static final Integer EMPLOYEES_SIZE = 10;

    private Employee[] employees1 = new Employee[EMPLOYEES_SIZE];

    public void printAllEmployees() {
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            System.out.println(employee);

        }
        System.out.println();

    }

    public int calculateSalary() {
        int sumSalary = 0;
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            sumSalary += employee.getSalary();

        }
        return sumSalary;


    }

    public void printSumSalary() {
        System.out.println("Общая зарплата сотрудников равна: " + calculateSalary());
        System.out.println();
    }

    public String searchEmployeeWithMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        String employee2=null;
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                employee2=employee.getLastName()+" "+employee.getFirstName()+" "+employee.getMiddleName();
            }
        }
        return employee2;

    }

    public void printMinSalary() {
        System.out.println("Минимальная зарплата " + searchEmployeeWithMinSalary());
        System.out.println();
    }

    public String searchEmployeeWithMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        String employee2= null;
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                employee2=employee.getLastName()+" "+employee.getFirstName()+" "+employee.getMiddleName();
            }
        }
        return employee2;
    }

    public void printMaxSalary() {
        System.out.println("Максимальная зарплата " + searchEmployeeWithMaxSalary());
        System.out.println();
    }

    public double calculateAverageValueSalaryEmployee() {
        double averrageValue = 0;
        double quantityOfEmployees=0;
        for (int i = 0; i < employees1.length; i++) {
            if (employees1==null){continue;}
            quantityOfEmployees++;
        }
        averrageValue=calculateSalary()/quantityOfEmployees;
        return averrageValue;
    }

    public void printAverageValueSalaryEmployees() {
        System.out.printf("Средняя зарплата составляет: %.2f", calculateAverageValueSalaryEmployee());
        System.out.println();

    }


    public void printFIOEmployees() {
        for (Employee employee : employees1) {
            if (employee==null){continue;}
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
        System.out.println();
    }


    public void indexingSalary(int indexingValue) {
        int newSalary = 0;
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            newSalary = employee.getSalary() + employee.getSalary() * indexingValue / 100;
            employee.setSalary(newSalary);
        }
    }

    public String searchEmployeeWithMinSalaryInDepartment(int numberDepartment) {
        int minSalary = Integer.MAX_VALUE;
        String employee2=null;
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            if (employee.getDepartment() != numberDepartment) {
                continue;
            }
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                employee2=employee.getLastName()+" "+employee.getFirstName()+" "+employee.getMiddleName();
            }
        }
        return employee2;

    }

    public String searchEmployeeWithMaxSalaryInDepartment(int numberDepartment) {
        int maxSalary = Integer.MIN_VALUE;
        String employee2=null;
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            if (employee.getDepartment() != numberDepartment) {
                continue;
            }
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                employee2=employee.getLastName()+" "+employee.getFirstName()+" "+employee.getMiddleName();
            }
        }
        return employee2;
    }

    public int calculateSalaryInDepartment(int numberDepartment) {
        int sumSalary = 0;
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            if (employee.getDepartment() != numberDepartment) {
                continue;
            }
            sumSalary += employee.getSalary();

        }
        return sumSalary;
    }

    public double calculateAverageValueSalaryEmployeeInDepartment(int numberDepartment) {
        double averrageValue = 0;
        int counterPeopleInDepartment = 0;
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            if (employee.getDepartment() != numberDepartment) {
                continue;
            }
            counterPeopleInDepartment++;
        }
        averrageValue = calculateSalaryInDepartment(numberDepartment) / (double) counterPeopleInDepartment;
        return averrageValue;
    }

    public void indexingSalaryInOneDepartment(int indexingValue, int numberDepartment) {
        int newSalary = 0;
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            if (employee.getDepartment() != numberDepartment) {
                continue;
            }
            newSalary = employee.getSalary() + employee.getSalary() * indexingValue / 100;
            employee.setSalary(newSalary);
        }
    }


    public void printEmployeesWithoutDepartmentInOneDepartment(int numberDepartment) {
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            if (employee.getDepartment() != numberDepartment) {
                continue;

            }
            System.out.println(employee.getId() + " Сотрудник ФИО:" + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " " + "Зарплата: " + employee.getSalary());
        }
    }

    public void printSalaryLessThen(int salary) {
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            if (employee.getSalary() < salary) {
                System.out.println(employee.getId() + " Сотрудник ФИО:" + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " " + "Зарплата: " + employee.getSalary());
            }
        }
    }

    public void printSalaryMoreThen(int salary) {
        for (Employee employee : employees1
        ) {if (employee==null){continue;}
            if (employee.getSalary() >= salary) {
                System.out.println(employee.getId() + " Сотрудник ФИО:" + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " " + "Зарплата: " + employee.getSalary());
            }
        }
    }

    public int findFreeIndex() {
        for (int i = 0; i < employees1.length; i++) {
            if (employees1[i] == null) {
                return i;
            }
        }
        return -5;
    }

    public void createNewEmployee(String lastName, String firstName, String middleName, int departmentNumber, int salary) {
        int index = findFreeIndex();
        if (index == -5) {
            System.out.println("В хранилище данных нет мест");
        } else employees1[index] = new Employee(lastName, firstName, middleName, departmentNumber, salary);
    }

    public void deleteEmployeeForId(int idNumber) {
        for (Employee employees : employees1
        ) {if (employees==null){continue;}
            for (int i = 0; i < employees1.length; i++) {


                if (employees.getId() == idNumber) {
                    employees1[i] = null;
                }
            }
        }
    }

    public void deleteEmployeeForFullName(String lastName, String firstName, String middleName) {
        for (Employee employees : employees1
        ) {if (employees==null){continue;}
            for (int i = 0; i < employees1.length; i++) {
                if (employees.getLastName() == lastName && employees.getFirstName() == firstName && employees.getMiddleName() == middleName) {
                    employees1[i] = null;
                }
            }

        }
    }

    public void setSalaryForFullName(String lastName, String firstName, String middleName, int newSalary) {
        for (Employee employees : employees1
        ) {if (employees==null){continue;}
            for (int i = 0; i < employees1.length; i++) {
                if (employees.getLastName() == lastName && employees.getFirstName() == firstName && employees.getMiddleName() == middleName) {
                    employees1[i].setSalary(newSalary);
                }
            }
        }
    }

    public void setDepartmentForFullName(String lastName, String firstName, String middleName, int newDepartment) {
        for (Employee employees : employees1
        ) {if (employees==null){continue;}
            if (employees != null) {
                for (int i = 0; i < employees1.length; i++) {
                    if (employees.getLastName() == lastName && employees.getFirstName() == firstName && employees.getMiddleName() == middleName) {
                        employees1[i].setDepartment(newDepartment);
                    }
                }
            }
        }
    }



    public void printAllEmployeesForDepartment() {

        for (int i = 1; i <= departmentNumbers; i++) {
            System.out.println("Отдел " + i + ":");
            for (Employee employees : employees1
            ) {if (employees==null){continue;}
                if (employees.getDepartment() == i) {
                    System.out.println(employees.getLastName()+" "+employees.getFirstName()+" "+employees.getMiddleName());
                }

            }

        }}



}



