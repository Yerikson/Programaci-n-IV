
package semana.pkg3;

public class Ejercicio7 {
    /* Aquí creo a X1 y X2 con el tipo de dato double ya que Math.sqrt() devuelve un double*/
    public static void main(String[] args) {
        int a = 1, b = -4, c = 3;
        double X1 = ((- b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a) );
        double X2 = ((- b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a) );
        System.out.println("Las Raices De La Ecuación De Segundo Grado Con a = " + a + ", b = " + b + " y c = " + c + " Son:");
        System.out.println("X1 = " + X1 + " y X2 = " + X2 + ".");
    }
}
