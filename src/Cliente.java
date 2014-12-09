
public class Cliente {

//propiedades
private String nombre;
private String apellidos;
private String DNI_c;
private Dirección dirección;
private Double num_socio;
private Double dto;

public void setNombre (String dato)
    {
        this.nombre=dato;
	}

public void setApellidos (String dato)
    {
        this.apellidos=dato;
	}

public void setDni_c (String dato)
    {
        this.DNI_c=dato;
	}

public void setDireccion (Direccion dato)
    {
        this.direccion=dato;
	}