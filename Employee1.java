package collections;

public class Employee1 implements Comparable <Employee1> {
    private String empName;
    private int empId;
    private double salary;
    public Employee1(String empName, int empId, double salary) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee1 o) {
        if(this.salary>o.salary){
            return 1;
        } else if (this.salary<o.salary) {
            return -1;
        }
        else {
            return 0;
        }
    }
}


