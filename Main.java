import java.util.Scanner;

public class Main {

    static void desen(int N){

        System.out.print(N + " ");
        int temp=N;

        while(!(temp==0 || temp<0)){

            temp -= 5;
            System.out.print(temp+ " ");
        }
        while(!(temp==N)){

            temp += 5;
            System.out.print(temp + " ");
        }

    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("N sayısı:");
        int N=input.nextInt();

        desen(N);



    }

}