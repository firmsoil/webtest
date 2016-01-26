/**
 * Loads properties from file
 */

// def configCDPipeline = new ConfigSlurper().parse(new File('https://github.com/firmsoil/webtest/blob/master/configCDPipelineProps.groovy').text)

artifactoryURL="https://www.artifactoryserverhost.com"
numberProperty=100
booleanProperty=false
listProperty=["Monday", "Tuesday", "Wednesday"]
artifactoryUserName="username"
artifactoryPassword="password"
  
def getURL(artifactoryURL) {
  return artifactoryURL;
}

return this;
