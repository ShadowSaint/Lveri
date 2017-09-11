package com.lveri.www.dao.impl;

import com.lveri.www.dao.LveriDao;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class LveriDaoImpl implements LveriDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
