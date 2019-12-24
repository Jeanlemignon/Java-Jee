package fr.ensim.TP_Outillage_SpringBoot.controller;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import fr.ensim.TP_Outillage_SpringBoot.model.DarkSky;
import fr.ensim.TP_Outillage_SpringBoot.model.Response;


@Controller
public class MeteoController {

	@PostMapping(path ="/meteo")
	public String meteo(@RequestBody String addresse,Model model) {
		
		//Secret Key DarkSky
		String Key ="e8261859bb5f610954076bc11e526602";
		
		/*SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.univ-lemans.fr", 3128));
		clientHttpReq.setProxy(proxy);
		RestTemplate restTemplate = new RestTemplate(clientHttpReq);*/
	RestTemplate restTemplate = new RestTemplate();
		
		
		Response responseGouv = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+addresse, Response.class);
		
		double longitude = responseGouv.getFeatures().get(0).getGeometry().getCoordinates().get(0);
		double latitude = responseGouv.getFeatures().get(0).getGeometry().getCoordinates().get(1);
		DarkSky darkSky = restTemplate.getForObject("https://api.darksky.net/forecast/"+Key+"/"+latitude+","+longitude, DarkSky.class);
		//DarkSky
		model.addAttribute("meteo",darkSky);
		//API GOUV
		model.addAttribute("adresse",responseGouv.getFeatures().get(0).getProperties().getContext());
		model.addAttribute("ville",responseGouv.getFeatures().get(0).getProperties().getCity());
		
		
		model.addAttribute("adresse", responseGouv.getType());
		
		//On teste la recuperation de la variable
		//model.addAttribute("adresse", addresse);
		return "meteo";
	}
}
