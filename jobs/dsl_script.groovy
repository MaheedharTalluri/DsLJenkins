evaluate(new File("/var/lib/jenkins/workspace/testseed/jobs/connect.groovy"))


def jobname=j_n




println(jobname)




pipelineJob(j_n) {


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
