import groovy.json.*

def jS = new JsonSlurper()
 def reader = new BufferedReader(new InputStreamReader(new FileInputStream("/var/lib/jenkins/workspace/testseed/sample.json"),"UTF-8"))
def data = jS.parse(reader)  
String j1=data.ci.jobs.job.job_name
String j2=j1.replace("[","");
String job=j2.replace("]","");
def jobname=job
System.setProperty("job_name", "jobname")
//context.testCase.setPropertyValue('JOB_NAME', 'jobname')
evaluate(new File("/var/lib/jenkins/workspace/testseed/jobs/dsl_script.groovy"))
