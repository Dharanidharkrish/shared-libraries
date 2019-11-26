def call(body){

def issue = [fields: [ project: [key: 'DEV'],
                       summary: 'Build stage failure',
                       description: 'BUILD FAILED',
                       issuetype: [name: 'Bug']]]
def newIssue = jiraNewIssue issue: issue, site: 'JIRA'
echo newIssue.data.key
}
