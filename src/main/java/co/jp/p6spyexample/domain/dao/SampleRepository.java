package co.jp.p6spyexample.domain.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String selectNameById(String id) {
        String sql = "select name from employee where id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, String.class);
    }
}
