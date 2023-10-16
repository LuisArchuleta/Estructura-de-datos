package negocios;
import Datos.Contacto;
import Datos.Lista;
import Datos.PosicionIlegalException; 

public class ListaDeContactos {
	//Atributo
	private Lista<Contacto>contactos;
	//Metodo
	public ListaDeContactos() {
		contactos=new Lista<Contacto>();
		
	}
	public Lista<Contacto>mostrarTodosLosContactos(){
		try {
			for(int i=0;i<contactos.getTamanio();i++) {
				System.out.println(contactos.getValor(i).getNombres()+""+
									contactos.getValor(i).getApellidos()+""+
									contactos.getValor(i).getDireccion()+""+
									contactos.getValor(i).getCelular());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return contactos;	
	}
	public boolean agregarContacto(String nombres, 
		    String apellidos, String direccion, String correo,
			String telefono,String celular) throws PosicionIlegalException{
			Contacto con = buscarContacto(nombres,apellidos);
			if (con==null) //se puede agregar el contacto
			{
				Contacto nuevo = new Contacto(nombres,apellidos,
						direccion,correo,telefono,celular);
				contactos.agregar(nuevo);
				return true;
			}else {
				return false;
			}
		}
	public boolean eliminarContacto(String nombres, String 
		    apellidos) throws PosicionIlegalException{
		    	Contacto con = buscarContacto(nombres,apellidos);
		    	if (con != null){
		    		for(int i=0;i<this.contactos.getTamanio();i++) {
		    			if (contAux.getNombres().equals(nombres) &&
		    			contAux.getApellidos().equals(apellidos))
		    			{
		    				contactos.remover(i);
		    			}
		    			
		    		}return true;
		    		
		    	}else 
		    		return false;
		}
	public Contacto buscarContacto(String nombres,String apellidos) 
		    throws PosicionIlegalException{
			for (int i=0;i<contactos.getTamanio();i++) {
				Contacto con = contactos.getValor(i);
				if(nombres.equals(con.getNombres()) && 
						apellidos.equals(con.getApellidos())) {
					return con;
				}
			}
			return null; // no lo encontro, devuelve nula
		}
	/*Modificar los datos de un contacto dando sus nombres y apellidos. Si el usuario existe se modifican los datos regresa true
	 * si se pudo modificar y falso si no se pudo modificar
	 */
	
	public boolean modificarContacto(String nombres, String apellidos, String direccion, String correo, String telefono,
			String celular) throws PosicionIlegalException{
		//verifica si el contacto existe
		Contacto con= buscarContacto(nombres, apellidos);
		if(con==null) {
			return false;
		}
		//modifica el contacto con los nuevos datos
		con.setNombres(nombres);
		con.setApellidos(apellidos);
		con.setDireccion(direccion);
		con.setCorreo(correo);
		con.setTelefono(telefono);
		con.setCelular(celular);
		return true;
	}
	
	
	
	
}
