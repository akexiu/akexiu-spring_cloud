package com.akexiu.springcloud.weather.service;

import com.akexiu.springcloud.weather.vo.Weather;

/**
 * Weather Report Service.
 */
public interface WeatherReportService {

	/**
	 * 根据城市ID查询天气信息
	 * @param cityId
	 * @return
	 */
	Weather getDataByCityId(String cityId);
}
