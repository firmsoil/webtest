
//def configCDPipeline = new ConfigSlurper().parse(new File('configCDPipeline.groovy').text)

//assert "https://www.artifactoryserverhost.com" == configCDPipeline.artifactoryURL
//assert configCDPipeline.artifactoryURL.class == String


def artifactoryURL="https://www.artifactoryserverhost.com"
def buildNbr=100
//booleanProperty=false
//listProperty=["Monday", "Tuesday", "Wednesday"]
def artifactoryUserName="username"
def artifactoryPassword="password"


Properties properties = new Properties()
File propertiesFile = new File('configCDPipeline.properties')
propertiesFile.withInputStream {
    properties.load(it)
}


def checkoutMsg = 'Checking out code from repository'

node {

echo "${artifactoryURL}"
echo "${artifactoryUserName}"
echo "${artifactoryPassword}"
echo "${buildNbr}"


   // Mark the code checkout 'stage'....
   stage 'Checkout'

   // Checkout code from repository
   echo "${checkoutMsg}"
   checkout scm

   // Get the maven tool.
   // ** NOTE: This 'M3' maven tool must be configured
   // **       in the global configuration.
   def mvnHome = tool 'mvn'

   // Mark the code build 'stage'....
   stage 'Build'
   // Run the maven build
   echo "Runnung build now..."
   sh "${mvnHome}/bin/mvn clean"
}
