package com.volha.tasks.examples;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class StringUtils {
   public static boolean isPositiveNumber(String str){
       try {
           if (isNumeric(str)) {
               if (Long.parseLong(str) > 0) {
                   return true;
               }
           }
       }
       catch (NumberFormatException e){

       }
       return false;
   }
}
