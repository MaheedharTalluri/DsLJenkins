evaluate(new File("/var/lib/jenkins/workspace/testseed/jobs/final.groovy"))
println(job)
pipelineJob('job') {


definition{
cpsScm {
scm {
        git {
            remote {
                name('origin')
                url('https://github.com/maheedhar132/Devops_assesment.git')
            }
            
        }
    }
  }
triggers {
        cron('* * * * *')
    }


}
}
