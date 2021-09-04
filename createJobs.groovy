pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {2
                    remote {
                        url 'https://github.com/Jingshuai-cloud/spring-boot-api-example.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}