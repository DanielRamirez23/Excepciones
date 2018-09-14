
package excepciones;


public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    int arreglo []= new int[5];
        try {
            arreglo [5] = 1;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERRO: " + e.getMessage());
        }
        
        System.out.println("mensaje");
        
        String arreglo2 []= {"1", "2", "10", "n", "54"};
     
     
        int suma = 0;
        
      
         for (int contador = 0; 
                 contador < arreglo.length; contador ++){
            try{ 
              int  numero = Integer.parseInt (arreglo2[contador]);
              suma = suma + numero;
            }catch (NumberFormatException e){;
            System.out.println("Error al convertir "+ "el string a numero");
            }
         }
        
           
          
          System.out.println("suma: "+suma);
          try {
            int cantidad = Integer.parseInt(null);


            int deuda = cantidad * 2;
          }catch (NumberFormatException e){
              System.out.println("Error de cuenta");
            
            
          }
          try {
          String valor = null;
          int longitud = valor.length();
          }catch (NullPointerException e){
              System.out.println("El Valor no Exite");
          }
    
    
    
    
    
    
    }
    
}
