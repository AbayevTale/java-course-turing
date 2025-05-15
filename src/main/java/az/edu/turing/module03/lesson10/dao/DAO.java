package az.edu.turing.module03.lesson10.dao;

public interface DAO<T> {

    T save(T t);

//    Collection<T> findAll();
//
//    T findById(int id);
}
