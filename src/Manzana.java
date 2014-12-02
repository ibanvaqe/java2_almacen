
public class Manzana {
//propiedades
private String tipoManzana;
private String procedencia;
private String color;
private Double eurosKilo;
private Distribuidor distribuidor;

public void setTipoManzana (String dato)
    {
        this.tipoManzana=dato;
	}

public void setProcedencia(String dato)
    {
        this.procedencia=dato;
	}

public void setColor(String dato)
    {
        this.color=dato;
	}

public void setEurosKilo(Double dato)
    {
        this.eurosKilo=dato;
	}

public void setDistribuidor(Distribuidor dato)
    {
        this.distribuidor=dato;
	}	

public String getTipoManzana() 
 	{	
	return tipoManzana;
 	}

public String getProcedencia() 
 	{	
	return procedencia;
 	}

public String getColor() 
 	{	
	return color;
 	}
public Double getEurosKilo() 
 	{	
	return eurosKilo;
 	}
public Distribuidor getDistribuidor() 
 	{	
	return distribuidor;
 	}

}
