public class EmployeeAction {

    public static void printAllEmployees() {
        for (Employee employee : EmployeeList.employees
        ) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);

        }
        System.out.println();

    }

    public static int calculateSalary() {
        int sumSalary = 0;
        for (Employee employee : EmployeeList.employees
        ) {
            if (employee == null) {
                continue;
            }
            sumSalary += employee.getSalary();

        }
        return sumSalary;


    }

    public static void printSumSalary() {
        System.out.println("Общая зарплата сотрудников равна: " + calculateSalary());
        System.out.println();
    }

    public static String searchEmployeeWithMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        String employee2 = null;
        for (Employee employee : EmployeeList.employees
        ) {
            if (employee == null) {
                continue;
            }
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                employee2 = employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName();
            }
        }
        return employee2;

    }


    public static String searchEmployeeWithMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        String employee2 = null;
        for (Employee employee : EmployeeList.employees
        ) {
            if (employee == null) {
                continue;
            }
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                employee2 = employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName();
            }
        }
        return employee2;
    }


    public static double calculateAverageValueSalaryEmployees() {
        double averrageValue = 0;
        double quantityOfEmployees = 0;
        for (int i = 0; i < EmployeeList.employees.length; i++) {
            if (EmployeeList.employees[i]==null){continue;}
            quantityOfEmployees++;
        }
        averrageValue = calculateSalary() / quantityOfEmployees;
        return averrageValue;
    }

    public static void printAverageValueSalaryEmployees() {
        System.out.printf("Средняя зарплата составляет: %.2f", calculateAverageValueSalaryEmployees());
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
        ) {if (employee==null){continue;}
            newSalary = employee.getSalary() + employee.getSalary() * indexingValue / 100;
            employee.setSalary(newSalary);
        }
    }

    public static int searchMinSalaryInDepartment(int numberDepartment) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : EmployeeList.employees
        ) {if (employee==null){continue;}
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
        ) {if (employee==null){continue;}
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
        ) {if (employee==null){continue;}
            if (employee.getDepartment() != numberDepartment) {
                continue;
            }
            sumSalary += employee.getSalary();

        }
        return sumSalary;
    }

    public static double calculateAverageValueSalaryEmployeeInDepartment(int numberDepartment) {
        double averrageValue = 0;
        int counterPeopleInDepartment = 0;
        for (Employee employee : EmployeeList.employees
        ) {if (employee==null){continue;}
            if (employee.getDepartment() != numberDepartment) {
                continue;
            }
            counterPeopleInDepartment++;
        }
        averrageValue = calculateSalaryInDepartment(numberDepartment) / (double) counterPeopleInDepartment;
        return averrageValue;
    }

    public static void indexingSalaryInOneDepartment(int indexingValue, int numberDepartment) {
        int newSalary = 0;
        for (Employee employee : EmployeeList.employees
        ) {if (employee==null){continue;}
            if (employee.getDepartment() != numberDepartment) {
                continue;
            }
            newSalary = employee.getSalary() + employee.getSalary() * indexingValue / 100;
            employee.setSalary(newSalary);
        }
    }


    public static void printEmployeesWithoutDepartmentInOneDepartment(int numberDepartment) {
        for (Employee employee : EmployeeList.employees
        ) {if (employee==null){continue;}
            if (employee.getDepartment() != numberDepartment) {
                continue;

            }
            System.out.println(employee.getId() + " Сотрудник ФИО:" + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " " + "Зарплата: " + employee.getSalary());
        }
    }

    public static void printSalaryLessThen(int salary) {
        for (Employee employee : EmployeeList.employees
        ) {if (employee==null){continue;}
            if (employee.getSalary() < salary) {
                System.out.println(employee.getId() + " Сотрудник ФИО:" + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " " + "Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void printSalaryMoreThen(int salary) {
        for (Employee employee : EmployeeList.employees
        ) {if (employee==null){continue;}
            if (employee.getSalary() >= salary) {
                System.out.println(employee.getId() + " Сотрудник ФИО:" + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " " + "Зарплата: " + employee.getSalary());
            }
        }
    }
    /**
     * Очень сложно!!!
     */

}







