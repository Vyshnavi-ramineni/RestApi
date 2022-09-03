package com.vyshu.weatherdetails.exception;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.vyshu.weatherdetails.utility.WeatherConstants;

public class GenericException extends RuntimeException{
	private static final JsonObject jsonObject= new JsonObject();
    public GenericException() {
        JsonArray jsonErrorArray= new JsonArray();
        JsonObject jsonError= new JsonObject();
        jsonError.addProperty(WeatherConstants.ERROR_MESSAGE, WeatherConstants.GENERIC_EXCEPTION_MESSAGE);
        jsonError.addProperty(WeatherConstants.ERROR_CODE,WeatherConstants.GENERIC_EXCEPTION_CODE);
        jsonErrorArray.add(jsonError);
        jsonObject.addProperty(WeatherConstants.STATUS,WeatherConstants.ERROR);
        jsonObject.add(WeatherConstants.ERRORS,jsonErrorArray);
    }
    public String toString(){
        return jsonObject.toString();
    }
}


