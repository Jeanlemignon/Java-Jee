package fr.ensim.TP_Outillage_SpringBoot.model;

import java.util.ArrayList;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
//@Entity
public class Response{
		//@Id
		//@GeneratedValue
		//private Long id;
		
		 private String type;
		 private String version;
		// @ElementCollection
		 //@OneToMany(fetch = FetchType.LAZY,mappedBy="psyQuestions")
		 ArrayList <Features> features; 
		 private String attribution;
		 private String licence;
		 private String query;
		 private float limit;

		 public Response() {
			 features = new ArrayList <Features>();
			}

		 // Getter Methods 

		 public ArrayList<Features> getFeatures() {
			return features;
		}

		public void setFeatures(ArrayList<Features> features) {
			this.features = features;
		}

		
		public String getType() {
		  return type;
		 }

		 

		public String getVersion() {
		  return version;
		 }

		 public void setLimit(float limit) {
				this.limit = limit;
			}

		 public String getAttribution() {
		  return attribution;
		 }

		 public String getLicence() {
		  return licence;
		 }

		 public String getQuery() {
		  return query;
		 }

		 public float getLimit() {
		  return limit;
		 }

		 // Setter Methods 

		 public void setType(String type) {
		  this.type = type;
		 }

		 public void setVersion(String version) {
		  this.version = version;
		 }
	
}
