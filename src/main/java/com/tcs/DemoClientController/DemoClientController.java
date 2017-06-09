package com.tcs.DemoClientController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoClientController {
	@Autowired
	private RestTemplate restTemplate;
	@Value("${serverUrl}")
	private String serverUrl;
	@RequestMapping(value = "", method = RequestMethod.GET)
	public @ResponseBody String getMsg() {
		System.out.println("url is" +serverUrl);
		return restTemplate.getForObject(serverUrl, String.class );
	}
}
