package com.prog.hei.service;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class ArithService {
  public Long addition(Long a, Long b) {
    return a + b;
  }

  public Long substruct(Long a, Long b) {
    return a - b;
  }

  public Long multiply(Long a, Long b) {
    return a * b;
  }

  public BigDecimal divide(Long a, Long b) {
    if (b == 0) {
      throw new ArithmeticException();
    }

    if (a == 0) {
      return BigDecimal.ZERO;
    }

    /* return BigDecimal.valueOf(a / b);*/
    return BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b), 9, BigDecimal.ROUND_HALF_UP);
  }
}
