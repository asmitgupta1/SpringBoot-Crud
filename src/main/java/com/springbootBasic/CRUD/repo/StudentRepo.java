package com.springbootBasic.CRUD.repo;

import com.springbootBasic.CRUD.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@Repository
public class StudentRepo {

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    private JdbcTemplate jdbc;
    public void save(Student s){
        String sql = "insert into student(sid,marks,sname) values (?,?,?)";

        int rows  = jdbc.update(sql, s.getSid(),s.getMarks(),s.getSname());

        System.out.println(rows + "effected");
    }

    public List<Student> findALL() {
        String sql = "select * from student";
        RowMapper<Student> mapper=(rs,rowNum) ->
        {
            Student s=new Student();
            s.setSid(rs.getInt("sid"));
            s.setSname(rs.getString("sname"));
            s.setMarks(rs.getInt("marks"));
            return s;

        };

        return jdbc.query(sql, mapper);

    }

//        RowMapper<Student> mapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//                Student s = new Student();
//                s.setMarks(rs.getInt("marks"));
//                s.setSid(rs.getInt("sid"));
//                s.setSname(rs.getString("sname"));
//                return s;
//            }
//        };
//        return jdbc.query(sql,mapper);
//    }
}
