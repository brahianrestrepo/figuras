

package figuras.geometricas;
import java.util.Scanner;
import javax.swing.JOptionPane;
public  class cuadrado extends figuras {
    public cuadrado(){
        super();
        float num1,num2,area,altura,perim;
            JOptionPane.showInputDialog("ingrese numero1");
            JOptionPane.showInputDialog("ingrese numero2");
    }
    @Override
    float area(){
        return getBase()*getAltura();
    }
    @Override
    float perimetro(){
    return (getBase()*getAltura()*2);
}
}



