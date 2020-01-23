


pipelineJob(job1) {
definition{
cps{
// Enables the Groovy sandbox for the script.
sandbox(boolean sandbox = true)
// Sets the workflow DSL script.
script(readFileFromWorkspace('project-workflow.groovy'))

}

}








}
