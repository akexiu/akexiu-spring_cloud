package com.akexiu.springcloud.weather.service.impl;

import com.akexiu.springcloud.weather.service.WeatherDataService;
import com.akexiu.springcloud.weather.service.WeatherReportService;
import com.akexiu.springcloud.weather.vo.Weather;
import com.akexiu.springcloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * Weather Report Service.
 * 
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {
	@Autowired
	private WeatherDataService weatherDataService;
	
	@Override
	public Weather getDataByCityId(String cityId) {
		WeatherResponse resp = weatherDataService.getDataByCityId(cityId);
		return resp.getData();
	}

}
