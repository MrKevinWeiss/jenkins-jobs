pipelineJob('test_nightly') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('MrKevinWeiss/jenkins-jobs')
                    }
                }
            }
            scriptPath('job_scripts/test_nightly.groovy')
        }
    }
}