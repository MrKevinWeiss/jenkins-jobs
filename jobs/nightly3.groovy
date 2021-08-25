pipeline {
    libraries {
        lib('hil-jenkins-job')
    }
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