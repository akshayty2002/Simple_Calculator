import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("*********************************");
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();


            System.err.println("Please select the Operation Carefully!!\n" +
                    "1. For Addition\n" +
                    "2. For Subtraction\n" +
                    "3. For MultiplicationFor\n" +
                    "4. For Divide");

            int input = sc.nextInt();
            System.out.print("\n");
            int output=0;
            float div=0;
            switch (input) {
                case 1:
                    output = a + b;
                    System.out.println("Addition Result: "+output);
                    break;

                case 2:
                    output = a - b;
                    System.out.println("Subtraction Result:"+output);
                    break;

                case 3:
                    output = a * b;
                    System.out.println("Multiplication Result"+output);
                    break;

                case 4:
                if (b!=0) {
                    div =(float) a / b;
                    System.out.println("Division Result"+div);
                    
                } else {
                    System.out.println("Can't divide by 0");
                }
                    break;
                default:

                    System.out.println("Invalid Output");
                    break;
            }
            System.out.println("*********************************");
            System.out.println("\nWant to Continue?\n"+
            "1 for Yes\n"+
            "2 for No");
            int ex = sc.nextInt();
            System.out.println();
            if (ex==2) {
                break;
            }
        }

        sc.close();
    }   
}