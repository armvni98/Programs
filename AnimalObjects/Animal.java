class Animal
{
	private String name;
	private int birthYear;
	private double weight;
	private char gender;

	public Animal(String name,int birthYear,double weight,char gender)// argument constructor
	{
		this.name = name;
		this.birthYear = birthYear;
		this.weight = weight;
		this.gender = gender;
	}

	public void printDetails()
	{
		System.out.println("Animal Name : "+name);
		System.out.println("Birth Year : "+birthYear);
		System.out.println("Weight : "+ weight);
		System.out.println("Gender :"+gender);
		System.out.println("\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}