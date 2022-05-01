job('job3_testing'){
	description('this job is for testing' )
	triggers {
        	upstream('job2_deploy.', 'SUCCESS')
    	}
	steps{
		shell('''echo "Job 3"
	         ''') 
	}
}
