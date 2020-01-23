import groovy.json.*

def jS = new JsonSlurper()
 def reader = new BufferedReader(new InputStreamReader(new FileInputStream("/var/lib/jenkins/workspace/testseed/sample.json"),"UTF-8"))
data = jS.parse(reader)  
String j1=data.ci.jobs.job.job_name
String j2=j1.replace("[","");
String job=j2.replace("]","");
def jobname=job
println(job)
