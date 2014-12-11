import java.util.ArrayList;
public class Cesta {
//propiedades

private ArrayList<Manzana> manzanas;
private ArrayList<Leche> leches;
private ArrayList<Lechuga> lechugas;
    
    public void setManzanas(ArrayList<Manzana> dato)
    {
        this.manzanas=dato;
    }

    public void setLeches(ArrayList<Leche> dato)
    {
        this.leches=dato;
    }
    public void setLechugas(ArrayList<Lechuga> dato)
    {
        this.lechugas=dato;
    }
    
    public  ArrayList<Manzana> getManzanas() 
 	{	
	return manzanas;
 	}
 	public  ArrayList<Leche> getLeches() 
 	{	
	return leches;
 	}
    public  ArrayList<Lechuga> getLechugas() 
 	{	
	return lechugas;
 	}
}