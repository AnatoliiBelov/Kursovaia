public class Main {
    public static void main(String[] args) {
        EmployeeAction.PrintAllEmployees();
        EmployeeAction.printSumSalary();
        EmployeeAction.printMinSalary();
        EmployeeAction.printMaxSalary();
        EmployeeAction.printFIOEmployees();
        EmployeeAction.printAverageValueSalaryEmployees();
        /**Повышенная сложность!*/
        EmployeeAction.indexingSalary(89);
        EmployeeAction.PrintAllEmployees();
        System.out.println("EmployeeAction.searchMinSalaryInDepartment(2) = " + EmployeeAction.searchMinSalaryInDepartment(2));
        System.out.println("EmployeeAction.searchMaxSalaryInDepartment(3) = " + EmployeeAction.searchMaxSalaryInDepartment(3));
        System.out.println("EmployeeAction.calculateSalaryInDepartment(5) = " + EmployeeAction.calculateSalaryInDepartment(5));
        System.out.println("EmployeeAction.calculateAverageValueSalaryEmployeeInDepartment(5) = " + EmployeeAction.calculateAverageValueSalaryEmployeeInDepartment(5));
EmployeeAction.indexingSalaryInOneDepartment(20,4);
EmployeeAction.PrintAllEmployees();
EmployeeAction.printEmployeesWithoutDepartmentInOneDepartment(5);
    EmployeeAction.PrintSalaryLessThen(50000);
        System.out.println();
    EmployeeAction.PrintSalaryMoreThen(50000);
    }


}