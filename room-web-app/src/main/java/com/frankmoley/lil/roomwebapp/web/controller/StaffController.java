package com.frankmoley.lil.roomwebapp.web.controller;

import com.frankmoley.lil.roomwebapp.data.entity.StaffMember;
import com.frankmoley.lil.roomwebapp.data.repository.StaffRepository;
import com.frankmoley.lil.roomwebapp.service.StaffService;
import com.frankmoley.lil.roomwebapp.web.model.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

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
