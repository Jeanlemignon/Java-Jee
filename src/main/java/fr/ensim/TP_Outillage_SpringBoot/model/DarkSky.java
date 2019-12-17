package fr.ensim.TP_Outillage_SpringBoot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DarkSky {
	
	 private float latitude;
	 private float longitude;
	 private String timezone;
	 Currently CurrentlyObject;
	 private float offset;


	 // Getter Methods 

	 public float getLatitude() {
	  return latitude;
	 }

	 public float getLongitude() {
	  return longitude;
	 }

	 public String getTimezone() {
	  return timezone;
	 }

	 public Currently getCurrently() {
	  return CurrentlyObject;
	 }

	 public float getOffset() {
	  return offset;
	 }

	 // Setter Methods 

	 public void setLatitude(float latitude) {
	  this.latitude = latitude;
	 }

	 public void setLongitude(float longitude) {
	  this.longitude = longitude;
	 }

	 public void setTimezone(String timezone) {
	  this.timezone = timezone;
	 }

	 public void setCurrently(Currently currentlyObject) {
	  this.CurrentlyObject = currentlyObject;
	 }

	 public void setOffset(float offset) {
	  this.offset = offset;
	 }
}
