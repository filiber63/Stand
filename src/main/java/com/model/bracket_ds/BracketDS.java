package com.model.bracket_ds;

import com.model.IBracket;
import com.model.IFiles;
import jssc.SerialPort;
import jssc.SerialPortException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** КЛАСС ОБМЕНА ДАННЫМИ С КРОНШТЕЙНОМ */
public class BracketDS implements IBracket {
    private final SerialPort bracketPort; //COM-порт
    private static final Logger logger = LogManager.getLogger(); //Логгер

    /** КОНСТРУКТОР */
    public BracketDS(IFiles iFiles){
        // Создаем порт
        bracketPort = new SerialPort(iFiles.getAppProperties().getProperty("com1"));
        try {
            // Открываем порт
            bracketPort.openPort();
            // Выставляем параметры
            bracketPort.setParams(SerialPort.BAUDRATE_9600,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);
            // Включаем аппаратное управление потоком
            bracketPort.setFlowControlMode(SerialPort.FLOWCONTROL_RTSCTS_IN | SerialPort.FLOWCONTROL_RTSCTS_OUT);
            // Устанавливаем ивент лисенер и маску
//            serialPort.addEventListener(new PortReader(), SerialPort.MASK_RXCHAR);
        }
        catch (SerialPortException e) {
            logger.error("Ошибка инициализации COM-порта: "+e);
        }
    }

    /** ПОСЫЛКА ДАННЫХ НА COM-ПОРТ */
    private void sendBytes(SerialPort serialPort, byte[] bytes){
        try {
            serialPort.writeBytes(bytes);
        }
        catch (SerialPortException e){
            logger.error("Ошибка посылки данных на COM-порт: "+e);
        }
    }

    /** ДВИЖЕНИЕ КРОНШТЕЙНА ВВЕРХ */
    @Override
    public void bracketUp(){

    }

    /** ДВИЖЕНИЕ КРОНШТЕЙНА ВНИЗ */
    @Override
    public void bracketDown(){

    }

    /** ОСТАНОВКА КРОНШТЕЙНА */
    @Override
    public void bracketStop(){

    }
}
