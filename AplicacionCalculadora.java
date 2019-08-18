/**
 * Calculadora de Operaciones basicas
 *
 * @authors(JOSE RAFAEL MORALES PARRA
 *          SAMUEL ALBERTO NARANJO LOAIZA
 *          WILLIAM FERNANDO VANEGAS )
 * @version (1_20190808)
 *
 */
public class AplicacionCalculadora
{
      public static void main (String[] args)  
  {
        boolean prueba = false;    
        Scanner adquirir = new Scanner(System.in);
        String calculo;
        double respuesta= 0;
 
        do{
            String primerdigi;
            do {
                System.out.println("\n Escriba el primer numero para calcular ");
                primerdigi = adquirir.nextLine();
            } while (!primerdigi.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double num1 = new Double(primerdigi);
            double numero1 = Double.parseDouble(primerdigi);
            
           
            do {
                System.out.println("\n escoja que metodo de calculo desea usar");
                System.out.println("use el simbolo para escoger \n + = suma \n - = resta \n"
                        + " x = multiplicacion \n / = division \n * = potencia."
                        + "\n % = residual");
            calculo = adquirir.nextLine();
                if (calculo.equals("+") || calculo.equals("-") || calculo.equals("x") ||
                    calculo.equals("X") || calculo.equals("/") || calculo.equals("%") ||
                    calculo.equals("*")) {
                    prueba = true;
                }else { prueba = false; }
            } while (prueba != true);
  }
}
