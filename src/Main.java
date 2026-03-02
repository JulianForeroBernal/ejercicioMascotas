import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        List<Mascota> listaMascota = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        byte option;
        boolean exit = false;
        do {
            System.out.println("""
                    MENU!\s
                    1. crear objeto\s
                    2. mostrar todo\s
                    3.buscar por nombre\s
                    4. salir\s
                    """);
            option = scan.nextByte();
            scan.nextLine();
            switch (option){
                case 1:
                    System.out.print("\ncreacion de mascota!\n");
                    //scan.nextLine();
                    System.out.println("ingrese el nombre de su mascota: ");
                    String name = scan.nextLine();
                    System.out.println("ingrese la especie de la mascota: ");
                    String specie = scan.nextLine();
                    System.out.println("ingrese edad de la mascota: ");
                    byte age = scan.nextByte();
                    System.out.println("ingrese peso de la mascota: ");
                    float weight = scan.nextFloat();
                    scan.nextLine();
                    Mascota m1 = new Mascota(name, specie, age, weight);
                    listaMascota.add(m1);
                    break;
                case 2:
                    for (Mascota m : listaMascota) {
                        System.out.println(m.showInfo());
                    }
                    break;
                case 3:
                    Mascota selecMascota = null;
                    System.out.println("ingrese el nombre que quiere buscar: ");
                    String nameSearch = scan.nextLine();
                    for (Mascota m : listaMascota) {
                        if (nameSearch.equalsIgnoreCase(m.getName())){
                            selecMascota = m;
                            System.out.println("ENCONTRADO!");
                            break;
                        }
                    }
                    if (selecMascota != null){
                        System.out.println(selecMascota.showInfo());
                        boolean exit2 = false;
                        do {
                            System.out.println("""
                    MENU:\s
                    1. Mostrar info de la mascota\s
                    2. Alimentar a la mascota\s
                    3. Vacunar a la mascota\s
                    4. hacerlo cumplir años\s
                    5. salir""");
                            byte option2;
                            System.out.println("digite su opción: ");
                            option2 = scan.nextByte();
                            switch (option2){
                                case 5:
                                    exit2 = true;
                                    break;
                                case 4:
                                    System.out.println(selecMascota.birthday());
                                    break;
                                case 3:
                                    System.out.println(selecMascota.vaccinate());
                                    break;
                                case 2:
                                    System.out.println("cuanta comida: ");
                                    float amount = scan.nextFloat();
                                    System.out.println(selecMascota.feed(amount));
                                    break;
                                case 1:
                                    System.out.println(selecMascota.showInfo());
                            }
                        }while (!exit2);
                    }
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }while (!exit);


    }


}
