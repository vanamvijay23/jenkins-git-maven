package com.test;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class SampleApplication
{
  public Object transform(HashMap hmUserDetails, HashMap hmEntitlementDetails, String sField)
  {
    String dateFieldValue = (String)hmUserDetails.get("farmershodresacceptdate");
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    SimpleDateFormat oimDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss z");
    String convertedDate = "";
    try {
      Date parsedDate = dateFormat.parse(dateFieldValue);
      convertedDate = oimDateFormat.format(parsedDate);
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }

    return convertedDate.toString();
  }
}
