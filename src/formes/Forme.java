package formes;

public abstract class Forme {

	String id;
	String type = "forme";
	double x1;
	double x2;
	double y1;
	double y2;
	
	/*public static class Builder
	{
		String id;
		String type;
		double longueur = -1.0;
		double largeur = -1.0;
		double diagonale = -1.0;
		double rayon = -1.0;
		double x1 = 0.0;
		double x2 = 0.0;
		double y1 = 0.0;
		double y2 = 0.0;
		
		public Builder(String id, String type, double x1, double x2, double y1, double y2)
		{
			this.id = id;
			this.type = type;
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}
		public Builder longueur(double l)
		{
			this.longueur = l;
			return this;
		}
		public Builder largeur(double l)
		{
			this.largeur = l;
			return this;
		}
		public Builder diagonale(double d)
		{
			this.diagonale = d;
			return this;
		}
		public Builder rayon(double r)
		{
			this.rayon = r;
			return this;
		}
		
		public Forme build()
		{
			return new Forme(this);
		}
	} unused yet */
	
	Forme(String id, String type, double x1, double x2, double y1, double y2)
	{
		this.id = id;
		this.type = type;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public boolean bougeForme(double x1, double x2, double y1, double y2)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		return true;
	}
	
	public boolean afficheForme()
	{
		System.out.print("Je suis un(e) " + type + " aux coordonnées x : " + x1 + "," + x2 + "et y : " + y1 + "," + y2 + "\n");
		return true;
	}
	
}
