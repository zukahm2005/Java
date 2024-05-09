 package gennercis;

 public interface ServiceFuncTion<T> {
    void create(T object);

    void update(T object);
    
    void delete(T object);

    void getall (T object);
    
}