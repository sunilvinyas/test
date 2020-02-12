package com.example.demo;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

@RestController
@SuppressWarnings("serial")
public class GainersLoosersController {
	private static final Logger log = Logger.getLogger(GainersLoosersController.class.getName());

	@RequestMapping(value = "/gainerlooser", method = RequestMethod.GET)
	public String doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("In GainersLoosers CronJob");

		RestTemplate restTemplate = new RestTemplate();

		GainersLoosers gainer1 = restTemplate.getForObject(Constants.GAINERS1_URL, GainersLoosers.class);

		GainersLoosers gainer2 = restTemplate.getForObject(Constants.GAINERS2_URL, GainersLoosers.class);

		if (gainer2.getData() != null) {
			gainer1.addToList(gainer2.getData());
		}
		Gson gson = new Gson();
		String gainerJson = gson.toJson(gainer1);

		return gainerJson;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() throws IOException {
		return "Success";
	}

}