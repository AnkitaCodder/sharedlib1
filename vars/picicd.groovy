def gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/AnkitaCodder/${repo}.git" 
}

def build() {
    echo "Compiling and running Java project..."
    sh '''
        mkdir -p out
        javac src/*.java -d out
        java -cp out Main   # replace Main with your main class
    '''
}
