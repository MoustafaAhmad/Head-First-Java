import java.util.Scanner;

class player {
    int guess;
    boolean isRight;

    public void myGuess(){
        Scanner input = new Scanner(System.in);
        System.out.print("Number to guess is ");
        guess = input.nextInt();
    }
}
class guess {
    player p1;
    player p2;
    player p3;

    void startGame() {
        p1 = new player();
        p2 = new player();
        p3 = new player();
        p1.guess = 0;
        p2.guess = 0;
        p3.guess = 0;

        p1.isRight = false;
        p2.isRight = false;
        p3.isRight = false;

        System.out.println("I am thinking of a number between 0 and 9!");

        while (true) {
            int targetNum = (int) (Math.random() * 10);
            p1.myGuess();
            p2.myGuess();
            p3.myGuess();
            if (p1.guess == targetNum) {
                System.out.println("Player 1 wins");
                p1.isRight = true;
            }
            if (p2.guess == targetNum) {
                System.out.println("Player 2 wins");
                p2.isRight = true;
            }
            if (p3.guess == targetNum) {
                System.out.println("Player 3 wins");
                p3.isRight = true;
            }
            System.out.println("The target number is " + targetNum);
            if (p1.isRight || p2.isRight || p3.isRight) {
                break;
            } else {
                System.out.println("Try again.");
            }

        }
    }
}
class launch {
    public static void main(String[] args){
        guess start = new guess();
        start.startGame();
    }
}
