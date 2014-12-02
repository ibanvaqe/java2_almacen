
public class Direccion {
//propiedades
private String calle;
private int numero;
private String localidad;
private String pais;

public void setCalle (String dato)
    {
        this.calle=dato;
	}

public void setNumero (int dato)
    {
        this.numero=dato;
	}

public void setPais(String dato)
    {
        this.pais=dato;
	}

public void setLocalidad(String dato)
    {
        this.localidad=dato;
	}



public String getCalle() 
 	{	
	return calle;
 	}

public int getNumero() 
 	{	
	return numero;
 	}

public String getPais() 
 	{	
	return pais;
 	}
public String getLocalidad() 
 	{	
	return localidad;
 	}


}
