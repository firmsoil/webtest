#!groovy

//def configCDPipeline = new ConfigSlurper().parse(new File('configCDPipeline.groovy').text)
//assert "https://www.artifactoryserverhost.com" == configCDPipeline.artifactoryURL
//assert configCDPipeline.artifactoryURL.class == String

def artifactoryURL="https://www.artifactoryserverhost.com"
def buildNbr=100
//booleanProperty=false
//listProperty=["Monday", "Tuesday", "Wednesday"]
def artifactoryUserName="username"
def artifactoryPassword="password"

def checkoutMsg = 'Checking out code from repository'

node {

echo "${artifactoryURL}"
echo "${artifactoryUserName}"
echo "${artifactoryPassword}"
echo "${buildNbr}"


//stage 'Load a file from GitHub'
//def helloworld = fileLoader.fromGit('examples/fileLoader/helloworld', 
//        'https://github.com/jenkinsci/workflow-remote-loader-plugin.git', 'master', null, '')

//stage 'Run method from the loaded file'
//helloworld.printHello()


//stage 'Load properties file from GitHub'
def configCDPipelineLoaded = fileLoader.fromGit('configCDPipeline', 
'https://github.com/firmsoil/webtest.git', 'master', null, '')

//configCDPipelineLoaded.getURL()

echo "${configCDPipelineLoaded.getURL()}"


//def str = readFile name: 'https://github.com/firmsoil/webtest/blob/master/configCDPipelineProps.properties', charset : 'utf-8'
    

   // Mark the code checkout 'stage'....
   //stage 'Checkout'

   // Checkout code from repository
  // echo "${checkoutMsg}"
   //checkout scm

   // Get the maven tool.
   // ** NOTE: This 'M3' maven tool must be configured
   // **       in the global configuration.
   def mvnHome = tool 'mvn'

   // Mark the code build 'stage'....
  // stage 'Build'
   // Run the maven build
  // echo "Runnung build now..."
  // sh "${mvnHome}/bin/mvn clean"
}
