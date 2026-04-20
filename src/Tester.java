public class Tester extends Employee {
    private boolean automationTester;
    private int scenarioCount;

    private static final double AUTOMATION_BONUS = 1200.0;

    public Tester(String employeeId, String firstName, String lastName,
                  double baseSalary, boolean automationTester, int scenarioCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    public boolean isAutomationTester() {
        return automationTester;
    }

    public int getScenarioCount() {
        return scenarioCount;
    }

    @Override
    public double calculateMonthlyCost() {
        double cost = getBaseSalary() + (scenarioCount * 50.0);
        if (automationTester) {
            cost += AUTOMATION_BONUS;
        }
        return cost;
    }

    @Override
    public String introduceYourself() {
        String role = automationTester ? "an automation tester" : "a manual tester";
        return "Hi, I am " + getFirstName() + " " + getLastName()
                + ", " + role + " with " + scenarioCount + " test scenarios prepared.";
    }

    public void runTestingReport() {
        System.out.println("Testing report for " + getFirstName() + " " + getLastName() + ":");
        System.out.println("  Automation tester: " + automationTester);
        System.out.println("  Scenarios executed: " + scenarioCount);
    }

    @Override
    public String toString() {
        return "Tester{id=" + getEmployeeId() + ", name=" + getFirstName() + " " + getLastName()
                + ", baseSalary=" + getBaseSalary() + ", automationTester=" + automationTester
                + ", scenarioCount=" + scenarioCount + "}";
    }
}
