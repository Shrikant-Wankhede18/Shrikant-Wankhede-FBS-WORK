package Controller;

import Model.Employee;
import java.util.ArrayList;
import Model.Admin;
import Model.HR;
import Model.SalesManager;

public class EmployeeDAO {

    ArrayList<Employee> eArr = new ArrayList<  >();

    Employee e1 = new HR(101, "Ranjit", 50000, 5000);
    Employee e2 = new HR(102, "Amit", 48000, 4500);
    Employee e3 = new HR(103, "Sneha", 47000, 4000);
    Employee e4 = new SalesManager(201, "Karan", 60000, 12, 8000);
    Employee e5 = new SalesManager(202, "Meena", 58000, 15, 7500);
    Employee e6 = new SalesManager(203, "Rohit", 62000, 10, 9000);
    Employee e7 = new Admin(301, "Pragati", 70000, 10000);
    Employee e8 = new Admin(302, "Isha", 68000, 9500);
    Employee e9 = new Admin(303, "Pooja", 72000, 11000);
    Employee e10 = new Admin(304, "Shubham", 75000, 12000);

    public void DummyData() {
        eArr.add(e1);
        eArr.add(e2);
        eArr.add(e3);
        eArr.add(e4);
        eArr.add(e5);
        eArr.add(e6);
        eArr.add(e7);
        eArr.add(e8);
        eArr.add(e9);
        eArr.add(e10);
    }

    public boolean addEmployee(Employee e) {
        if (e != null) {
            eArr.add(e);
            return true;
        }
        return false;
    }

    public Employee searchEmployee(int id) {
        for (int i = 0; i < eArr.size(); i++) {
            if (eArr.get(i).getId() == id) {
                return eArr.get(i);
            }
        }
        return null;
    }

    public boolean updateEmployee(int id, double salary) {
        for (int i = 0; i < eArr.size(); i++) {
            if (eArr.get(i).getId() == id) {
                eArr.get(i).setSalary(salary);
                return true;
            }
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
        for (int i = 0; i < eArr.size(); i++) {
            if (eArr.get(i).getId() == id) {
                eArr.remove(i);
                return true;
            }
        }
        return false;
    }

    public void displayAll() {
    	
            System.out.println(eArr);
        }
}
