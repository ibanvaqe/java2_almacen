

public class Contacto {
//propiedades
private String nombre_c;
private String apellido;
private String dni;
private String nacionalidad;
private int telefono;

public void setNombre_c (String dato)
    {
        this.nombre_c=dato;
	}

public void setApellido (String dato)
    {
        this.apellido=dato;
	}

public void setDni(String dato)
    {
        this.dni=dato;
	}

public void setNacionalidad(String dato)
    {
        this.nacionalidad=dato;
	}

public void setTelefono(int dato)
    {
        this.telefono=dato;
	}


public String getNombre_c() 
 	{	
	return nombre_c;
 	}

public String getApellido() 
 	{	
	return apellido;
 	}

public String getDni() 
 	{	
	return dni;
 	}
public String getNacionalidad() 
 	{	
	return nacionalidad;
 	}
public int getTelefono() 
 	{	
	return telefono;
 	}

}
