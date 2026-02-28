import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        List<Mascota> listaMascota = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        byte option = 0;
        boolean exit = false;
        do {
            System.out.println("""
                    MENU!\s
                    1. crear objeto\s
                    2. mostrar todo\s
                    3.buscar por nombre\s
                    """);
            option = scan.nextByte();
            switch (option){
                case 1:
                    System.out.print("creacion de mascota!");
                    System.out.println("ingrese el nombre de su mascota: ");
                    String name = scan.next();
                    System.out.println("ingrese la especie de la mascota: ");
                    String specie = scan.next();
                    System.out.println("ingrese edad de la mascota: ");
                    byte age = scan.nextByte();
                    System.out.println("ingrese peso de la mascota: ");
                    float weight = scan.nextFloat();
                    Mascota m1 = new Mascota(name, specie, age, weight);
                    listaMascota.add(m1);
                    break;
                case 2:
                    for (Mascota m : listaMascota) {
                        System.out.println(m.showInfo());
                    }
                    break;

            }
        }while (!exit);


    }


}
