import java.util.ArrayList;
import java.util.Scanner;

/*
public class START {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
*/
/*
public class START {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        if(num>0) {
            System.out.println("plus");
            if(num%2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }else{
            System.out.println("minus");
            if(num%2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }


    }
}*/
/*
public class START {

    public static void main(String[] args) {
        String[][] users = {
                {"Oh", "1111"},
                {"Kim", "2222"},
                {"Park", "3333"}
        };
        String inputID = args[0];
        String inputPW = args[1];
        System.out.println(inputID);
        System.out.println(inputPW);
        boolean isLogined = false;
        for (int i = 0; i < users.length; i++) {
            String[] current = users[i];
            if (current[0].equals(inputID) && current[1].equals(inputPW)) {
                isLogined = true;
                break;
            }
        }
        // 2차원 배열인 users 과 1차원 배열인 current.

        System.out.println("Hi, ");
        if (isLogined) {
            System.out.println("Master.");
        }
        else {
            System.out.println("Who are you?");
        }

    }

}
*/
public class START {
    public static void main(String[] args) {
        int temp = 1;
        Scanner sc = new Scanner(System.in);
        while (temp != 0) {
            temp = sc.nextInt();
            if (temp != 0) {
                System.out.println(temp);
            }
        }
    }
}