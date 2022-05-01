job('job2_deploy'){
description('job number 2')
triggers {
        upstream('seed_job', 'SUCCESS')
    }

steps {
shell('''echo "Job 2"
         ''') 
}
} 
