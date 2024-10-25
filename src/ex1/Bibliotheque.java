package ex1;

public class Bibliotheque {
	private Document[]Listdoc;
	private int nombre ;
	private int capacite;
	public Bibliotheque(int capacite) {
		this.capacite=capacite;
		Listdoc=new Document[capacite];
		
		
	}
	int getcapacite() {
		return capacite;
		
	}
	public void ajout_doc(Document d) {
		int i;
		if( nombre==0){
			d=Listdoc[0];
		}else {
			for(i=nombre-1;i>=0 && Listdoc[i]!=null && d.getnum_id()<Listdoc[i].getnum_id();i--) {
				Listdoc[i+1]=Listdoc[i];
				
				
			}Listdoc[i+1]=d;
			
		}
		nombre++;
		
		
	}
	public void Supprim_doc(int num) {
		int p=-1;
		for(int i=0;i<nombre;i++) {
			if(Listdoc[i].getnum_id()== num) {
				p=i;}
			
		}
		if (p != -1) {
            for (int i = p; i < nombre - 1; i++) {
                Listdoc[i] = Listdoc[i + 1];
            }
            Listdoc[nombre - 1] = null; 
        }
				
		
	}
	public void Inventaire_doc() {
		if(nombre == 0) {
			System.out.println("la bibliotheque est vide");
		}else {
			for(int j=0;j<nombre;j++) {	
				if (Listdoc[j]!=null) {
					Listdoc[j].Edition();
					
				}

			}
		}
		
	}
	int getnombre() {
		return nombre;
	}
	public Bibliotheque liste_livre() {
		Bibliotheque bib_livre=new Bibliotheque(capacite);
		for(int i=0;i<nombre;i++) {
			if(Listdoc[i] instanceof livres) {
				bib_livre.ajout_doc(Listdoc[i]);
				
				
			}
		}
		
		return bib_livre;
		
	}
	public Bibliotheque liste_article() {
		Bibliotheque bib_article=new Bibliotheque(capacite) ;
		for (int i=0;i<nombre;i++) {
			if(Listdoc[i] instanceof article) {
				bib_article.ajout_doc(Listdoc[i]);
				
			}
		}
		return bib_article;
		
	}
	public Bibliotheque liste_docsimple() {
		Bibliotheque bib_simple=new Bibliotheque(capacite);
		for(int i=0;i<nombre;i++) {
			if(Listdoc[i] instanceof Document) {
				bib_simple.ajout_doc(Listdoc[i]);
				
				
			
			}
		}
		return bib_simple;
	}
	public Bibliotheque liste_periodique() {
		Bibliotheque bib_period = new Bibliotheque (capacite);
		for(int i=0;i<nombre;i++) {
			if (Listdoc[i] instanceof periodique) {
				bib_period.ajout_doc(Listdoc[i]);
			}
		}
		return bib_period;
		
	}

}
