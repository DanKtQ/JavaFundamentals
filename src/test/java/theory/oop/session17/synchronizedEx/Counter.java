package theory.oop.session17.synchronizedEx;

public class Counter {

    // synchronized este folosit pentru thread safety
    // synchronized modifier poate fi aplicat la metode si block
    //

    int count;

  synchronized void increment(){
      count++;

  }
}
