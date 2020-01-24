evaluate(new File("/var/lib/jenkins/workspace/testseed/jobs/connect.groovy"))




jobname=name.j_n


pipelineJob('EDN250') {


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
