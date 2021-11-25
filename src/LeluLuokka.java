
public class LeluLuokka {

	public static void main(String[] args) {
		
		
		
	}

}

class Lelu
{
	public String name;
	public int weight;
	
	public void liiku()
	{
		System.out.println("Lelu liikkuu");
	}
	
	public void tulostaTiedot()
	{
		System.out.println("Nimi: " + name);
		System.out.println("Paino: " + weight);
	}
}

class Vieteri extends Lelu
{
	int nopeus;
	
	public void kiihdyta()
	{
		nopeus = nopeus + 1;
	}
	
	@Override
	public void tulostaTiedot()
	{
		System.out.println("Nimi: " + name);
		System.out.println("Paino: " + weight);
		System.out.println("Nopeus: " + nopeus);
	}
}