public class EmployeeAction {

    public static void PrintAllEmployees() {
        for (Employee employee : EmployeeList.employees
        ) {
            System.out.println(employee);

        }
        System.out.println();

    }

    public static int calculateSalary() {
        int sumSalary = 0;
        for (Employee employee : EmployeeList.employees
        ) {
            sumSalary += employee.getSalary();

        }
        return sumSalary;


    }

    public static void printSumSalary() {
        System.out.println("Общая зарплата сотрудников равна: " + calculateSalary());
        System.out.println();
    }

    public static int searchMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : EmployeeList.employees
        ) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;

    }

    public static void printMinSalary() {
        System.out.println("Минимальная зарплата " + searchMinSalary());
        System.out.println();
    }

    public static int searchMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : EmployeeList.employees
        ) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public static void printMaxSalary() {
        System.out.println("Максимальная зарплата " + searchMaxSalary());
        System.out.println();
    }

    public static double calculateAverageValueSalaryEmployee() {
        double averrageValue = 0;
        for (Employee employee : EmployeeList.employees
        ) {
            averrageValue = (calculateSalary() / (double) EmployeeList.employees.length);
        }
        return averrageValue;
    }

    public static void printAverageValueSalaryEmployees() {
        System.out.printf("Средняя зарплата составляет: %.2f", calculateAverageValueSalaryEmployee());
        System.out.println();

    }


    public static void printFIOEmployees() {
        for (Employee employee : EmployeeList.employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
        System.out.println();
    }

    /**
     * Повышенная сложность!
     */
    public static void indexingSalary(int indexingValue) {
        int newSalary = 0;
        for (Employee employee : EmployeeList.employees
        ) {
            newSalary = employee.getSalary() + employee.getSalary() * indexingValue / 100;
            employee.setSalary(newSalary);
        }
    }

    public static int searchMinSalaryInDepartment(int numberDepartment) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : EmployeeList.employees
        ) {
            if (employee.getDepartment() != numberDepartment) {
                continue;
            }
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;

    }

    public static int searchMaxSalaryInDepartment(int numberDepartment) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : EmployeeList.employees
        ) {
            if (employee.getDepartment() != numberDepartment) {
                continue;
            }
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public static int calculateSalaryInDepartment(int numberDepartment) {
        int sumSalary = 0;
        for (Employee employee : EmployeeList.employees
        ) {
            if (employee.getDepartment() != numberDepartment) {
                continue;
            }
            sumSalary += employee.getSalary();

        }
        return sumSalary;
    }
    public static double calculateAverageValueSalaryEmployeeInDepartment(int numberDepartment) {
        double averrageValue = 0;
        int counterPeopleInDepartment=0;
        for (Employee employee : EmployeeList.employees
        ) {if (employee.getDepartment() != numberDepartment) {
            continue;
        }counterPeopleInDepartment++;
        }averrageValue=calculateSalaryInDepartment(numberDepartment)/(double)counterPeopleInDepartment;
        return averrageValue;
    }
    public static void indexingSalaryInOneDepartment(int indexingValue, int numberDepartment) {
        int newSalary = 0;
        for (Employee employee : EmployeeList.employees
        ) {if (employee.getDepartment() != numberDepartment) {
            continue;}
            newSalary = employee.getSalary() + employee.getSalary() * indexingValue / 100;
            employee.setSalary(newSalary);
        }
    }
}







