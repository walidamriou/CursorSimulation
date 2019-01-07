import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
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
            if(key!=null)
               a.position(key);
            key=null;
        }
        
    }
}
