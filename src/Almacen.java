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
				/*
				System.out.println("direccion: ");
					System.out.println("	" + adistri.get(y).getDireccion().getCalle);
					System.out.println("	" + adistri.get(y).getDireccion().getNumero);
					System.out.println("	" + adistri.get(y).getDireccion().getLocalidad);
					System.out.println("	" + adistri.get(y).getDireccion().getPais);
					*/
				System.out.println("persona de contacto: ");
					System.out.println("  Nombre:	" + adistri.get(y).getPersonaContacto().getNombre_c());
					System.out.println("  Apellido:	" + adistri.get(y).getPersonaContacto().getApellido());
					System.out.println("  DNI:	" + adistri.get(y).getPersonaContacto().getDni());
					System.out.println("  Nacionalidad:	" + adistri.get(y).getPersonaContacto().getNacionalidad());
					System.out.println("  Telefono:	" + adistri.get(y).getPersonaContacto().getTelefono());
			

		}



	}
}