package com.hhimanshu.persistence.repositories;

import com.hhimanshu.persistence.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
