
public class LeluLuokka {

	public static void main(String[] args) {
		
		Lelu lelu = new Lelu("Hyrrä", 15);
		lelu.tulostaTiedot();
		
		VieteriAuto auto = new VieteriAuto("Auto", 14, 12);
		auto.tulostaTiedot();
		auto.kiihdyta();
		
	}

}

class Lelu
{
	public String name;
	public int weight;
	
	public Lelu()
	{
		name = "";
		weight = 0;
	}
	
	public Lelu(String lelunNimi, int lelunPaino)
	{
		name = lelunNimi;
		weight = lelunPaino;
	}
	
	public void liiku()
	{
		System.out.println("Lelu liikkuu");
	}
	
	public void tulostaTiedot()
	{
		System.out.println("Nimi: " + name);
		System.out.println("Paino: " + weight + "g");
	}
}

class VieteriAuto extends Lelu
{
	int nopeus;
	
	public VieteriAuto()
	{
		nopeus = 0;
	}
	
	public VieteriAuto(String autonNimi, int autonPaino, int autonNopeus)
	{
		name = autonNimi;
		weight = autonPaino;
		nopeus = autonNopeus;
	}
	
	public void kiihdyta()
	{
		nopeus = nopeus + 1;
		tulostaTiedot();
	}
	
	@Override
	public void tulostaTiedot()
	{
		System.out.println("Nimi: " + name);
		System.out.println("Paino: " + weight + "g");
		System.out.println("Nopeus: " + nopeus);
	}
}