package com.example.springjavaapi;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

  @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
  method = RequestMethod.GET)
  public Double sum(
      @PathVariable(value = "numberOne") String numberOne,
      @PathVariable(value = "numberTwo") String numberTwo) {
    return Double.parseDouble(numberOne) + Double.parseDouble(numberTwo);
  }
}
