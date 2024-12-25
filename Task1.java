import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputnumber;
    public int numberofguesses=0;
//constructor of game class to get number
    game(){
        Random rand =new Random();
        this.number= rand.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("Guess the number");
            Scanner sc = new Scanner(System.in);
            inputnumber = sc.nextInt();
        }
    boolean iscorrectnumber() {
        numberofguesses++;
        if (inputnumber == number) {
            System.out.format("Yes you gussed it right,it was %d\nyou guess it in %d attempt",number,numberofguesses);
        } else if (inputnumber<number) {
            System.out.println("To....less");
        } else if (inputnumber>number) {
            System.out.println("To....High");
        }
        return false;
    }
}
public class ved_30_Guess_the_number {
    public static void main(String[] args) {
        System.out.println("Welcome to guess the number...");
        Scanner sc = new Scanner(System.in);
        System.out.println("select the start or leave opption");
        System.out.println("1.START");
        System.out.println("2.LEAVE");
        int a= sc.nextInt();
        if (a==1){
        game g=new game();
        boolean b=false;
        while(!b){
            g.takeuserinput();
            b=g.iscorrectnumber();
        }
        }else{
            System.out.println("WE ARE WATING FOT YOU...MAY COME AND PLAY AGAIN");
        }
    }
}
