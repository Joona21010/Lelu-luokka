
public class LeluLuokka {

	public static void main(String[] args) {
		
		
	}

}

class Lelu
{
	String name;
	int weight;
	
	public Lelu(String n, int w)
	{
		name = n;
		weight = w;
	}
	
	public void liiku()
	{
		System.out.println("Lelu liikkuu");
	}
	
	public void tulostaTiedot()
	{
		System.out.println("Nimi: " + name);
		System.out.println("Paino " + weight);
	}
}