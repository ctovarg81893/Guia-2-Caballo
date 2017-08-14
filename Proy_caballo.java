import java.util.Scanner;

public class Proy_caballo {

    
    public static void main(String[] args) {
      //  long factorial=1;
      //  long division=0;
        int pasos=0;
        int consulta=0;
        boolean salida=false;
        int destino_c;
        int destino_r;
        Caballo caballo = new Caballo();
        Scanner lectura = new Scanner(System.in);
        String[] posicion_caballo = new String[20];
             
        System.out.print("introduzca la cantidad de consultas que desea hacer ");
        consulta=lectura.nextInt();
                for (int i = 0; i <= consulta; i++) {
                  System.out.print("introducir la posicion del caballo y el destino, ejem: 0 0 7 7");
                  System.out.println(" ");
                  
                  posicion_caballo[i] = lectura.nextLine();
                }
   
                        for (int j = 1; j <= consulta; j++) {
        pasos=0;
        caballo.pos_c =  Integer.parseInt(String.valueOf(posicion_caballo[j].charAt(0)) );
        caballo.pos_r =  Integer.parseInt(String.valueOf(posicion_caballo[j].charAt(2)) );
        destino_c = Integer.parseInt(String.valueOf(posicion_caballo[j].charAt(4)) );
        destino_r =  Integer.parseInt(String.valueOf(posicion_caballo[j].charAt(6)) );
        
        while((Math.abs(destino_c-caballo.pos_c)>1)||(Math.abs(destino_r-caballo.pos_r)>1)){
        salida=caballo.pasos(caballo.pos_c,caballo.pos_r,destino_c,destino_r);
        pasos++;
        }
        if((Math.abs(destino_c-caballo.pos_c)==0)&&(Math.abs(destino_r-caballo.pos_r)==1))         {
            pasos++;
        }
        if((Math.abs(destino_c-caballo.pos_c)==1)&&(Math.abs(destino_r-caballo.pos_r)==0))
        {
            pasos++;
        }   
        if((Math.abs(destino_c-caballo.pos_c)==1)&&(Math.abs(destino_r-caballo.pos_r)==1))
        {
            pasos=pasos+2;
        }
                 
        System.out.println(" ");
        System.out.println("Cantidad de pasos del movimiento " + posicion_caballo[j] +  "es " + pasos );
        System.out.println(" ");
    }

    }
}