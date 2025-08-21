def gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/AnkitaCodder/${repo}.git" 
}

def build() {
    echo "Compiling and running Java project..."
    sh '''
        mvn clean package
    '''
}

def deployment(jobname, ip)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/hello.java ubuntu@${ip}:/home/ubuntu/testagain"
}  
