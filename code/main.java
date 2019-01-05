import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int lignes;
        int colones;
        String key;

        Scanner reader = new Scanner(System.in);

        curseur a = new curseur();

        System.out.println("Nombre de lighnes? ");
        lignes = reader.nextInt();

        System.out.println("Nombre de colones? ");
        colones = reader.nextInt();

        a.lignes(lignes);
        a.colones(colones);

        while (true){
            key = reader.next();
            a.position(key);
        }

    }
}
