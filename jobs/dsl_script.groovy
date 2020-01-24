evaluate(new File("/var/lib/jenkins/workspace/testseed/jobs/connect.groovy"))




GroovyShell shell = new GroovyShell()
def tools = shell.parse(new File("/var/lib/jenkins/workspace/testseed/jobs/connect.groovy"))
println(connect.file)



println(file)




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
