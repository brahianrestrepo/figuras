
package figuras.geometricas;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showOptionDialog;
public class FigurasGeometricas {
    static Scanner js= new Scanner (System.in);
    public static void main(String[] args) {
        Figura fig[]= new Figura[3];
          int op=  JOptionPane.showOptionDialog(null,"elige tu opcion","titulo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"cuadrado","triangulo"},"");
          if(op==0){
              JOptionPane.showOptionDialog(null,"elige area o perimetro","titulo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"perimetro","area"},""); 
                cuadrado cuad=new cuadrado();
                cuad.setBase(op);
                cuad.setAltura(op);
                cuad.getBase();
                cuad.getAltura();
               JOptionPane.showOptionDialog(null,cuad.area(),"el area del cuadrado es",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"aceptar","salir"},"");
          }
          
          else{
               JOptionPane.showOptionDialog(null,cuad.area(),"elige area o perimetro",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"aceptar","salir"},""); 
              triangulo tria=new triangulo();
          }
  
            
      

    }
}
   
   