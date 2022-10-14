package Ex3;

public class FuncionesAuxiliares {
	
	public static String masPaginas(Libro l1, Libro l2){	//funcion para calcular que libro tiene mas paginas
		
		if(l1.getPaginas()>l2.getPaginas()) {	//comparamos las paginas de los libros pasados con su getter
			return l1.getTitulo();
		}else if(l1.getPaginas()<l2.getPaginas()) {
			return l2.getTitulo();
		}else return "Ambos libros tienen las mismas paginas";
		
	}

}
