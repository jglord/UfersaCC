package segundaUnidade.PooPggq.lista1.biblioteca;

public class Livro {
	private String titulo, autor, status;
	private int quantPaginas;
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		if(!titulo.isEmpty()) {
			this.titulo = titulo;
		}
		else {
			System.out.println("Erro, título não pode ser vazio!");
		}
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		if(!autor.isEmpty()) {
			this.autor = autor;
		} 
		else {
			System.out.println("Erro, autor não pode ser vazio!");
		}
	}
	
	public int getQuantPaginas() {
		return quantPaginas;
	}
	
	public void setQuantPaginas(int quantPaginas) {
		if( quantPaginas >= 150 && quantPaginas <= 1000 ) {
			this.quantPaginas = quantPaginas;
		}
		else {
			System.out.println("Quantidade de paginas fora do padrão aceito nessa biblioteca.");
		}
			
	}
	
	public String isStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		if( status.equalsIgnoreCase("Disponivel") || status.equalsIgnoreCase("Emprestado")) {
			this.status = status;
		} 
		else {
			System.out.println("Opção invalida para o status do livro!");			
		}
	}		
	
}