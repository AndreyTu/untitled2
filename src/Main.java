public class Main {
    public static void main(String[] args) {

        int start = 250;
        int x = 1500;
        int bonus = x / 100;

        if (x > 1000) {
            System.out.println(bonus + start + x);
        }else{
            System.out.println(start + x);}
    }
}