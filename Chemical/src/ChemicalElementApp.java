class ChemicalElement
{
	private int atomicNumber;int i;
	private String fullName;
	private String symbolicName;
	ChemicalElement(int atomicNumber,String fullName,String symbolicName)
	{
		this.atomicNumber = atomicNumber;
		this.fullName = fullName;
		this.symbolicName = symbolicName;
	}
	public boolean isAlkali()
	{
		if(atomicNumber == 3 || atomicNumber == 11 ||atomicNumber == 19 || atomicNumber == 37 ||atomicNumber == 55||atomicNumber == 87)
			return true;
		else
			return false;
	}
	public boolean isTransition()
	{
		if((atomicNumber >= 21 && atomicNumber <= 31) || (atomicNumber >= 39 && atomicNumber <= 48)||(atomicNumber >= 72 && atomicNumber <= 80) || (atomicNumber >= 104 && atomicNumber <= 112))
			return true;
		else
			return false;
	}
	public boolean isMetal()
	{
		if(atomicNumber == 13 || atomicNumber == 49 ||atomicNumber == 50 || atomicNumber == 81 ||atomicNumber == 82||atomicNumber == 83 || (atomicNumber >= 113 && atomicNumber <= 116))
			return true;
		else
			return false;
	}
	public boolean equals(Object o) {
		ChemicalElement temp = (ChemicalElement) o;
		if(atomicNumber==temp.atomicNumber && fullName==temp.fullName && symbolicName==temp.symbolicName)
			return true;
		else
			return false;
	}
	public int getAtomicNumber() {
		return atomicNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public String getSymbolicName() {
		return symbolicName;
	}
	
}



public class ChemicalElementApp {

	public static void main(String[] args) {
		
		ChemicalElement c = new ChemicalElement(3,"Hydrogen","H");
		ChemicalElement ch = new ChemicalElement(3,"Hydrogen","H");
		if(c.equals(ch))
			System.out.println("objects are same");
		else
			System.out.println("objects are not same");
		if(c.isAlkali()==true)
			System.out.println("It is Alkali");
		else if(c.isAlkali()==true)
			System.out.println("It is Transition");
		else if(c.isAlkali()==true)
			System.out.println("It is Metal");

	}

}
