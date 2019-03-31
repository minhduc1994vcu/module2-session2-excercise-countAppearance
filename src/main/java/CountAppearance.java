import java.util.Scanner;

public class CountAppearance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = scanner.nextLine();

        System.out.println("enter a character: ");
        char cha = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == cha) {
                count++;
            }
        }
        switch (count) {
            case 0:
                System.out.println(cha + " didn't appearance");
                break;
            case 1:
                System.out.println(cha + " appearance 1 time");
                break;
            default:
                System.out.println(cha + " apprance " + count + " times");
        }
    }
}
