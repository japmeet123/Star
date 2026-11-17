public class ShrinkingTriangle {
    public static void main (String[] args) {
        for (int row = 5; row >= 1; row--) {
            for (int col =1; col<=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



public class IncreasingStars {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class StarPatterns {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 6; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class StarPatters {
    public static void main (String[] args) {
        for (int row = 1; row <= 3; row ++) {
            for (int col = 1; col <=5; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



public class Checkerboard {
    public static void main(String[] args) {

        for (int row = 1; row <= 4 row++) {
            for (int col = 1; col <= 6; col++) {

                if ((row + col) % 2 == 0) {
                    System.out.print("X ");
                } else
                    System.out.print("O ");
            }
            }
            System.out.println()
        }
    }
}
