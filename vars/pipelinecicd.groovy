def gitdownload(repo)
{
   git branch: 'main', url: "https://github.com/AnkitaCodder/${repo}.git" 
}

def build()
{
  sh '''
        python3 -m venv venv
        source venv/bin/activate
        pip install --upgrade pip
        pip install -r requirements.txt
    '''
}

