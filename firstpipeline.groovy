pipelineJob('test'){
  description('test first pipeline job')
  logRotator(5,5)
  parameters{
    choiceParam('Select','True','False')
    stringParam('This is String parameter example')
    }
  definition{
    cps{
      script('logic-here')
      sandbox()
      }
    }
  }
