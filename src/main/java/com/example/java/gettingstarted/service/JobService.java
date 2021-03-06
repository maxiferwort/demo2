package com.example.java.gettingstarted.service;

import com.example.java.gettingstarted.persistence.model.Civilization;
import java.util.HashMap;
import java.util.Map;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

//  @Autowired
//  private JobLauncher jobLauncher;
//
//  @Autowired
//  private Job generateYearJob;
//
//  public void runYearJob(Double ferengies, Double vulcanos, Double betasoides)
//      throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
//    Map<Civilization, Double> parameters = new HashMap<>();
//    parameters.put(Civilization.FERENGIES, ferengies);
//    parameters.put(Civilization.VULCANOS, vulcanos);
//    parameters.put(Civilization.BETASOIDES, betasoides);
//    JobParameters jobParameters = new JobParametersBuilder()
//        .addDouble(Civilization.FERENGIES.name(), ferengies)
//        .addDouble(Civilization.BETASOIDES.name(), betasoides)
//        .addDouble(Civilization.VULCANOS.name(), vulcanos).toJobParameters();
//    jobLauncher.run(generateYearJob, jobParameters);
//  }

}
