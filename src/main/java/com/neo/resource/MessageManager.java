package com.neo.resource;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageManager {
    private static ResourceBundle resourceBundle =
            ResourceBundle.getBundle("messages", Locale.getDefault());

    private MessageManager(){
    }

    public static void ChangeLocale(){
        resourceBundle =
                ResourceBundle.getBundle("messages", Locale.getDefault());
    }

    public static String getProperty(String key){
        return resourceBundle.getString(key);
    }
}

