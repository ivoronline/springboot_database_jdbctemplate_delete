package com.ivoronline.springboot_database_jdbctemplate_delete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // DELETE
  //=========================================================================================================
  public int delete(String name, Integer age) {
    return jdbcTemplate.update(
      " DELETE FROM PERSON WHERE name = ? AND age = ?"   //Order of parameters is used => names are ignored
      , new Object[] { name, age }
    );
  }

}
