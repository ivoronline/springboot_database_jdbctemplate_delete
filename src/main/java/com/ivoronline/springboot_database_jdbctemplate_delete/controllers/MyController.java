package com.ivoronline.springboot_database_jdbctemplate_delete.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // HELLO
  //=========================================================================================================
  @ResponseBody
  @GetMapping("/hello")
  public int hello() {
    int    deletedRecords = delete("John", 10);
    return deletedRecords;
  }

  //=========================================================================================================
  // UPDATE
  //=========================================================================================================
  public int delete(String name, Integer age) {
    return jdbcTemplate.update(
      " DELETE FROM PERSON WHERE name = ? AND age = ?"   //Order of parameters is used => names are ignored
      , new Object[] { name, age }
    );
  }

}
