package ex1;

public class Document {
	private String titre;
	private int num_id;
	private int nb_page;
	public void Edition() {
		System.out.println(
				"le titre : "+gettitre()+"\n le nombre des pages : "
				+ getnb_page());
		
	}
	public Document(String titre, int num_id,int nb_page)
	{
		this.titre=titre;
		this.num_id=num_id;
		this.nb_page=nb_page;
		
	}
	String gettitre() {
		return titre;
		
	}
	int getnum_id() {
		return num_id;
	}
	int getnb_page() {
		return nb_page;
	}

	
	

}
