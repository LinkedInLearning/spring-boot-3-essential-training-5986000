package com.frankmoley.lil.roomwebapp.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {
  private UUID id;
  private String name;
  private String number;
  private String info;

}
