def call(String msg="STAGE FAILED",String id="ULT-0")
{
  def issue = [fields: [ project: [key: 'DEV'],
                       summary: "${msg}",
                       description: "${id}",
                       issuetype: [name: 'Bug']]]
def newIssue = jiraNewIssue issue: issue, site: 'JIRA'
echo newIssue.data.key
}
