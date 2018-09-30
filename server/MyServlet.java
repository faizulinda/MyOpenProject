package com.mySampleApplication.MyOpenProject.server;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;

public class MyServlet extends HttpServlet {
    private Properties supportedLanguages;
    private Locale requestLocale = (Locale) supportedLanguages.get("DEFAULT");

    //список локалей, которые поддерживает приложение
    public MyServlet(){
        supportedLanguages = new Properties();
        supportedLanguages.put("DEFAULT", Locale.US);
        supportedLanguages.put("de-DEFAULT", Locale.GERMANY);
        supportedLanguages.put("de_AT", new Locale("de", "AT"));
        supportedLanguages.put("de_CH", new Locale("de", "CH"));
        supportedLanguages.put("ja_JP", Locale.JAPAN);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        detectLocale(request);
        
        super.doPost(request, response);
    }

    //определение локали, HTTP заголовок Accept-Language сообщает серверу предпочтительную локаль.
    private void detectLocale(HttpServletRequest request) {
        Enumeration locales = request.getLocales();
        while (locales.hasMoreElements()) {
            Locale locale = (Locale) locales.nextElement();
            if (supportedLanguages.contains(locale)) {
                requestLocale = locale;
                break;
            }
        }
    }

}
