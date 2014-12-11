
public class Cliente {

//propiedades
private String nombre_cli;
private String apellidos;
private String DNI_c;
private Direccion direccion;
private Double num_socio;
private Double dto;

public void setNombre_cli (String dato)
    {
        this.nombre_cli=dato;
	}

public void setApellidos (String dato)
    {
        this.apellidos=dato;
	}

public void setDNI_c (String dato)
    {
        this.DNI_c=dato;
	}

public void setDireccion (Direccion dato)
    {
        this.direccion=dato;
	}
	
public void setNum_socio (Double dato)
    {
        this.num_socio=dato;
	}
	
public void setDto (Double dato)
    {
        this.dto=dato;
	}

public String getNombre_cli() 
 	{	
	return nombre_cli;
 	}

public String getApellidos() 
 	{	
	return apellidos;
 	}
 
public String getDNI_c() 
 	{	
	return DNI_c;
 	}
 
public Direccion getDireccion() 
 	{	
	return direccion;
 	}

public Double getNum_socio() 
 	{	
	return num_socio;
 	}
 	
public Double getDto() 
 	{	
	return dto;
 	}

}