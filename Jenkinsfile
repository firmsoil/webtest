
def checkoutMsg = 'Checking out code from repository'

node {
   // Mark the code checkout 'stage'....
   stage 'Checkout'

   // Checkout code from repository
   echo ${checkoutMsg}
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
