package DAO;

import java.util.List;

/**
 * @author Felipe
 */
public interface persistencia<T> {
    public int create (T obj);
    public List<T> read();
    public T findByCodigo (int id);
    public void delete (int id);
    public void update (T obj);
    
}
