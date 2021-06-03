import java.io.*;

public class Proyecto {
    public static void main(String[] args){
        System.out.println("Me cago en el auxiliar hijo de la verga");
        Read("C:\\Users\\Usuario\\Desktop\\IPC\\Practica 1\\Archivos\\Texto.txt");
    }

    public static String[] Read(String direccion){
        String[] text = new String[26];
        int nArrays=0;
        Boolean key1=false;
        Boolean key2=false;
        Boolean key3=false;
        BufferedReader BR;
        try {
            BR = new BufferedReader(new FileReader(direccion));
            for (int i = 1; BR.readLine()!= null; i++) {
                nArrays=i;
            }
            System.out.println(nArrays);
            if (26==nArrays){
                System.out.println("El programa cargara 26 Matrices");
                key1=true;
            }else if(nArrays>26){
                System.out.println("En el archivo hay "+nArrays+" Matrices de 26 matrices aceptables.");
                System.out.println("Solo se cargaran 26 matrices.");
                key2=true;
            }else if(nArrays<26){
                System.out.println("En el archivo hay "+nArrays+" matrices de 26 matrices aceptables.");
                System.out.println("Solo se cargaran "+nArrays+" matrices.");
                key3=true;
            }
            //--------------------------------------------------------------------------------

        }catch(Exception e){
            System.err.println("No se encontro el archivo...");
        }
        try {
            BR = new BufferedReader(new FileReader(direccion));
            String tempText="";
            String[] tempArrays = new String[100];
            for (int i = 0;(tempText= BR.readLine())!=null; i++) {
                tempArrays[i]=tempText;
                //System.out.println("En la posicion ["+i+"] se guardo: "+tempArrays[i]);
            }

            if (key1){
                for (int i = 0; i < 26; i++) {
                    text[i]=tempArrays[i];
                }
            }else if(key2){
                for (int i = 0; i < 26; i++) {
                    text[i]=tempArrays[i];
                }
            }else if (key3){
                for (int i = 0; i < nArrays; i++) {
                    text[i]=tempArrays[i];
                }
            }
        }catch(Exception e){
            System.err.println("No se encontro el archivo...");
        }
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 26; i++) {
            System.out.println(text[i]);
        }
        return text;
    }
}
