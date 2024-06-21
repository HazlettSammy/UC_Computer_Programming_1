public class Main
{

    // Part A: Counting (while) Loops
    // 1. A loop that counts up by 1 from 0 to 20
    public static void countUpTo20() {
        int count = 0;
        while (count <= 20) {
            System.out.println(count);
            count++;
        }
    }

    // 2. A loop that counts down by 1 from 20 to 0
    public static void countDownTo0() {
        int count = 20;
        while (count >= 0) {
            System.out.println(count);
            count--;
        }
    }

    // 3. A loop that counts up by 3 from 0 to 24
    public static void countUpBy3To24() {
        int count = 0;
        while (count <= 24) {
            System.out.println(count);
            count += 3;
        }
    }

    // 4. A loop that counts down by 2 from 12 to 0
    public static void countDownBy2To0() {
        int count = 12;
        while (count >= 0) {
            System.out.println(count);
            count -= 2;
        }
    }

    // Part B: Output for loops
    // 5. A nested loop that creates this figure (there are no blank lines)
    // *
    // **
    // ***
    // ****
    // *****
    public static void printFigure1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 6. A nested loop that creates this figure (there are no blank lines)
    // ******
    // *****
    // ****
    // ***
    // **
    // *
    public static void printFigure2() {
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 7. A nested loop that creates this figure (there are no blank lines)
    // *****
    // *****
    // *****
    // *****
    // *****
    // *****
    public static void printFigure3() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Testing each method
        countUpTo20();
        countDownTo0();
        countUpBy3To24();
        countDownBy2To0();
        printFigure1();
        printFigure2();
        printFigure3();
    }
}
