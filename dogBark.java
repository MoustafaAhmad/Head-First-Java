import java.util.Scanner;
class dog {
    int size;
    String name;
    void bark() {
        if (size > 60) System.out.println(name + " said WOOF WOOF WOOF!");
        else if (size > 14) System.out.println(name + " said RUFF RUFF RUFF!");
        else System.out.println(name + " said YIP YIP YIP !");
    }
}
class dogTest{
        public static void main(String[] args){
            System.out.println("How many dogs you have?");
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            dog []d = new dog[x];
            for (int i = 0; i<x; i++){
                d[i] = new dog();
                System.out.println("Enter the name of dog number " + (i+1));
                d[i].name = input.nextLine();
                d[i].name = input.nextLine();
                System.out.println("Enter the size of dog number " + (i+1));
                d[i].size = input.nextInt();
            }
            for (int i = 0; i<x; i++){
                d[i].bark();
            }
        }
}
