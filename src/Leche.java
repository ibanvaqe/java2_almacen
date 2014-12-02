
public class Leche {
//propiedades
private String tipo;
private String procedencia;
private Double eurosLitro;
private Distribuidor distribuidor;

public void setTipo (String dato)
    {
        this.tipo=dato;
	}

public void setProcedencia(String dato)
    {
        this.procedencia=dato;
	}

public void setEurosLitro(Double dato)
    {
        this.eurosLitro=dato;
	}

public void setDistribuidor(Distribuidor dato)
    {
        this.distribuidor=dato;
	}	

public String getTipo() 
 	{	
	return tipo;
 	}

public String getProcedencia() 
 	{	
	return procedencia;
 	}


public Double getEurosLitro() 
 	{	
	return eurosLitro;
 	}
public Distribuidor getDistribuidor() 
 	{	
	return distribuidor;
 	}

}
