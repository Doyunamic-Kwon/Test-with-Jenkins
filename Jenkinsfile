pipeline {
    agent any
    
    tools {
        jdk "jdk-17"
    }
    
    stages {
        stage("Compile") {
            steps {
                dir("demo") {
                    sh "chmod +x ./gradlew"
                    sh "./gradlew compileJava"
                }
            }
        }
        stage("Build") {
            steps {
                dir("demo") {
                    sh "chmod +x ./gradlew"
                    sh "./gradlew build"
                }
            }
        }
        stage("Unit test") {
            steps {
                dir("demo") {
                    sh "chmod +x ./gradlew"
                    sh "./gradlew test"
                }
            }
        }
    }
}
