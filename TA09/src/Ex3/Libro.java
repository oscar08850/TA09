package Ex3;

public class Libro {
	
	// Atributos //
		private String ISBN;

		private String titulo;
		
		private String autor;

		private int paginas;

		public Libro(String iSBN, String titulo, String autor, int paginas) {
			this.ISBN = iSBN;
			this.titulo = titulo;
			this.autor = autor;
			this.paginas = paginas;
		}

		public String getTitulo() {
			return titulo;
		}

		public int getPaginas() {
			return paginas;
		}
		
		@Override
		public String toString() {
			return "El libro "+ titulo + " con ISBN " + ISBN + " creado por el autor " + autor + " tiene "+ paginas + " paginas" ;
		}
		
		

}
