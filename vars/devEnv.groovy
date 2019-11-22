def call(body)
{
  sh 'ssh -t -t -i /var/lib/jenkins/.ssh/id_rsa ansadmin@172.31.3.247 "ansible-playbook /opt/playbooks/download.yml"'
}
