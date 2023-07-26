public class Main {
    public static void main(String[] args) {

        int check = 250;
        int deposit = 1500;
        int bonus = deposit / 100;

        if (deposit > 1000) {
            System.out.println(bonus + check + deposit);
        }else{
            System.out.println(check + deposit);}
    }
}