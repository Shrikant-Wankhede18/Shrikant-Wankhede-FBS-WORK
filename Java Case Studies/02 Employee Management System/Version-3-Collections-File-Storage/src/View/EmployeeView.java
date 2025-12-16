package View;

import java.util.Scanner;
import Controller.EmployeeController;
import Model.Admin;
import Model.HR;
import Model.SalesManager;
import Model.Employee;

public class EmployeeView {

    EmployeeController ec;
    Scanner sc = new Scanner(System.in);

    public EmployeeView(EmployeeController ec) {
        this.ec = ec;
    }


    private int getInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid number! Please try again.");
                sc.nextLine(); // clear wrong input
            }
        }
    }

    private double getDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid amount! Please try again.");
                sc.nextLine();
            }
        }
    }

    private String getString(String msg) {
        sc.nextLine(); // clear buffer
        while (true) {
            System.out.print(msg);
            String name = sc.nextLine();
            if (name.matches("[a-zA-Z ]+")) {
                return name;
            } else {
                System.out.println("Invalid name! Only letters and spaces allowed.");
            }
        }
    }


    public void showOptions() {

        int choice = 0;

        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All Employees");
            System.out.println("0. Exit");

            choice = getInt("Enter your choice: ");

            switch (choice) {

                case 1:
                   
                    int type;
                    while (true) {
                        type = getInt("Enter Employee Type (1=HR, 2=Admin, 3=SalesManager): ");
                        if (type == 1 || type == 2 || type == 3) {
                            
                            break;
                        } else {
                           
                            System.out.println("Invalid type! Enter only 1, 2, or 3.");
                        }
                    }

                   
                    int id;
                    while (true) {
                        id = getInt("Enter ID: ");
                        if (ec.idExists(id)) {
                            System.out.println("❌ ID already exists! Please enter a new ID.");
                        } else {
                            break;
                        }
                    }

                    // ------------------------------
                    // Name & Salary Input
                    // ------------------------------
                    String name = getString("Enter Name: ");
                    double salary = getDouble("Enter Base Salary: ");

                    // ------------------------------
                    // Create Employee based on type
                    // ------------------------------
                    if (type == 1) {
                        double comm = getDouble("Enter Commission: ");
                        ec.addEmployee(new HR(id, name, salary, comm));
                    } else if (type == 2) {
                        double allowance = getDouble("Enter Allowance: ");
                        ec.addEmployee(new Admin(id, name, salary, allowance));
                    } else if (type == 3) {
                        int target = getInt("Enter Target: ");
                        double incentive = getDouble("Enter Incentive per Target: ");
                        ec.addEmployee(new SalesManager(id, name, salary, target, incentive));
                    }
                    break;

                case 2:
                    id = getInt("Enter ID to search: ");
                    Employee e = ec.searchEmployeeById(id);
                    System.out.println(e != null ? e : "Employee not found.");
                    break;

                case 3:
                    id = getInt("Enter ID to update: ");
                    salary = getDouble("Enter new salary: ");
                    System.out.println(ec.updateEmployee(id, salary)
                            ? "Updated successfully!"
                            : "Employee not found!");
                    break;

                case 4:
                    id = getInt("Enter ID to delete: ");
                    System.out.println(ec.deleteEmployee(id)
                            ? "Deleted successfully!"
                            : "Employee not found!");
                    break;

                case 5:
                    ec.displayAll();
                    break;

                case 0:
                    System.out.println("Program Exited.");
                    break;

                default:
                    System.out.println("Invalid choice! Enter 0-5 only.");
            }

        } while (choice != 0);
    }
}
