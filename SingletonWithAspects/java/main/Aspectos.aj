package main;

public aspect Aspectos {
    pointcut verificacion(Usuario usuario):execution(void Usuario.eleccion(..))&& this(usuario);
    
   // public void verificarSeleccionLibro() {}
    
    before(Usuario usuario): verificacion(usuario){
   
        System.out.println("Processing books...");
    }
    
    after(Usuario usuario): verificacion(usuario) {
        String libro = usuario.getlibro();
        if (Libreria.getInstance().LibroDisponible().contains(libro)) {
            System.out.println("Book available: " + libro + "\n");
        }
        else {
        	System.out.println("Book not available: " + libro + ". Please try again.\n");
        }
    }
       

    
    
    
  
}
