public class thirteen14 {
    public static void main(String[] args) {
        int num = 29;
        boolean prime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(num + (prime ? " is Prime" : " is Not Prime"));
    }
}
