package com.model.files_ds;

import com.model.IFiles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/** КЛАСС РАБОТЫ С ФАЙЛАМИ */
public class FilesDS implements IFiles {
    private final String currentPath;     //Корневой путь приложения
    private final String settingsPath;    //Каталог установок приложения
    private final Properties properties;  // Параметры приложения
    private static final Logger logger = LogManager.getLogger(); //Логгер


    /** КОНСТРУКТОР */
    public FilesDS(String propFileName){
        String currentPath;
        try {
            currentPath = new File(".").getCanonicalPath();
        } catch (Exception e){
            currentPath = null;
            logger.error("Ошибка получения базового каталога: "+e);
        }
        this.currentPath = currentPath;
        this.settingsPath = currentPath+"\\app_settings\\";
        this.properties = getProperties(propFileName);
    }

    /** ПОЛУЧЕНИЕ НАСТРОЕК ПРИЛОЖЕНИЯ */
    private Properties getProperties(String propFileName) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(settingsPath+propFileName));
            return properties;
        }
        catch (IOException e) {
            logger.error("Ошибка получения настроек приложения: "+e);
            System. exit(0);
        }
        return null;
    }

    /** ПОЛУЧЕНИЕ НАСТРОЕК ПРИЛОЖЕНИЯ */
    @Override
    public Properties getAppProperties() {
        return properties;
    }
}
