pipeline {
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
    test.test_1("msg1")
    test("msg2")
}