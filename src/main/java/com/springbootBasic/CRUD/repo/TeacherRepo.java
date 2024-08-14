package com.springbootBasic.CRUD.repo;

import com.springbootBasic.CRUD.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

//    @Query("select t from Teacher t where t.name=?1")
    List<Teacher> findByName(String name);
}
