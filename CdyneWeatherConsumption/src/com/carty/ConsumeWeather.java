package com.carty;
import com.cdyne.ws.weatherws.Weather;
import com.cdyne.ws.weatherws.WeatherSoap;


//This worked but the server was not responding...
//WSDL from http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL

public class ConsumeWeather {

	public static void main (String[] args){
		Weather service = new Weather();
		WeatherSoap port = service.getWeatherSoap();
		System.out.println(port.getCityForecastByZIP("33409"));
		System.out.println(port.getCityForecastByZIP("33409").getCity());
		System.out.println(port.getCityWeatherByZIP("33409"));
		System.out.println(port.getWeatherInformation());
	}
}
