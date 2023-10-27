package com.emre.repository;

import com.emre.repository.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface LibraryRepository extends JpaRepository<Library,String> {
    Optional<Library> findById(String id);

}
