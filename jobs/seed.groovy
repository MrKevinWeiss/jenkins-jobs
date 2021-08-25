freeStyleJob('seed_jobs') {
    steps {
      dsl {
        text("echo 'hello'")
      }
    }
}