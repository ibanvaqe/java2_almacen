import java.util.*;
import java.io.*;


public class Almacen {
	public static void main (String[] args)  throws IOException  {

	
		ArrayList <Distribuidor> adistri = new ArrayList <Distribuidor>(); 

		FileReader fr = new FileReader("distribuidores.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String [] campos = null;
		String linea;
		while((linea = br.readLine()) != null)
		{
			Distribuidor distri =new Distribuidor();
			Direccion dire =new Direccion();
			Contacto conta =new Contacto();	
			
			campos = linea.split(",");
			
			distri.setNombre(campos[0]);
			distri.setCIF(campos[1]);
	 		//DIRECCION
			dire.setCalle(campos[2]);
			dire.setNumero(Integer.parseInt(campos[3]));	
			dire.setLocalidad(campos[4]);	
			dire.setPais(campos[5]);	
	 		
	 		//CONTACTO
	 		conta.setNombre_c(campos[6]);
	 		conta.setApellido(campos[7]);
	 		conta.setDni(campos[8]);
	 		conta.setNacionalidad(campos[9]);	 		
	 		conta.setTelefono(Integer.parseInt(campos[10]));
	 		//completamos los datos del distribuidor con los objetos
			distri.setDireccion(dire);
			distri.setPersonaContacto(conta);
			//añadimos el objeto distribuidor al ArrayList
			adistri.add(distri);
			

		}


		for(int y=0;y<adistri.size();y++)
		{
				System.out.println("nombre: " + adistri.get(y).getNombre());
				System.out.println("C.I.F.: " + adistri.get(y).getCIF());
				
				System.out.println("direccion: ");
				
					System.out.println(" Calle:	" + adistri.get(y).getDireccion().getCalle());
					System.out.println(" Numero:	" + adistri.get(y).getDireccion().getNumero());
					System.out.println(" Localidad:	" + adistri.get(y).getDireccion().getLocalidad());
					System.out.println(" Pais:	" + adistri.get(y).getDireccion().getPais());
				
				System.out.println("persona de contacto: ");
					System.out.println("  Nombre:	" + adistri.get(y).getPersonaContacto().getNombre_c());
					System.out.println("  Apellido:	" + adistri.get(y).getPersonaContacto().getApellido());
					System.out.println("  DNI:	" + adistri.get(y).getPersonaContacto().getDni());
					System.out.println("  Nacionalidad:	" + adistri.get(y).getPersonaContacto().getNacionalidad());
					System.out.println("  Telefono:	" + adistri.get(y).getPersonaContacto().getTelefono());
			

		}
	Scanner sc = new Scanner(System.in);
	System.out.println("Informacion de los productos: ");
	String cadena="";

	//MANZANA
	ArrayList <Manzana> a_manza = new ArrayList <Manzana>();
	int contador=0;
		for (int x=0;x<2;x++)
		{
		contador=x+1;
		System.out.println("Manzana"+contador+":");
		Manzana manza = new Manzana();
		System.out.println("\n  tipo de manzana:");
		manza.setTipoManzana(sc.next());
		System.out.println("\n	procedencia:");
		manza.setProcedencia(sc.next());
		System.out.println("\n	color:");
		manza.setColor(sc.next());
		System.out.println("\n	euro/kilo:");
		manza.setEurosKilo(sc.nextDouble());			
		System.out.println("\n	Introduce el nombre del distribuidor:");
		cadena = sc.next();
		//recorremos el ArrayList de distribuidores para buscar el introducido
			for(int i=0; i<adistri.size(); i++){
				
				if (cadena.equalsIgnoreCase(adistri.get(i).getNombre())){
					
					manza.setDistribuidor(adistri.get(i));
				}
		}
			//añadimos la manzana al ArrayList
			a_manza.add(manza);	
		}

	//LECHUGA
		ArrayList <Lechuga> a_lechuga = new ArrayList <Lechuga>();
		System.out.println("Lechuga:");
		Lechuga lechuga = new Lechuga();
		System.out.println("\n  tipo de lechuga:");
		lechuga.setTipoLechuga(sc.next());
		System.out.println("\n	procedencia:");
		lechuga.setProcedencia(sc.next());
		System.out.println("\n	color:");
		lechuga.setColor(sc.next());
		System.out.println("\n	euro/Unidad:");
		lechuga.setEurosUnidad(sc.nextDouble());			
		System.out.println("\n	Introduce el nombre del distribuidor:");
		cadena = sc.next();
		//recorremos el ArrayList de distribuidores para buscar el introducido
			for(int i=0; i<adistri.size(); i++){
				
				if (cadena.equalsIgnoreCase(adistri.get(i).getNombre())){
					
					lechuga.setDistribuidor(adistri.get(i));
				}
			}
			//añadimos la manzana al ArrayList
			a_lechuga.add(lechuga);				

	//LECHE
	ArrayList <Leche> a_leche = new ArrayList <Leche>();
		for (int x=0;x<2;x++)
		{
		contador=x+1;
		System.out.println("Leche"+contador+":");
		Leche leche = new Leche();
		System.out.println("\n  tipo de leche:");
	leche.setTipo(sc.next());
		System.out.println("\n	procedencia:");
		leche.setProcedencia(sc.next());
		System.out.println("\n	euro/litro:");
		leche.setEurosLitro(sc.nextDouble());			
		System.out.println("\n	Introduce el nombre del distribuidor:");
		cadena = sc.next();
		//recorremos el ArrayList de distribuidores para buscar el introducido
			for(int i=0; i<adistri.size(); i++){
				
				if (cadena.equalsIgnoreCase(adistri.get(i).getNombre())){
					
					leche.setDistribuidor(adistri.get(i));
				}
		}
		
			//añadimos la manzana al ArrayList
			a_leche.add(leche);			
			
		}

		//visualizacion de los productos
		System.out.println("--Manzana--");

		for(int z = 0;z<a_manza.size();z++)	{
			System.out.println("Tipo de manzana: "+a_manza.get(z).getTipoManzana());
			System.out.println("Prcedencia: "+a_manza.get(z).getProcedencia());
			System.out.println("Color: "+a_manza.get(z).getColor());
			System.out.println("euro/Kg: "+a_manza.get(z).getEurosKilo());
			System.out.println("-DISTRIBUIDOR-");

			System.out.println("DISTRIBUIDOR: "+a_manza.get(z).getDistribuidor().getNombre());
			System.out.println("CIF:" + a_manza.get(z).getDistribuidor().getCIF());
			System.out.println("DIRECCION:" + a_manza.get(z).getDistribuidor().getDireccion().getCalle());
			System.out.println("NUMERO:" + a_manza.get(z).getDistribuidor().getDireccion().getNumero());
			System.out.println("LOCALIDAD:" + a_manza.get(z).getDistribuidor().getDireccion().getLocalidad());
			System.out.println("PAIS:" + a_manza.get(z).getDistribuidor().getDireccion().getPais());
			System.out.println("CONTACTO:" + a_manza.get(z).getDistribuidor().getPersonaContacto().getNombre_c() + " " + a_manza.get(z).getDistribuidor().getPersonaContacto().getApellido());
			System.out.println("DNI:" + a_manza.get(z).getDistribuidor().getPersonaContacto().getDni());
			System.out.println("NACIONALIDAD:" + a_manza.get(z).getDistribuidor().getPersonaContacto().getNacionalidad());
			System.out.println("TELEFONO:" + a_manza.get(z).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.println("*********************************************************");
		}
		
			System.out.println("--LECHUGA--");

		for(int z = 0;z<a_lechuga.size();z++)	{
			System.out.println("Tipo de manzana: "+ a_lechuga.get(z).getTipoLechuga());
			System.out.println("Prcedencia: "+ a_lechuga.get(z).getProcedencia());
			System.out.println("Color: "+ a_lechuga.get(z).getColor());
			System.out.println("euro/Kg: "+ a_lechuga.get(z).getEurosUnidad());
			System.out.println("-DISTRIBUIDOR-");

			System.out.println("DISTRIBUIDOR: "+a_lechuga.get(z).getDistribuidor().getNombre());
			System.out.println("CIF:" + a_lechuga.get(z).getDistribuidor().getCIF());
			System.out.println("DIRECCION:" + a_lechuga.get(z).getDistribuidor().getDireccion().getCalle());
			System.out.println("NUMERO:" + a_lechuga.get(z).getDistribuidor().getDireccion().getNumero());
			System.out.println("LOCALIDAD:" + a_lechuga.get(z).getDistribuidor().getDireccion().getLocalidad());
			System.out.println("PAIS:" + a_lechuga.get(z).getDistribuidor().getDireccion().getPais());
			System.out.println("CONTACTO:" + a_lechuga.get(z).getDistribuidor().getPersonaContacto().getNombre_c() + " " + a_lechuga.get(z).getDistribuidor().getPersonaContacto().getApellido());
			System.out.println("DNI:" + a_lechuga.get(z).getDistribuidor().getPersonaContacto().getDni());
			System.out.println("NACIONALIDAD:" + a_lechuga.get(z).getDistribuidor().getPersonaContacto().getNacionalidad());
			System.out.println("TELEFONO:" + a_lechuga.get(z).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.println("*********************************************************");
		}
		
			System.out.println("--LECHE--");

		for(int z = 0;z<a_leche.size();z++)	{
			System.out.println("Tipo de manzana: "+a_leche.get(z).getTipo());
			System.out.println("Prcedencia: "+a_leche.get(z).getProcedencia());
			System.out.println("euro/Kg: "+a_leche.get(z).getEurosLitro());
			System.out.println("-DISTRIBUIDOR-");

			System.out.println("DISTRIBUIDOR: "+a_leche.get(z).getDistribuidor().getNombre());
			System.out.println("CIF:" + a_leche.get(z).getDistribuidor().getCIF());
			System.out.println("DIRECCION:" + a_leche.get(z).getDistribuidor().getDireccion().getCalle());
			System.out.println("NUMERO:" +a_leche.get(z).getDistribuidor().getDireccion().getNumero());
			System.out.println("LOCALIDAD:" + a_leche.get(z).getDistribuidor().getDireccion().getLocalidad());
			System.out.println("PAIS:" + a_leche.get(z).getDistribuidor().getDireccion().getPais());
			System.out.println("CONTACTO:" + a_leche.get(z).getDistribuidor().getPersonaContacto().getNombre_c() + " " + a_leche.get(z).getDistribuidor().getPersonaContacto().getApellido());
			System.out.println("DNI:" + a_leche.get(z).getDistribuidor().getPersonaContacto().getDni());
			System.out.println("NACIONALIDAD:" + a_leche.get(z).getDistribuidor().getPersonaContacto().getNacionalidad());
			System.out.println("TELEFONO:" + a_leche.get(z).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.println("*********************************************************");
		}
		
	}

}