package com.java.Dronefeeder.integrations;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.Dronefeeder.model.LatitudeLongitude;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LatitudeLongitudeTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  @Order(1)
  public void createLatitudeLongitude() throws Exception {
    LatitudeLongitude latitudeLongitude = new LatitudeLongitude();
    latitudeLongitude.setLatitude("-27.578562316498715");
    latitudeLongitude.setLongitude("-48.59879808648807");

    mockMvc
      .perform(
        post("/latitude")
          .contentType(MediaType.APPLICATION_JSON)
          .content(new ObjectMapper().writeValueAsString(latitudeLongitude))
      ).andExpect(status().isCreated());   
  }
}
  