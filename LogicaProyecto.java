
package proyectoprogramacion;

public class LogicaProyecto {
    
    
    public String GanarColunmaX(String a[][]){
        
    // Declaracion de Variables
        String salida = "Gana el jugador ", x= "";
        
    //Codigo
        for (int f = 0; f<a.length;f++)
            for (int c = 0; c<a[0].length;c++){
                if (a[0][0]==x && a[1][0]==x && a[2][0]==x){
                    salida += "Uno"; 
                    c= a[0].length-1; 
                }
                else  if (a[0][1]==x && a[1][1]==x && a[2][1]==x)
                    salida += "Uno";
                else  if (a[0][2]==x && a[1][2]==x && a[2][2]==x)
                    salida += "Uno";
                
                
            }
    return salida;
    }
    
     public String GanarColunmaO(String a[][]){
        
    // Declaracion de Variables
        String salida = "Gana el jugador ", o = "";
        
    //Codigo
        for (int f = 0; f<a.length;f++)
            for (int c = 0; c<a[0].length;c++){
                if (a[0][0]==o && a[1][0]==o && a[2][0]==o){
                    salida += "Uno"; 
                    c= a[0].length-1; 
                }
                else  if (a[0][1]==o && a[1][1]==o && a[2][1]==o)
                    salida += "Uno";
                else  if (a[0][2]==o && a[1][2]==o && a[2][2]==o)
                    salida += "Uno";
                
                
            }
    return salida;
    }
}
