public class curseur {

    private int nombre_de_lighes;
    private int nombre_de_colones;
    private int x;
    private int y;
    private int position_x;
    private int Position_y;

    curseur(){
        nombre_de_lighes=0;
        nombre_de_colones=0;
        position_x=0;
        Position_y=0;

    }

    public void lignes(int nombre_de_lighes){
        this.nombre_de_lighes=nombre_de_lighes;
    }

    public void colones(int nombre_de_colones){
        this.nombre_de_colones=nombre_de_colones;
    }

    public void position(String a){
        if (a.toUpperCase().equals("S")){
            if((x!=nombre_de_lighes)&&(x<nombre_de_lighes)&&(x>0)){
                x--;
            }
        }
        else if (a.toUpperCase().equals("F")){
            if((x!=nombre_de_lighes)&&(x<nombre_de_lighes)&&(x>0)){
                x++;
            }
        }
        else if (a.toUpperCase().equals("D")){
            if((y!=nombre_de_colones)&&(y<nombre_de_colones)&&(y>0)){
                y--;
            }
        }
        else if (a.toUpperCase().equals("E")){
            if((y!=nombre_de_colones)&&(y<nombre_de_colones)&&(y>0)){
                y++;
            }
        }

        System.out.println("position actuelle du Curseur : " +
                x +
                "," +
                y +
                "\n");
    }

}
