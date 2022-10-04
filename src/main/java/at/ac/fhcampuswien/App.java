package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        int a = 0xface;
        int b = 012;
        long c = 80L;
        float d = 44e-1f;
        double e = 8.88e1;
        double f = 99.9;
        char g = 'Z';
        float h = 5.5f;

        int m = (int) c;
        int t = (int) d;
        int k = (int) e;
        int n = (int) f;
        int i = (int) g;
        int o = (int) h;


        int sum = (m+t+k+n+i+o+a+b);

        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int sum = (n1 + n2);
        System.out.println(sum);

    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); // 10
        int y = scanner.nextInt(); //5

        System.out.println("Before Swap:" );

        System.out.println("x: "+"y: " + "After Swap:");

        x = x + y ; //15
        y = x - y ; //10
        x = x - y ; //5

        System.out.println("x: "+x);
        System.out.println("y: "+y);


    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1>n2) {
            System.out.println("n1: " + "n2: " + "n1 > n2");
        }
        else if (n2 > n1) {
            System.out.println("n1: " + "n2: " + "n2 > n1");
        }
        else {
            System.out.println("n1: " + "n2: " + "n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if((x < 0) || (x >= 100000))
        { System.out.println("Enter annual Revenue: " +  "Invalid Revenue");}
        else if (x < 20000);
        System.out.println("Poor sales Revenue");

    }

    //todo Task 8
    public void getCommissionRate() {
        Scanner scanner = new Scanner(System.in);

        int CommissionClass = scanner.nextInt();

        switch (CommissionClass) {
            case 1:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.01");
                break;

            case 2:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.02");
                break;

            case 3:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.03");
                break;

            case 4:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.04");
                break;

            default:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.0");

        }
    }
    //todo Task 9
    public void leapyear(){

    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}