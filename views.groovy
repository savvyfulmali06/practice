listView('All'){
description('all jobs')
jobs{
name('admin-seed-job')
}
columns{
status()
weather()
name()
lastSuccess()
lastFailure()
lastDuration()
buildButton()
}
}
