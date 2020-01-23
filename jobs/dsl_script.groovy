/*evaluate(new File("/var/lib/jenkins/workspace/testseed/jobs/final.groovy"))*/


import groovy.json.*

def jS = new JsonSlurper()
 def reader = new BufferedReader(new InputStreamReader(new FileInputStream("/var/lib/jenkins/workspace/testseed/sample.json"),"UTF-8"))
data = jS.parse(reader)  
String j1=data.ci.jobs.job.job_name
String j2=j1.replace("[","");
String job=j2.replace("]","");







pipelineJob(job) {


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
