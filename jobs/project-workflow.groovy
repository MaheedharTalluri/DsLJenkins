


pipelineJob('job1'){
definition{
cpsScm {
 scm {
        git {
            remote {
                name('origin')
                url('https://github.com/maheedhar132/Devops_assesment.git')
            }
            extensions {
                cleanAfterCheckout()
                relativeTargetDirectory('Devops_assesment')
            }
        }
    }
}
}
}


