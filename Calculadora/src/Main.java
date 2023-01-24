import java.util.Scanner;

public class Main {

    public static void main(String[]args){

                   int n1;
                   int n2;

                   String operation = "";
                    int control = 0;

                   Scanner in = new Scanner(System.in);


                   System.out.println("Digit the operator(+,-,*,/)");{
                       operation = in.nextLine();
                    System.out.println("Digit a value: ");
                    n1 = Integer.parseInt(in.nextLine());

                    System.out.println("Digit the second value: ");
                    n2 = Integer.parseInt(in.nextLine());

                    if(operation.equals("+")){
                        System.out.println("The result of the operation is: "+(n1+n2));
                        control++;
                    }
                    if(operation.equals("-")){
                        System.out.println("The result of the operation is: "+(n1-n2));
                        control++;
                    }
                    if (operation.equals("*")){
                        System.out.println("The result of the operation is: "+(n1*n2));
                        control++;
                    }
                    if(operation.equals("/")){
                        System.out.println("The result of the operation is: "+(n1/n2));
                    }
                    if(control == 0){
                        System.out.println("Invalid operation, try again!");
                        control--;
                    }
        }


    }



}