
def call(String project, String ImageTag, String portMapping, String hubUser) {
    sh "docker container run -d -p ${portMapping} --name ${project}_${ImageTag} ${hubUser}/${project}:${ImageTag}"
}
