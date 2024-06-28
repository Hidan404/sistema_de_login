package com.sistemalogin;



import java.util.Scanner;

public class AppSL {
    public static void main(String[] args) {
        GereciadorDeUsuario userManager = GereciadorDeUsuario.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register User");
            System.out.println("2. Login User");
            System.out.println("3. List Users");
            System.out.println("4. Remover User");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // proxima linha

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    userManager.registerUser(username, password);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.nextLine();
                    userManager.loginUser(loginUsername, loginPassword);
                    break;
                case 3:
                    userManager.listUsers();
                    break;
                case 4:
                    System.out.println("Enter username: ");
                    String usernameRemove = scanner.nextLine();
                    userManager.removeUser(usernameRemove);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

