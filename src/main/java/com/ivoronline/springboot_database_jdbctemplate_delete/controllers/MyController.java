package com.ivoronline.springboot_database_jdbctemplate_delete.controllers;

import com.ivoronline.springboot_database_jdbctemplate_delete.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private MyService myService;

  //=========================================================================================================
  // DELETE
  //=========================================================================================================
  @ResponseBody
  @GetMapping("/delete")
  public int delete() {
    int    success = myService.delete("John", 10);
    return success;
  }


}
