evaluate(new File("jobs/final.groovy"))

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
