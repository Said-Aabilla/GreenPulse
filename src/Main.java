import controllers.UserController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. Create User");
            System.out.println("2. Update User");
            System.out.println("3. Delete User");
            System.out.println("4. Display All Users");
            System.out.println("5. Add Carbon Consumption for user");
            System.out.println("6. Display Carbon Consumption for user");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter Age:");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter ID:");
                    String id = scanner.nextLine();
                    userController.createUser(name, age, id);
                    break;
                case 2:
                    System.out.println("Enter ID of the user to update:");
                    String updateId = scanner.nextLine();
                    System.out.println("Enter New Name:");
                    String newName = scanner.nextLine();
                    System.out.println("Enter New Age:");
                    int newAge = scanner.nextInt();
                    userController.updateUser(updateId, newName, newAge);
                    break;
                case 3:
                    System.out.println("Enter ID of the user to delete:");
                    String deleteId = scanner.nextLine();
                    userController.deleteUser(deleteId);
                    break;
                case 4:
                    userController.displayAllUsers();
                    break;
                case 5:
                    System.out.println("Enter ID of the user to add carbon consumption:");
                    String userId = scanner.nextLine();
                    System.out.println("Enter start date:");
                    String startDate = scanner.nextLine();
                    System.out.println("Enter end date:");
                    String endDate = scanner.nextLine();
                    System.out.println("Enter carbon consumption:");
                    int carbon = scanner.nextInt();
                    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    userController.addCarbonConsumptionForUser(userId, carbon,formatter.parse(startDate) , formatter.parse(endDate));
                    break;
                case 6:
                    System.out.println("Enter ID of the user to display all carbon consumption:");
                    String user = scanner.nextLine();
                    userController.displayAllCarbonsForUser(user);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


}
