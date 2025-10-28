package view;

import controllers.UsuarioController;

public class UsuarioView {
	
	public static void main(String[] args) {
		//String usuario = new UsuarioController().createUsuario("Ana", "Martin", "Fuerteventura"); 
		//String usuario = new UsuarioController().deleteUsuario(6);
		//String usuario = new UsuarioController().updateUsuario(1 , "Jazmin");
		String usuario = new UsuarioController().getUsuario(2);
		System.out.println(usuario);
	}
	
	
}
