package ejemploarreglos4a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EjemploArreglos4a {    // buffer de netrada como variable global
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;


    public static double[] leerCelif(int n) throws IOException{
        double[] califs = new double[n];
        System.out.println(" Escriba calificaciones ");
        for(int i=0; i<n; i++){
            System.out.println(" Escriba las calificaciones del alumno con el id ["+i+"]" );
            entrada= bufer.readLine();
            califs[i]= Double.parseDouble(entrada);
        }
        return califs;
    }
    public static double calcularPromedioGrupo(double[] proms){
        double suma=0;
        for(int i=0; i <proms.length;i++)
            suma=suma+proms[i];
        /*
        for(double prom:proms)
          suma=suma+prom;

        */
        return suma/proms.length;

    }
    public static void imprimirCalif(double[] califs){
        int i=0;
        System.out.println("los Promedioos individuales del grupo son ");
        System.out.println("id alumno     promedio indivual");
        System.out.println("++++++++++++++++++++++++++++++++++");
        for(double calif:califs){
            System.out.println(" "+i+"           "+calif);
            i++;
        }

    }

    public static void main(String[] args) throws IOException {

        int t;
        double promGrupo;

        //declarando y construyendo un arreglo
        int[] arr1= new int[5];


        //declarar y asignar valores
        char[] arr2={'@','#','%','&','!','¡','$','¿','á','é','^'};
        boolean[] arr3={true,false,true,false,false,true,true,false };


        //declaracion de un arreglo de double

        double[] calificaciones;



        // colando valores en arr1
        for (int i=0; i<5; i++)
            arr1[i]=i+1;

        // imprimiendo arreglo
        //forma incorrecta
        //System.out.println("inprimir"+ arr1);

        // forma correcta
        System.out.println("imprimiendo ");
        for (int i=0; i<5; i++)
            System.out.println("elemento ["+i+"] del arreglo "+arr1[i]);

        System.out.println("++++++++++++++++++++++");

        // mostrando el tamaño de arreglo
        System.out.println("tamaño arreglo es de "+arr2.length);
        System.out.println("++++++++++++++++++++++");
        System.out.println("contenido del arreglo 2 ");
        for(int i=0; i<arr2.length; i++)
            System.out.println("llenado de ["+i+"] de arreglo2 "+arr2[i]);

        System.out.println("contenido del arrelo 3");
        for(boolean boli:arr3)
            System.out.print(" "+boli+" ");
        System.out.println("");
        System.out.println("****");
        System.out.println("");

        // declaren e inicialicen arreglo de doble

        double[] arr4={1.1,1.2,1.3,1.4,5.5,6.6,7.7};
        for(double dob:arr4)
            System.out.println(""+dob+"");

        // Declarar un arreglo de Strings
        String[]arreglo5;



        System.out.println("Escribe el tamaño del 5to arreglo: ");
        entrada = bufer.readLine();
        t=Integer.parseInt(entrada);




        //construccion de arrelo numero 5
        System.out.println("0101010101010");
        arreglo5=new String[t];
        // Introduciendo valores de entrada a un arreglo
        for(int i=0;i<t;i++){
            System.out.println("Escribe el elemento["+i+"] del arreglo 5: ");
            entrada=bufer.readLine();
            arreglo5[i]=entrada;
        }
        // Imprimiendo el contenido del arreglo5
        for(String unString: arreglo5){
            System.out.println(unString);
        }
        // encontrar el promedio de un grupon


        System.out.println("escribe el tamaño de un grupo");
        entrada=bufer.readLine();
        t=Integer.parseInt(entrada);
        calificaciones = leerCelif(t);
        System.out.println();
        imprimirCalif(calificaciones);
        promGrupo=calcularPromedioGrupo(calificaciones);
        System.out.println("El resultado del grupo es: "+promGrupo);


    }
}