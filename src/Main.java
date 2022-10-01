import java.util.Scanner;
public class Main {
static void asal(int x,int y){
    if(x==y){
        System.out.println("Asal");
        return;
    }else if(x%y==0){
        System.out.println("Asal değil.");
        return;
    }
    asal(x,y++);
}
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Sayı giriniz : ");
    int x= in.nextInt();
    asal(x,2);

    }
}