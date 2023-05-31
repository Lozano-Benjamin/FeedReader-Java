package heuristic;

import java.util.Map;
import java.util.HashMap;

public abstract class Heuristic {

	private static Map<String, String> categoryMap = Map.of(
		"Marvel", "Organization", 
		"Apple", "Organization", 
		"Google", "Organization",
		"Musk", "Person",
		"Biden", "Person",
		"Trump", "Person",
		"Messi", "Person",
		"Federer", "Person",
		"USA", "Country",
		"Russia", "Country"
		);


private static Map<String, String> themeMap = Map.of(
		"Marvel", "Cinema", 
		"Apple", "OthersP", 
		"Google", "OthersP",
		"Musk", "Politics",
		"Biden", "Politics",
		"Trump", "Politics",
		"Messi", "Football",
		"Federer", "Tenis",
		"USA", "International",
		"Russia", "International"
		);
	
	public String getCategory(String entity){
		return categoryMap.get(entity);
	}
	
	public String getTheme(String entity){
		return themeMap.get(entity);
	}
	
	public abstract boolean isEntity(String word);
		
}
