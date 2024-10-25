package ex1;

public class livres extends Document{
	
	public livres(String titre, int num_id, int nb_page, String nom_edit) {
		super(titre, num_id, nb_page);
		this.nom_edit=nom_edit;
	}

	private String nom_edit;
    String getnom_edit() {
    	return nom_edit;
    }
	public void Edition() {
		super.Edition();
		System.out.println(
				"le nom d'editeur : "+getnom_edit());
		
	}
}
