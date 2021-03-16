#!/usr/bin/env groovy

// def call(String name = "Alice") {
//     node{
//         stage("example1"){
//             println("hey hii example1")
//         }
//     }
// }

// def example1(){
//     println("hey you are in example")
// }


// def call(String name = "Alice") {
//     script {
//         sh """
//             echo Hi ${name}
//         """
//     }
// }

def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello, ${name}."
}