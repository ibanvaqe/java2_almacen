
public class Direccion {
//propiedades
private String calle;
private int numero;
private String puerta;
private String localidad;

public void setCalle (String dato)
    {
        this.calle=dato;
	}

public void setNumero (int dato)
    {
        this.numero=dato;
	}

public void setPuerta(String dato)
    {
        this.puerta=dato;
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

public String getPuerta() 
 	{	
	return puerta;
 	}
public String getLocalidad() 
 	{	
	return localidad;
 	}


}
