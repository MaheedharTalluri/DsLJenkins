

/*checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[ url: 'https://github.com/maheedhar132/Devops_assesment.git']]])*/


cpsScm {
 scm {
        git {
            remote {
                name('origin')
                url('https://github.com/maheedhar132/Devops_assesment.git')
            }
            extensions {
                cleanAfterCheckout()
                relativeTargetDirectory('Devops_assesment')
            }
        }
    }
}




