import java.io.*;

public class Proyecto {
    public static void main(String[] args){
        System.out.println("Me cago en el auxiliar hijo de la verga");
        String txt= LeerArchivo("C:\\Users\\Usuario\\Desktop\\IPC\\Practica 1\\Archivos\\Texto.txt");
        System.out.println(txt);
    }

    public static String LeerArchivo(String direccion){
        String text="";
        BufferedReader BR;
        try {
            FileReader FR = new FileReader(direccion);
            BR = new BufferedReader(FR);
            String BR_text;
            String temp_text="";
            while((BR_text= BR.readLine()) != null){
                temp_text = temp_text + BR_text;
            }
            text = temp_text;
        } catch(Exception e){
            System.err.println("No se encontro la ruta del archivo.");
        }
        return text;
    }
}
