package com.hhimanshu.persistence.repositories;

import com.hhimanshu.persistence.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
