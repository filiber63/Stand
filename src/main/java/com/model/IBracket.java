package com.model;
/** ИНТЕРФЕЙС ОБМЕНА С КРОНШТЕЙНОМ */
public interface IBracket {
    /** Движение кронштейна вверх */
    void bracketUp();
    /** Движение кронштейна вниз */
    void bracketDown();
    /** Остановка кронштейна */
    void bracketStop();

}
