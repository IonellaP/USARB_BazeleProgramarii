public class ReverseNumber {
    public static void main(String[] args) {
        int n = 5731;
        int reverse = (n % 10) * 1000 + ((5731 / 100) % 10) * 100 + (5731 % 100) / 10 *10 + 5731 / 1000;
        System.out.println(reverse);
    }
}
