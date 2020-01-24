/*evaluate(new File("/var/lib/jenkins/workspace/testseed/jobs/final.groovy"))*/

import groovy.json.*


def jS = new JsonSlurper()
 def reader = new BufferedReader(new InputStreamReader(new FileInputStream("/var/lib/jenkins/workspace/testseed/sample.json"),"UTF-8"))
def data = jS.parse(reader) 
f=data.ci.jobs.job.job_name
String f1=f.replace("[","");
String file=f1.replace("]","");
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
