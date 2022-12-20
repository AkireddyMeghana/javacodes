import java.util.InputMismatchException;
import java.util.Scanner;

public class CandException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num[] = new int[5];
        try {
            System.out.println("enter the array length");
            int arrayLength = sc.nextInt();
            int num[] = new int[arrayLength];
            try{
                System.out.println("enter the index value to search");
                int searchNum = sc.nextInt();
                for (int j = 0; j < arrayLength; j++) {
                    if(searchNum==j){
                        System.out.println("index is found");
                    }
                    else if(searchNum>arrayLength){
                        throw new ArrayIndexOutOfBoundsException ();
                    }
                }
            }
            catch (ArrayIndexOutOfBoundsException e ){
                System.out.println("array out of bound");
            }
            catch (InputMismatchException e ) {
                System.out.println("Enter the correct format");
            }
            System.out.println("enter the array values");
            for (int i = 0; i < num.length; i++) {
                num[i] =sc.nextInt();
            }

        }
        catch (InputMismatchException e ){
            System.out.println("Enter the correct format");
        }
        finally {
            {
                System.out.println("program completed");
            }
        }
    }
}
