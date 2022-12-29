public class Main {
    public static void main(String[] args) {
        EmployeeAction.printAllEmployees();
        EmployeeAction.printSumSalary();
        System.out.println(EmployeeAction.searchEmployeeWithMaxSalary());
        System.out.println(EmployeeAction.searchEmployeeWithMinSalary());
        EmployeeAction.printFIOEmployees();
        EmployeeAction.printAverageValueSalaryEmployees();
        /**Повышенная сложность!*/
        EmployeeAction.indexingSalary(89);
        EmployeeAction.printAllEmployees();
        System.out.println("EmployeeAction.searchMinSalaryInDepartment(2) = " + EmployeeAction.searchMinSalaryInDepartment(2));
        System.out.println("EmployeeAction.searchMaxSalaryInDepartment(3) = " + EmployeeAction.searchMaxSalaryInDepartment(3));
        System.out.println("EmployeeAction.calculateSalaryInDepartment(5) = " + EmployeeAction.calculateSalaryInDepartment(5));
        System.out.println("EmployeeAction.calculateAverageValueSalaryEmployeeInDepartment(5) = " + EmployeeAction.calculateAverageValueSalaryEmployeeInDepartment(5));
        EmployeeAction.indexingSalaryInOneDepartment(20, 4);
        EmployeeAction.printAllEmployees();
        EmployeeAction.printEmployeesWithoutDepartmentInOneDepartment(5);
        EmployeeAction.printSalaryLessThen(50000);
        System.out.println();
        EmployeeAction.printSalaryMoreThen(50000);
        /**
         * Очень сложно
         */
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.createNewEmployee("Фёдоров", "Николай", "Алексеевич", 5, 50000);
        employeeBook.createNewEmployee("Кретова", "Елена", "Викторовна", 3, 20200);
        employeeBook.createNewEmployee("Васильева", "Нина", "Андреевна", 3, 20300);
        employeeBook.createNewEmployee("Савинов", "Кирил", "Олегович", 4, 30500);
        employeeBook.createNewEmployee("Резник", "Сергей", "Яковлевич", 4, 30600);
        employeeBook.createNewEmployee("Белов", "Анатолий", "Леонидович", 5, 70100);
        employeeBook.createNewEmployee("Белова", "Екатерина", "Александровна", 5, 70000);
        employeeBook.createNewEmployee( "Иванов", "Игорь", "Сергеевич", 1, 20100);
        employeeBook.createNewEmployee("Петров", "Алексей", "Евгеньевич", 1, 20000);


        employeeBook.printAllEmployeesForDepartment();
        employeeBook.printSalaryLessThen(30000);
        EmployeeAction.printAllEmployees();
        System.out.println(EmployeeAction.searchEmployeeWithMaxSalary());
        System.out.println(EmployeeAction.calculateAverageValueSalaryEmployees());


    }


}