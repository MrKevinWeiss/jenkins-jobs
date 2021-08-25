pipelineJob('nightly2') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('MrKevinWeiss/jenkins-jobs')
                    }
                }
            }
            scriptPath('jobs/nightly3')
        }
    }
}