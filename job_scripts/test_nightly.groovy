pipeline {
    libraries {
        lib('hil-jenkins-job')
    }
    parameters {
        string(name: 'STATEMENT', defaultValue: 'hello; ls /', description: 'What should I say?')
    }
    description
    agent { label 'master' }
    stages {
        stage('setup master') {
            steps {
                script{
                    stepTest()
                }
            }
        }
    }
}

def stepTest() {
    test.test_1("msg3")
    test("msg4")
}