def call(body)
{
  def qgate = waitForQualityGate()
  if (qGate.status != 'OK')
  {
    error 'Aborted due to low threshold of quality gate'
  }
}
