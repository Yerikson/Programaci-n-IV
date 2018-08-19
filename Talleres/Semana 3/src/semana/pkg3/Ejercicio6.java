
package semana.pkg3;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        int N_Horas = 8400;
        int N = N_Horas;
        int Semanas = 0, Días = 0;
        if (N_Horas < 24) {
            System.out.println("Las " + N + " Horas Ingresadas Equivalen A: " + Semanas + " Semanas," + Días + " Dias," + N_Horas + " Horas.");
            
        } else {            
            for (int i = 1; i < 3 && N_Horas > 0; i++) {
                if(i == 1){
                    Semanas = N_Horas / 168;
                    N_Horas %= 168;                                                                   
                }
                else{
                    Días = N_Horas / 24;
                    N_Horas %= 24;
                }            
            }
            System.out.println("Las " + N + " Horas Ingresadas Equivalen A: " + Semanas + " Semanas," + Días + " Dias," + N_Horas + " Horas.");
            
        }

    }
    
}
