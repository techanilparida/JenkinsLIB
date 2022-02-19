def git(url){
 git "${url}"
}
def build(){
sh 'mvn package'
}
def deploy(ip,appname){
sh "scp /home/ubuntu/.jenkins/workspace/Pipeline1/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
