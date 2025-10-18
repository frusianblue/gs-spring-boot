pipeline {
    agent none
    stages {
        
        stage('Example') {
            agent any
            
            steps {
                echo 'multi-1'
                echo 'test1'
            }
        }
        stage('mytest') {
            steps {
                echo 'multi-2'

            }
        }
    }
}