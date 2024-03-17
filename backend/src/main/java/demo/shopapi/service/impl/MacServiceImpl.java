package demo.shopapi.service.impl;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import demo.shopapi.entity.Mac;
import demo.shopapi.service.MacService;

@Service
public class MacServiceImpl implements MacService {
	private static final Logger log = LoggerFactory.getLogger(MacServiceImpl.class);

	@Autowired
    private RestTemplate restTemplate;

	@Override
    public Mac findOne(String mac) {
		final String MAC_URI = "https://ce1e0lgvi3.execute-api.us-east-1.amazonaws.com/prod/api/v1/macs/{mac}";
		
		log.info("Query mac: " + mac);
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("mac", mac);
		
    	Mac macInfo = restTemplate.getForObject(MAC_URI, Mac.class, params);
    	
    	log.info("Response => " + macInfo.toString());
    	
    	return macInfo;
    }

}
