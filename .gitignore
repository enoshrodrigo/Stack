import java.util.Scanner;

import static java.lang.System.exit;
//import static java.lang.System.exit;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        fun stacks = new fun();
        boolean set=true;
        while (set) {
            while (true) {

                System.out.println("Please enter array size : ");
                String arSize = scan.next();
                if (stacks.valid(arSize)) {
                    if (Integer.decode(arSize) <= 0) {
                        System.out.println("Invalid array size Size should greater than 0 \nTry again");
                        continue;
                    }
                    stacks.stackDefine(arSize);
                } else {
                    System.out.println("Wrong input : ");
                    continue;
                }
                break;
            }
            System.out.println("Array size is : " + stacks.maxSize);
            while (true) {
                System.out.println("What is your choice : \n" +
                        "To push enter 01 : \n" +
                        "To pop  enter 02 : \n" +
                        "To peek enter 03 : \n" +
                        "To Exit : \n\n");

                String selectStrig = scan.next();
                if (stacks.valid(selectStrig)) {
                    int select = Integer.parseInt(selectStrig);
                    if (select == 1) {
                        if (!(stacks.top == stacks.maxSize - 1)) {
                            System.out.println("Enter number : ");
                            stacks.push(scan.nextDouble());
                        } else System.out.println("Stack is full can't add data to it\n");
                    } else if (select == 2) {
                        stacks.pop();
                    } else if (select == 3) {
                        stacks.peek();
                    } else if (select == 0) {
                        exit(0);
                    }
                    else if(select==9){
                        System.out.println("Reset succes\n");
                        break;}
                    else {
                        System.out.println("Wrong number select valid option");
                    }

                } else System.out.println("Wrong input try again");
            }


      }
    }

}
