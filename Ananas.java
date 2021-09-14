/**
 *
 * @author roudet
 */
public class Ananas {
    private double prix;
    private String origine;
	
    public Ananas() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Ananas(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Ananas de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Ananas an = (Ananas) o;
            return (prix == an.prix && origine.equals(an.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test ananas");
	Ananas a = new Ananas(2, "France");
	Double prix = a.getPrix();
	String Origine =  a.getOrigine();
	//test diff github
	System.out.println("test diff github");	
	System.out.println(a);
	a.setOrigine("Maroc");
	System.out.println(a);
   }
}
