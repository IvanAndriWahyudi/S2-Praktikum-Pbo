package OOP;

public class Main {

    public static void main(String[] args) {

        //For Loop
        System.out.println("Penggunaan For Loop");
        for (int i = 0 ; i < 20 ; i++){
            if (i % 2 == 0){
                System.out.print(i + ", ");
            }
        }

        //While Loop
        System.out.println("\n\nPenggunaan While Loop");
        int a = 0;
        while (a < 20) {
            if (a % 2 == 0) {
                System.out.print(a + ", ");
            }
            a++;
        }
    // Do While Loop

        System.out.println("\n\nPenggunaan Do While Loop");
        a = 0;
        do{
            if (a % 2 == 0){
                System.out.print(a + ", ");
            }
            a++;
        }while ( a< 20);

        //Foreach Loop
        System.out.println("\n\nPenggunaan Foreach Loop");
        String[] nama = {"Ivan", " Andri", " Wahyudi"};
        for (String i : nama){
            System.out.print(i);
        }
        System.out.println(" ");
    }
}
