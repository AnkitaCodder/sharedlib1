def gitdownload(repo)
{
   git branch: 'main', url: "https://github.com/AnkitaCodder/${repo}.git" 
}

def build()
{
  sh 'python3'
}

def deployment(jobname,ip)
{
   sh " scp /var/lib/jenkins/workspace/${jobname}/practice.py ubuntu@${ip}:/home/ubuntu/testagain"
}

def testing(jobname)
{
   sh "python3 /var/lib/jenkins/workspace/${jobname}/practice.py"

}

def release(jobname,ip)
{
   sh " scp /var/lib/jenkins/workspace/${jobname}/practice.py ubuntu@${ip}:/home/ubuntu/testagain"
}



