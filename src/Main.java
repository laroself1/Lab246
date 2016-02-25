import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter integer value less or equal to 9:  ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        MyPyramid.printPyramid(n); }}
