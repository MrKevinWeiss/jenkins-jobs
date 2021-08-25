freeStyleJob("seed jobs") {
    steps {
        dsl {
            external("jobs/nightly2", "jobs/nightly3")
        }
    }
}