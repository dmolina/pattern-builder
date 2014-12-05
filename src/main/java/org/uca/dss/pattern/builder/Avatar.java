package org.uca.dss.pattern.builder;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Avatar {
	public enum Hair { BLONDE, BLACK };
	public enum Sex { MAN, WOMAN };
	
	private Hair hair;
	private Sex sex;
	private double weight;
	private double height;
	
	private Color colorEyes;
	private Color colorSkin;
	
	
	public Avatar() {
		weight = height = -1;
	}
	
	@Override
	public String toString() {
		 Map<Color, String> colorMap = new HashMap<Color, String>();
	       colorMap.put(Color.BLACK, "Black"); 
	       colorMap.put(Color.RED, "Red");  
	       
	       Map<Hair, String> hairColorMap = new HashMap<Hair, String>();
	       hairColorMap.put(Hair.BLACK, "Black"); 
	       hairColorMap.put(Hair.BLONDE, "Blonde");  
	       
		StringBuilder output = new StringBuilder();
		
		output.append("Is a " + (sex == Sex.MAN ? "man" : "woman"));
		output.append(" with " +colorMap.get(colorEyes) +" eyes");
		output.append(" with " +hairColorMap.get(hair) +" hair");
		
		output.append(String.format(" with height %.0f", height));
		output.append(String.format(" and weight %.0f", weight));
		return output.toString();
	}

	/**
	 * @return the colorEyes
	 */
	public Color getColorEyes() {
		return colorEyes;
	}

	/**
	 * @param colorEyes the colorEyes to set
	 */
	public void setColorEyes(Color colorEyes) {
		this.colorEyes = colorEyes;
	}

	/**
	 * @return the colorSkin
	 */
	public Color getColorSkin() {
		return colorSkin;
	}

	/**
	 * @param colorSkin the colorSkin to set
	 */
	public void setColorSkin(Color colorSkin) {
		this.colorSkin = colorSkin;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the sex
	 */
	public Sex getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(Sex sex) {
		this.sex = sex;
	}

	/**
	 * @return the hair
	 */
	public Hair getHair() {
		return hair;
	}

	/**
	 * @param hair the hair to set
	 */
	public void setHair(Hair hair) {
		this.hair = hair;
	}
}