groovyScriptFile('var.groovy'){
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
