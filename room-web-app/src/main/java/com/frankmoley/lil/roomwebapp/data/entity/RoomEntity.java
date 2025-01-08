package com.frankmoley.lil.roomwebapp.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Entity
@Table(name="ROOMS")
@Getter
@Setter
public class RoomEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name="ROOM_ID")
  private UUID roomId;
  @Column(name="NAME")
  private String name;
  @Column(name="NUMBER")
  private String number;
  @Column(name="BED_INFO")
  private String bedInfo;

  @Override
  public String toString() {
    return "RoomEntity{" +
        "roomId=" + roomId +
        ", name='" + name + '\'' +
        ", number='" + number + '\'' +
        ", bedInfo='" + bedInfo + '\'' +
        '}';
  }
}
