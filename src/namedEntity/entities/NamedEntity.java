package entities;


//This class models the notion of named entity

public class NamedEntity {
	String name;
	String category; 
	int frequency;
	String theme;
	
	public NamedEntity(String name, String category, int frequency, String theme) {
		super();
		this.name = name;
		this.category = category;
		this.frequency = frequency;
		this.theme = theme;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public void incFrequency() {
		this.frequency++;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
	

	@Override
	public String toString() {
		return "ObjectNamedEntity [name=" + name + ", frequency=" + frequency + ", category= " + category + ", theme=" + theme + "]";
	}
	public void prettyPrint(){
		System.out.println(this.getName() + " " + this.getFrequency() + " " + this.getCategory() + " " + this.getTheme());
	}
	
	
}



