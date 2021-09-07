package com.volha.tasks.examples;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class StringUtils {

   public static boolean isPositiveNumber(String str) {
       if (str==null||str==""){
           return false;
       }
       try {
           return isNumeric(str) && (Long.parseLong(str) > 0);
       } catch (NumberFormatException e) {
           return false;
       }
   }
}
