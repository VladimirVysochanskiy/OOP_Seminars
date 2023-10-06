/**
 * @apiNote Интерфейс для описания взаимодействия с классами логирования.
 */
public interface iLogger {
    /**
     * Метод записи сообщения в лог
     * @param logMessage сообщение для записи в лог
     */
    void writeLog(String logMessage);
}