package models.dataSaver;

public class FileDataSaver<T> implements DataSaver<T> {
    private T data;

    @Override
    public void save(T data) throws NullPointerException{
        System.out.println("saving to file");
        this.data = data;
    }

    @Override
    public T load() {
        System.out.println("reading from file");
        return data;
    }
}
