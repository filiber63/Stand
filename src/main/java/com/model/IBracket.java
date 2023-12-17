package com.model;
/** ИНТЕРФЕЙС ОБМЕНА С КРОНШТЕЙНОМ */
public interface IBracket {
    /** Движение кронштейна вверх */
    void bracketUp(int bracketNum);
    /** Движение кронштейна вниз */
    void bracketDown(int bracketNum);
    /** Остановка кронштейна */
    void bracketStop(int bracketNum);

}
