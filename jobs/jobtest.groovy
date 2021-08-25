pipeline {
    agent any
    stages {
        stage('stage test') {
            steps {
                echo "The build number is even"
            }
        }
    }
}

pipelineJob('nightly') {
    triggers {
        cron("H 23 * * *")
    }
    definition {
        cps {
            sandbox()
            scriptPath("jobs/nightly.groovy")
        }
    }
}