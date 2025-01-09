package com.frankmoley.lil.roomwebapp.data.repository;

import com.frankmoley.lil.roomwebapp.data.entity.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface StaffRepository extends JpaRepository<StaffMember, UUID> {
}