/**
 * Loads properties from file
 */

// def configCDPipeline = new ConfigSlurper().parse(new File('https://github.com/firmsoil/webtest/blob/master/configCDPipelineProps.groovy').text)

def propFile = loadPropertiesFile('configCDPipelineProps.properties')
   //Integer port = propFile.getInt('server.port')
   String url = propFile.get('artifactoryURL')
