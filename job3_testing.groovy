job('job3_testing'){
	description('this job number 3' )
	triggers {
        	upstream('job2_deploy', 'SUCCESS')
    	}
	steps{
		shell('''echo "Job 3"
	         ''') 
	}
}
