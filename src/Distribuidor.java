
public class Distribuidor {
//propiedades
private String nombre;
private String CIF;
private Direccion direccion;
private Contacto personaContacto;

public void setNombre (String dato)
    {
        this.nombre=dato;
	}

public void setCIF (String dato)
    {
        this.CIF=dato;
	}

public void setDireccion(Direccion dato)
    {
        this.direccion=dato;
	}

public void setPersonaContacto(Contacto dato)
    {
        this.personaContacto=dato;
	}



public String getNombre() 
 	{	
	return nombre;
 	}

public String getCIF() 
 	{	
	return CIF;
 	}

public Direccion getDireccion() 
 	{	
	return direccion;
 	}
public Contacto getPersonaContacto() 
 	{	
	return personaContacto;
 	}


}
