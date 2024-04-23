package srd.srdesai.repository;

import java.util.List;

public interface CrudRepo<T> {
    List<T> findAll();
}
