package com.java.Dronefeeder.integrations;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.Dronefeeder.model.RetiradaEntrega;
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
public class RetiradaEntregaTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  @Order(1)
  public void createEntrega() throws Exception {
    RetiradaEntrega retiradaEntrega = new RetiradaEntrega();

    mockMvc
      .perform(
        post("/retirada")
          .contentType(MediaType.APPLICATION_JSON)
          .content(new ObjectMapper().writeValueAsString(retiradaEntrega))
      ).andExpect(status().isNotFound());   
  }
}
  