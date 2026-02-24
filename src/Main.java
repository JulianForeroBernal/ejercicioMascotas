import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        boolean exit = false;
        byte option;
        Mascota m1 = new Mascota("Oslo", "Border collie", (byte) 2, 25.4f);
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("""
                    MENU:\s
                    1. Mostrar info de la mascota\s
                    2. Alimentar a la mascota\s
                    3. Vacunar a la mascota\s
                    4. hacerlo cumplir años\s
                    5. salir""");
            System.out.println("digite su opción: ");
            option = scan.nextByte();
            switch (option){
                case 5:
                    exit = true;
                break;
                case 4:
                    System.out.println(m1.birthday());
                    break;
                case 3:
                    System.out.println(m1.vaccinate());
                    break;
                case 2:
                    System.out.println("cuanta comida: ");
                    float amount = scan.nextFloat();
                    System.out.println(m1.feed(amount));
                    break;
                case 1:
                    System.out.println(m1.showInfo());
            }
        }while (!exit);
    }


}
