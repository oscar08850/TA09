package Ex3;

public class FuncionesAuxiliares {
	
	public static String masPaginas(Libro l1, Libro l2){
		
		if(l1.getPaginas()>l2.getPaginas()) {
			return l1.getTitulo();
		}else if(l1.getPaginas()<l2.getPaginas()) {
			return l2.getTitulo();
		}else return "Ambos libros tienen las mismas páginas";
		
	}

}
