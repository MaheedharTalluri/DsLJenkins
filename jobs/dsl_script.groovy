evaluate(new File("/var/lib/jenkins/workspace/testseed/jobs/connect.groovy"))

package jobs
import jobs.name

jobname=name.j_n


pipelineJob(jobname) {


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
