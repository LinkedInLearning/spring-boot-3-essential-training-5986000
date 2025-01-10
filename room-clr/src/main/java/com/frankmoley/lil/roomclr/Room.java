package com.frankmoley.lil.roomclr;

import lombok.Data;
import java.util.UUID;

@Data
public class Room {
  private UUID id;
  private String name;
  private String number;
  private String info;
}
