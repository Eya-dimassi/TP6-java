package ex1;

public class periodique extends Document {
	public periodique(String titre, int num_id, int nb_page,float frequence) {
		super(titre, num_id, nb_page);
		this.frequence=frequence;

	}

	public float getfrequence() {
		return frequence;
	}

	private float frequence;
	public void Edition() {
		super.Edition();
		System.out.println(" la fréquence de parution "+ getfrequence());
		
	}
	

}
