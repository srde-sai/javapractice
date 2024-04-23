package srd.srdesai.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T> {
      List<T> list1();

      T create(T t);

      Optional<T> get(int id);

      void update(T t, int id);

      void delete(int id);
}
