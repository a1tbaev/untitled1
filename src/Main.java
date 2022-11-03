import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boy boy = new Boy();
        System.out.println("your name:");
        boy.setName(scanner.next());
        System.out.println("your age:");
        boy.setAge(scanner.nextInt());
        System.out.println("are you studying? answer yes or no");
        boy.setInfo(scanner.next());
        getInfo(boy.getAge(), boy.getInfo());
    }
    public static void getInfo(int age, String info){
        if (age >= 18 && Objects.equals(info, "no")){
            System.out.println("go to army");
        } else if (age < 18 && Objects.equals(info,"no")) {
            System.out.println("you are young");
        }else {
            System.out.println("first finish study");
        }
    }

}