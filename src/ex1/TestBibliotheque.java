package ex1;

public class TestBibliotheque {
	public static void main(String[] args) {
		Bibliotheque listdoc=new Bibliotheque(4);
		Document doc1=new Document("hello",1,6);
		Document article2=new article("what's up",2,7,"love","james");
		Document livre3=new livres("one direction",3,8,"liam");
		Document period4=new periodique("poo",4,12,6);
		listdoc.ajout_doc(livre3);
		listdoc.ajout_doc(article2);
		listdoc.ajout_doc(doc1);
		listdoc.ajout_doc(period4);
		listdoc.Inventaire_doc();
		listdoc.liste_article();
		listdoc.liste_docsimple();
		listdoc.liste_livre();
		listdoc.liste_periodique();
		
		
		
		
		
	}

}
