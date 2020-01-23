
import groovy.json.*

def jS = new JsonSlurper()
var=jsonSlurper.parseText('/sample.json')
def job=var['job_name']
