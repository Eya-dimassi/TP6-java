package ex1;

public class article extends Document {
	public article(String titre, int num_id, int nb_page,String nom,String auteur) {
		super(titre, num_id, nb_page);
		this.auteur=auteur;
		this.nom=nom;
	}
	private String nom;
	private String auteur;
	String getnom() {
		return nom;
	}
	String getauteur() {
		return auteur;
	}
	public void Edition() {
		super.Edition();
		System.out.println(
				"\n le nom d'article : "+getnom()
				+"\nle nom d'auteur : "+getauteur());
		
	}

}
