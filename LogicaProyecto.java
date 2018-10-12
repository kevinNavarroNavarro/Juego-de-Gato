
package proyectoprogramacion;

public class LogicaProyecto {
    
    
    public String GanarJugador(String a[][], int jugador){
        
    // Declaracion de Variables
        String salida = "Gana el jugador ", revisa= "";
        
        
    //Codigo
        if (jugador == 1)
            revisa = X;
        for (int f = 0; f<a.length;f++){
            for (int c = 0; c<a[0].length;c++){
                if (a[0][0]==revisa && a[1][0]==revisa && a[2][0]==revisa){
                    salida += jugador +""; 
                    c= a[0].length-1; 
                }
                else  if (a[0][1]==jugador && a[1][1]==jugador && a[2][1]==jugador)
                    salida += jugador +"";
                else  if (a[0][2]==jugador && a[1][2]==jugador && a[2][2]==jugador)
                    salida += jugador + "";
            }
        }
    return salida;
    }
    
     
