package models.dataSaver;

public interface DataSaver<T> {
    void save(T data) throws NullPointerException;
    T load();
}
