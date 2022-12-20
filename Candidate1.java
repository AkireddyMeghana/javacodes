import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;

    public class Candidate1 extends InvalidSal {
        void Salary(double salary) throws InvalidSal {
            try {
                if (salary <= 10000) {
                    throw new InvalidSal();
                }
            }
            catch(InvalidSal e){
                System.out.println("Salary can not be less than 10000");
            }


        }
        public static void main(String[] args) {
            String name;
            char gender;
            double salary;
            Candidate1 c=new Candidate1();
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("enter the name");
                name = sc.next();
                boolean result= name.matches("^[a-zA_Z]*$");
                if(!(result==true)){
                    throw new InputMismatchException();
                }
                System.out.println("enter the gender");
                gender = sc.next().charAt(0);
                if (!(gender == 'M' || gender == 'F')) {
                    throw new InputMismatchException("input invalid exception");
                }
                System.out.println("enter the salary");
                salary = sc.nextDouble();
                c.Salary(salary);

            } catch (InputMismatchException e) {
                System.out.println("invalid name format");
            }
            catch (InvalidSal e){
                System.out.println(e);
            }


        }

    }

