
package figuras.geometricas;

  public abstract class figuras {
     private float base,altura;
     public figuras(){}
     public void setBase(float base){
     this.base=base;
     }
    public void setAltura( float altura) {
        this.altura=altura;
    }
    public float getBase(){
            return base;
    }
    
    public float getAltura(){
        return altura;
    }
    abstract float area();
    abstract float perimetro();
}
            

