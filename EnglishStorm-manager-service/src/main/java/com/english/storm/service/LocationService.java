package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;
/**
 * @author guobaolun
 */
public interface LocationService {
	EnglishStormResult updateLocation( String token,int type,String country, String province, String city, String area) throws IOException;
}
