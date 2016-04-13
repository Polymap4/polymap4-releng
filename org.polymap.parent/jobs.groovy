def repoProjectsStr = '''[
   { "name": "org.polymap.config.parent",
      "repository" : "polymap4-releng",
      "branch": "master",
      "ant": "false",
      "successor": "org.polymap.parent"
   },
   { "name": "org.polymap.parent",
      "repository" : "polymap4-releng",
      "branch": "master",
      "ant": "false",
      "successor": "org.apache.log4j"
   },
   { "name": "org.apache.log4j",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "extras",
      "ant": "false",
      "successor": "org.eclipse.core.filesystem"
   },
   { "name": "org.eclipse.core.filesystem",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "extras",
      "ant": "false",
      "successor": "org.eclipse.core.resources"
   },
   { "name": "org.eclipse.core.resources",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "extras",
      "ant": "false",
      "successor": "org.eclipse.equinox.security"
   },
   { "name": "org.eclipse.equinox.security",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "extras",
      "ant": "false",
      "successor": "org.eclipse.rap.ui.navigator"
   },
   { "name": "org.eclipse.rap.ui.navigator",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "extras",
      "ant": "false",
      "successor": "org.polymap.core"
   },
   { "name": "org.polymap.core",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "junit": "true",
      "successor": "org.polymap.service.fs"
   },
   { "name": "org.polymap.core.catalog",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "ant": "false",
      "successor": "org.polymap.core.data.wms"
   },
   { "name": "org.polymap.core.data",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "junit": "true",
      "successor": "org.polymap.core.catalog"
   },
   { "name": "org.polymap.core.data.raster",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "successor": "org.polymap.core.data.refine"
   },
   { "name": "org.polymap.core.data.refine",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "junit": "true",
      "successor": "org.polymap.core.data.shapefile"
   },
   { "name": "org.polymap.core.data.rs",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "junit": "true",
      "successor": "org.polymap.rhei.batik"
   },
   { "name": "org.polymap.core.data.shapefile",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "successor": "org.polymap.core.data.rs"
   },
   { "name": "org.polymap.core.data.wms",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "successor": "org.polymap.core.data.raster"
   },
   { "name": "org.polymap.core.mapeditor",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "ant": "false",
      "successor": "org.polymap.model2.store.recordstore"
   },
   { "name": "org.polymap.core.project",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "ant": "false",
      "successor": "org.polymap.service.geoserver"
   },
   { "name": "org.polymap.core.recordstore",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "junit": "true",
      "successor": "org.polymap.model2"
   },
   { "name": "org.polymap.service.fs",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "successor": "org.polymap.core.recordstore"
   },
   { "name": "org.polymap.service.geoserver",
      "repository" : "polymap4-core",
      "branch": "develop-rap2.3",
      "folder" : "plugins",
      "successor": "org.polymap.rap.openlayers"
   },
   { "name": "org.polymap.model2",
      "repository" : "polymap4-model",
      "branch": "master",
      "successor": "org.polymap.core.data"
   },
   { "name": "org.polymap.model2.store.recordstore",
      "repository" : "polymap4-model",
      "branch": "master",
      "ant": "false",
      "junit": "true",
      "successor": "org.polymap.rhei.form"
   },
   { "name": "org.polymap.rap.openlayers",
      "repository" : "polymap4-rap",
      "branch": "master",
      "junit": "true",
      "successor": "org.polymap.rap.updownload"
   },
   { "name": "org.polymap.rap.updownload",
      "repository" : "polymap4-rap",
      "branch": "master",
      "successor": "org.polymap.core.mapeditor"
   },
   { "name": "org.polymap.rhei.batik",
      "repository" : "polymap4-rhei",
      "branch": "develop-rap2.3",
      "folder": "plugins",
      "junit": "true",
      "sass": "true",
      "successor": "org.polymap.core.project"
   },
   { "name": "org.polymap.rhei.form",
      "repository" : "polymap4-rhei",
      "branch": "develop-rap2.3",
      "folder": "plugins",
      "successor": "org.polymap.rhei.form.batik"
   },
   { "name": "org.polymap.rhei.form.batik",
      "repository" : "polymap4-rhei",
      "branch": "develop-rap2.3",
      "folder": "plugins",
      "ant": "false",
      "successor": "org.polymap.p4"
   },
   { "name": "org.polymap.rhei.fulltext",
      "repository" : "polymap4-rhei",
      "branch": "develop-rap2.3",
      "folder": "plugins" 
   },
   { "name": "org.polymap.rhei.um",
      "repository" : "polymap4-rhei",
      "branch": "develop-rap2.3",
      "folder": "plugins" 
   },
   { "name": "org.eclipse.rap.rwt.de",
      "repository" : "polymap4-rhei",
      "branch": "develop-rap2.3",
      "folder": "plugins",
      "ant": "false"
   },
   { "name": "org.polymap.p4",
      "repository" : "polymap4-p4",
      "branch": "master",
      "successor": "org.polymap.p4.data.importer"
   },
   { "name": "org.polymap.p4.data.importer",
      "repository" : "polymap4-p4",
      "branch": "master",
      "successor": "org.polymap.p4.product"
   },
   { "name": "org.polymap.cms",
      "repository" : "polymap4-cms",
      "branch": "master",
      "ant": "false" 
   },
   { "name": "org.polymap.p4.product",
      "repository" : "polymap4-releng",
      "branch": "master",
      "ant": "false",
      "archiveProduct": "true"
   }
]'''

def jsonSlurper = new groovy.json.JsonSlurper()
def repoProjects = jsonSlurper.parseText(repoProjectsStr)

repoProjects.each {
   def projectName = it.name
   def branchName = it.branch
   def folder = (it.folder != null) ? it.folder + '/' : ''
   def jobName = it.repository.replace('polymap4-', '') + '_' + it.name + '_' + it.branch
   def repoName = it.repository
   def useAnt = (it.ant != null && it.ant == 'false') ? false : true
   def useSass = (it.sass != null && it.sass == 'true') ? true : false
   def useJUnit = (it.junit != null && it.junit == 'true') ? true : false
   def successor = it.successor
   def archiveProduct = (it.archiveProduct != null && it.archiveProduct == 'true') ? true : false

   mavenJob(jobName) {
     logRotator(-1, 5)
     blockOnUpstreamProjects()
	   properties {
	      githubProjectUrl('git@github.com:Polymap4/' + repoName + '.git')
       }
       /*environmentVariables {
          envs(snapshotDeployRepo: 'http://build.mapzone.io/nexus/content/repositories/polymap4-snapshots/',
		  releaseDeployRepo: 'http://build.mapzone.io/nexus/content/repositories/polymap4-releases/',
		  polymap4_target: 'file:/home/jenkins/.jenkins/jobs/polymap4-targetplatform/lastStable/archive/polymap4_target',
		  branchName: branchName)
	   }*/
		scm {
		   git {
              branch('refs/heads/' + branchName)
		      remote {
		         url('git@github.com:Polymap4/' + repoName + '.git')
                 credentials('a7a16d8e-fac0-45df-973b-523ff9c81738')
                 refspec('+refs/heads/' + branchName + ':refs/remotes/origin/' + branchName)
		      }
             extensions {
               cleanBeforeCheckout()
             }  
		   }
		}
		triggers {
          githubPush()
          snapshotDependencies(true)
		}
		preBuildSteps {
			if(useAnt) {
				ant {
				   antInstallation('ANT 1.9.6')
				   buildFile(folder + projectName + '/getjars.build.xml')
				   target('build')
                   prop('nexusURL', 'http://build.mapzone.io/nexus/content/groups/public')
				}
         	}
			if(useSass) {
				ant {
				   antInstallation('ANT 1.9.6')
				   buildFile(folder + projectName + '/sass.build.xml')
				   target('build')
				}
         	}
        }
		//   	maven {
		    	mavenInstallation('Maven 3.3.3')
		      	providedSettings('JenkinsMavenSettings')
		      	rootPOM(folder + projectName + '/pom.xml')
		      	goals('clean')
		      	 if (archiveProduct) {
                    goals('install')
                  } else {
                    goals('deploy')
                  }
		      	/*properties (
		         	snapshotDeployRepo: 'http://build.mapzone.io/nexus/content/repositories/polymap4-snapshots/', 
		         	releaseDeployRepo: 'http://build.mapzone.io/nexus/content/repositories/polymap4-releases/', 
		         	polymap4_target: 'file:/home/jenkins/.jenkins/jobs/polymap4-targetplatform/lastStable/archive/polymap4_target',
		         	branchName: branchName
		      	)*/
              	mavenOpts('-Dmaven.test.failure.ignore=true')
                mavenOpts('-DsnapshotDeployRepo=http://build.mapzone.io/nexus/content/repositories/polymap4-snapshots/') 
		        mavenOpts('-DreleaseDeployRepo=http://build.mapzone.io/nexus/content/repositories/polymap4-releases/') 
		        mavenOpts('-Dpolymap4_target=file:/home/jenkins/.jenkins/jobs/polymap4-targetplatform/lastStable/archive/polymap4_target')
		        mavenOpts('-DbranchName=' + branchName)
		//   	}
		//}
        postBuildSteps {
          
        }
		publishers {
			if(useJUnit) {
				archiveJunit('**/TEST-*.xml') {
					testDataPublishers {
						allowClaimingOfFailedTests()
						publishTestStabilityData()
					}
				}
			}
			if(successor != null) {
				def successorProject = repoProjects.find { it.name == successor }
				def successorJobName = successorProject.repository.replace('polymap4-', '') + '_' + successorProject.name + '_' + successorProject.branch
				downstream(successorJobName, 'UNSTABLE')
			}
			if (archiveProduct) {
				archiveArtifacts {
					pattern('**/products/*.zip')
				}
			}
          slackNotifications {
				notifyFailure()
				notifyBackToNormal()
	      }
		}
		configure { project -> 
		  project / 'scm' / 'extensions' / 'hudson.plugins.git.extensions.impl.PathRestriction' {
            'includedRegions'( folder + projectName + '/.*')
            'excludedRegions'()
          }
        }  
	}
}