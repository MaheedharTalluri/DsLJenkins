/*evaluate(new File("/var/lib/jenkins/workspace/testseed/jobs/final.groovy"))*/




GroovyShell shell=new GroovyShell()
def tool = shell.parse(new File("/var/lib/jenkins/workspace/testseed/jobs/final.groovy"))
file=tool.jobname.job_name



pipelineJob(file) {


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
