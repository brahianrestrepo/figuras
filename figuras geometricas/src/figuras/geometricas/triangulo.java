
package figuras.geometricas;

import javax.swing.JOptionPane;

public class triangulo extends figuras {
    float lado1,lado2,altura,perimetro;
     public triangulo(){
        super();
        JOptionPane.showInputDialog("ingre lado1");
        JOptionPane.showInputDialog("ingrese lado2");
    }
     public float getlado1(){
        return lado1;
                }
     public float setlado1(){
       return  this.lado1=lado1;
        
     }
       public float setlado2(){
       return  this.lado2=lado2;
        
     }
      public float getlado2(){
        return lado2;
      }
      
      
    @Override
    float area(){
        return getBase()*getAltura()/2;
    }
    @Override
    float perimetro(){
    return (getBase()+lado1+lado2);
}
}
