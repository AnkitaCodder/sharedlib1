def gitdownload(repo)
{
   git branch: 'main', url: 'https://github.com/${repo}.git' 
}

