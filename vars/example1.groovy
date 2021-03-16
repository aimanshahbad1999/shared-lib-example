def call(String name = "Alice") {
    script {
        sh """
            echo Hi ${name}
        """
    }
}

def example1(){
    println("hey you are in example")
}