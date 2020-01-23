groovyScriptFile('''
import groovy.json.*

def jS = new JsonSlurper()
var=jsonSlurper.parseText('/sample.json')
def job=var['job_name']



'''){
classpath('.')
}





pipelineJob('${job}') {


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
