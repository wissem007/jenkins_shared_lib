
def call(String project, String ImageTag, String portMapping) {
    sh "docker container run -d -p ${portMapping} --name ${project}_${ImageTag} ${hubUser}/${project}:${ImageTag}"
}
