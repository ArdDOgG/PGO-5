public class Main {
    public static void main(String[] args) {
        ProjectTeam team = new ProjectTeam("Campus App");

        Employee e1 = new Developer("E-101", "Arda", "Gavas", 12000.0, "Java", 4);
        Employee e2 = new Tester("E-201", "Peter", "Griffin", 9800.0, true, 25);
        Employee e3 = new Developer("E-102", "Charles", "Oliveira", 11500.0, "C#", 3);
        Employee e4 = new Tester("E-202", "Jason", "Statham", 8500.0, false, 15);

        team.addEmployee(e1);
        team.addEmployee(e2);
        team.addEmployee(e3);
        team.addEmployee(e4);

        team.printTeamMembers();
        System.out.println("Total team cost: " + team.calculateTotalCost());
        System.out.println();

        System.out.println(e1.introduceYourself());
        System.out.println(e2.introduceYourself());
        System.out.println(e3.introduceYourself());
        System.out.println(e4.introduceYourself());
        System.out.println();

        if (e1 instanceof Developer) {
            Developer developer = (Developer) e1;
            developer.printTechnologies();
        }
        System.out.println();

        team.printDevelopers();
        System.out.println();
        team.printAutomationTesters();
        System.out.println();

        Employee found = team.findById("E-102");
        if (found != null) {
            System.out.println("Found by ID: " + found);
        }
        System.out.println();

        Employee duplicateTester = new Tester("E-201", "Other", "Data", 9000.0, false, 10);
        System.out.println("Are e2 and duplicateTester equal? " + e2.equals(duplicateTester));
        System.out.println("Are e1 and e3 equal? " + e1.equals(e3));
        System.out.println();

        System.out.println("toString of e2: " + e2);
    }
}
