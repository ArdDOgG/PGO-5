import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    private ArrayList<Employee> employees;

    public ProjectTeam(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printTeamMembers() {
        System.out.println("=== Team members of project: " + projectName + " ===");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("===========================================");
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (Employee employee : employees) {
            total += employee.calculateMonthlyCost();
        }
        return total;
    }

    public Employee findById(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                return employee;
            }
        }
        return null;
    }

    public void printDevelopers() {
        System.out.println("--- Developers in the team ---");
        for (Employee employee : employees) {
            if (employee instanceof Developer) {
                Developer developer = (Developer) employee;
                developer.printTechnologies();
            }
        }
    }

    public void printAutomationTesters() {
        System.out.println("--- Automation testers in the team ---");
        for (Employee employee : employees) {
            if (employee instanceof Tester) {
                Tester tester = (Tester) employee;
                if (tester.isAutomationTester()) {
                    tester.runTestingReport();
                }
            }
        }
    }
}
