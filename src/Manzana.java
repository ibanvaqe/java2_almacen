
public class Manzana {
//propiedades
private String tipoManzana;
private String procedencia;
private String color;
private Double eurosKilo;
private Distribuidor distribuidor;
private int cod_barras;

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

public void setCod_barras(int dato)
    {
        this.cod_barras=dato;
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
public int getCod_barras() 
 	{	
	return cod_barras;
 	}
}
