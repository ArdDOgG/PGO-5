public class Developer extends Employee {
    private String mainLanguage;
    private int repositoryCount;

    private static final double DEVELOPER_BONUS = 1500.0;

    public Developer(String employeeId, String firstName, String lastName,
                     double baseSalary, String mainLanguage, int repositoryCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public int getRepositoryCount() {
        return repositoryCount;
    }

    @Override
    public double calculateMonthlyCost() {
        return getBaseSalary() + DEVELOPER_BONUS + (repositoryCount * 200.0);
    }

    @Override
    public String introduceYourself() {
        return "Hi, I am " + getFirstName() + " " + getLastName()
                + ", a developer working mainly with " + mainLanguage + ".";
    }

    public void printTechnologies() {
        System.out.println(getFirstName() + " " + getLastName()
                + " works with " + mainLanguage + " and manages "
                + repositoryCount + " repositories.");
    }

    @Override
    public String toString() {
        return "Developer{id=" + getEmployeeId() + ", name=" + getFirstName() + " " + getLastName()
                + ", baseSalary=" + getBaseSalary() + ", mainLanguage=" + mainLanguage
                + ", repositoryCount=" + repositoryCount + "}";
    }
}
