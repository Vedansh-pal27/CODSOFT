import java.util.Scanner;
public class Sudent_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO GARDE CALCULATOR");
            System.out.println("ENTER THE NUMBER OUT OF 100 IN SUBJECT BELOW");
            System.out.print("ENGLISH :");
            int e= sc.nextInt();
            System.out.print("INFORMATION PRACTICES :");
            int i=sc.nextInt();
            System.out.print("MATHEMATICS :");
            int m=sc.nextInt();
            System.out.print("PHYSICS :");
            int p=sc.nextInt();
            System.out.print("CHEMISTRY :");
            int c=sc.nextInt();
            System.out.print("TOTAL MARKS IS :");
            int total=e+i+m+p+c;
        System.out.println(total+" out of 500");
        System.out.print("PERCENTAGE :");
        int per=total*100/500;
        System.out.println(per+"%");
        System.out.print("GRADE :");
        if(per==100){
            System.out.println("A+");
        } else if (per>=93) {
            System.out.println("A");
        } else if (per>=90) {
            System.out.println("A-");
        }else if (per>=87) {
            System.out.println("B+");
        } else if (per>=83) {
            System.out.println("B");
        }else if (per>=80) {
            System.out.println("B-");
        } else if (per>=77) {
            System.out.println("C+");
        }else if (per>=73) {
            System.out.println("C");
        } else if (per>=70) {
            System.out.println("C-");
        }else if (per>=67) {
            System.out.println("D+");
        } else if (per>=63) {
            System.out.println("D");
        }else if (per>=0) {
            System.out.println("F");
        }
    }
}
