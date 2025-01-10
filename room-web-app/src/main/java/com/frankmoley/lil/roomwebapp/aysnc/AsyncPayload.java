package com.frankmoley.lil.roomwebapp.aysnc;

import lombok.Data;
import java.util.UUID;

@Data
public class AsyncPayload {
  private UUID id;
  private String model;

}
