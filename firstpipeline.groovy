pipelineJob('test'){
  description('test first pipeline job')
  logRotator(5,5)
  parameters{
    choiceParam('Select','True','False')
    stringParam('This is String parameter example')
    }
  definition{
    cps{
      script(readFileFromWorkspace(test1.groovy))
      sandbox()
      }
    }
  }
