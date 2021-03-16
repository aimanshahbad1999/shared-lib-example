// package exm

// public class demoExample1{
//     def name="Aiman"
//     def login(){
//         if(name=="Aiman"){
//             println("hey hii welcome Aiman")
//         }else{
//             println("Login failed")
//         }
//     }
// }



package com.exm

public class demoExample1 {

  def login() {
    def name="Aiman"
    if (name=="Aiman"){
      return true;
    }
    else {
      println "login failed"
    }
    
    return false;
  }

}