package com.example.jdbcdatasourceinit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloTest {

  @Test
  void returnOne() {
    Hello hello = new Hello();
    assertEquals(1, hello.returnOne());
  }
}