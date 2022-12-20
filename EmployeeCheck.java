package collections;

import com.training.IdAlreadyException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class EmployeeCheck {
        public static void main(String[] args) throws IdAlreadyException {
            String name;
            int id;
            double salary;
            Scanner sc = new Scanner(System.in);
            Employee1 e1 = new Employee1("megha",11,50000);
            Employee1 e2 = new Employee1("prashu",12,25000);
            Employee1 e3 = new Employee1("srija",13,16000);
            Employee1 e4 = new Employee1("supraja",14,60000);
            Employee1 e5 = new Employee1("lucky",15,20000);
            List<Employee1> employee = new ArrayList<>();
            List<Employee1> employee1 = new ArrayList<>();
            employee.add(e1);
            employee.add(e2);
            employee.add(e3);
            employee.add(e4);
            employee.add(e5);
            System.out.println("enter the employee name");
            name= sc.next();
            System.out.println("enter the employee id");
            id =sc.nextInt();
            System.out.println("enter the employee salary");
            salary = sc.nextDouble();
            for(Employee1 employees:employee) {
                try {
                    if (employees.getEmpId() == id) {
                        throw new IdAlreadyException();
                    } else {
                        employee1.add(new Employee1(name,id,salary));
                    }
                }
                catch (IdAlreadyException e){
                    System.out.println("Id already present");
                }
            }
            for(Employee1 emp : employee1){
                System.out.println(emp);
            }


        }
    }

