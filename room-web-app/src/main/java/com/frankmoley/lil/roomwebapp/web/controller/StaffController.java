package com.frankmoley.lil.roomwebapp.web.controller;

import com.frankmoley.lil.roomwebapp.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController {

  private final StaffService staffService;

  public StaffController(StaffService staffService) {
    this.staffService = staffService;
  }

  @GetMapping
  public String getStaffPage(Model model){
    model.addAttribute("staff", this.staffService.getAllStaff());
    return "staff";
  }
}
