package fr.ensim.TP_Outillage_SpringBoot.model;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry {
	private String type;
	 ArrayList < Double > coordinates = new ArrayList < Double > ();


	 // Getter Methods 

	 public String getType() {
	  return type;
	 }

	 // Setter Methods 

	 public void setType(String type) {
	  this.type = type;
	 }

	public ArrayList<Double> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(ArrayList<Double> coordinates) {
		this.coordinates = coordinates;
	}
}
