pipeline{
    agent any
    
    stages{
        stage("Git Checkout"){
            steps{
               git credentialsId: 'Github', url: 'https://github.com/AakashMaheedar/Template'
            }
        }
        stage("Maven Build"){
            steps{
                def mvnHome = tool name: 'Maven', type: 'maven'
                def mvnCmd="${mvnHome}/bin/mvn"
                sh "${mvnCmd } clean install" 

                
            }
        }
    }
}


