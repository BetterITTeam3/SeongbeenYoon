import java.util.ArrayList;

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
/*
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
*/
/*
import java.util.Scanner;

public class START {
    public static void main(String[] args) {
        String str="a";
        Scanner sc = new Scanner(System.in);
        while (str.charAt(0) != 'q') {
            str = sc.next();
            System.out.println(str.charAt(0));
            if (str.charAt(0)== 'q') {
                break;
            }
        }
    }
}
*/
/*
import java.util.Scanner;
public class START{
    public static void main(String[] args){
        int[] arr=new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        int a=arr[0];
        int r=arr[1];
        int n=arr[2];
        long rst=a;
        for(int i=0;i<n-1;i++){
            rst=rst*r;
        }
        System.out.println(rst);
    }
}*/
/*
import java.util.Scanner;
public class START {
    public static void main(String[] args) {
        double tmp=1;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            tmp*=sc.nextDouble();
        }
        tmp/=8;
        for(int i=0;i<2;i++){
            tmp/=1024;
        }
        tmp*=10;
        tmp=Math.ceil(tmp);
        tmp/=10;
        System.out.print(tmp);
        System.out.println(" MB");
    }
}*/
public class START {

    /* An instance variable representing the potato's species. */
    private String variety;
    /* An instance variable representing the potato's age. */
    private int age;

    /** A constructor that returns a very young russet burbank potato. */
    public START() {
        this.variety = "Russet Burbank";
        this.age = 0;
    }

    /** A constructor that allows you to specify its variety and age. */
    public START(String variety, int age) {
        this.variety = variety;
        this.age = age;
    }

    /** A getter method that returns the potato's type. */
    public String getVariety() {
        return this.variety;
    }

    /** A getter method that returns the potato's age. */
    public int getAge() {
        return this.age;
    }

    /** A setter method that sets the potato's age to AGE. */
    public void setAge(int age) {
        this.age = age;
    }

    /** A method that grows the potato. Note it increases its age by 1. */
    public void grow() {
        System.out.println("Photosynthesis!");
        this.age = this.age + 1;
    }

    /** Did you know potatoes can flower? No? Neither did I... */
    public void flower() {
        System.out.println("I am now a beautiful potato");
    }
}