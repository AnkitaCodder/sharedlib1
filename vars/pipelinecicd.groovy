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
   sh "/var/lib/jenkins/workspace/${jobname}/practice.py ubuntu@${ip}:/home/ubuntu/testagain"
}

