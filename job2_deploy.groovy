job('job2_deploy.'){
description('this job will deploy code')
triggers {
        upstream('seed_job', 'SUCCESS')
    }

steps {
shell('''echo "Job 2"
         ''') 
}
} 
