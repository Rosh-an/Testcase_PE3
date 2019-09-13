package com.stackroute;


public class ReturnException {
  public void main() {
    try {
      System.out.println(1 / 0);
    }
    catch (Exception e) {
      System.out.println(e);
      throw e;
    }
    finally {
      System.out.println("Finally block is executed");
    }
//  }
  }
}


