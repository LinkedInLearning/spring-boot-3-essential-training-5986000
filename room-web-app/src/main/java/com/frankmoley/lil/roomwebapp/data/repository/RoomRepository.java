package com.frankmoley.lil.roomwebapp.data.repository;

import com.frankmoley.lil.roomwebapp.data.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface RoomRepository extends JpaRepository<RoomEntity, UUID> {

}
