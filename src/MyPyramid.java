public class MyPyramid {
    public static void printPyramid(int h) {
        if (h<=9){
        for (int i = 1; i <= h; i++) {
               for (int l=h;l>i;l--) {
                System.out.print(" ");}
                for (int j = 1; j < i; j++) {
                    System.out.print(j);}
                for (int j = i; j >= 1; j--) {
                    System.out.print(j); }
                System.out.println();}}
        else {System.out.println("Error: numbers less than or equal to 9 only allowed");}}}
