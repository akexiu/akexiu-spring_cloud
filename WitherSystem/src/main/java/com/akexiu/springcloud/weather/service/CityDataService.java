package com.akexiu.springcloud.weather.service;

import java.util.List;

import com.akexiu.springcloud.weather.vo.City;

/**
 * City Data Service.
 */
public interface CityDataService {

	/**
	 * 获取City列表
	 * @return
	 * @throws Exception
	 */
	List<City> listCity() throws Exception;
}
