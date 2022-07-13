import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number");
            int input_number = scanner.nextInt();
            Random random = new Random();
//            generate random number
            int random_number = random.nextInt(101);
            if (random_number < input_number){
                System.out.println("random value is less than input number\n "+ "random value is "+random_number+"\n TRY AGAIN");
                continue;
            } else if (random_number>input_number) {
                System.out.println("random value is greater than input number\n "+ "random value is "+random_number+"\n TRY AGAIN");
                continue;

            }
            else {
                System.out.println("You Won: \n" + "random value == input value");
                break;
            }
        }

    }
}
