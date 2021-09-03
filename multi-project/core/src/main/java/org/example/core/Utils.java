package org.example.core;

import com.volha.tasks.examples.StringUtils;

//
//<groupId>com.epam.volha.tasks</groupId>
//<artifactId>utils</artifactId>
//<version>1.3.5</version>
public class Utils {
    //Create a project multi-project with two subprojects core and api.
    // The core subproject should contain class Utils with method boolean isAllPositiveNumbers(String... str).
    // Use utils-1.3.5.jar from the previous task to implement this method.
    public static boolean isAllPositiveNumbers(String... str) {
        boolean returnedValue = true;
        for ( String strEl : str ) {
            if (!StringUtils.isPositiveNumber(strEl)) {
                return false;
            }
        }
        return true;
    }
}
