def call(String colo)
{
 slackSend channel: '#devopstest', color: '${colo}', message: 'Bulid Started', teamDomain: 'Jarvis'
}
