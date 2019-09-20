package com.example.demo.bootstrap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Project;
import com.example.demo.repo.ProjectRepo;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	ProjectRepo projectRepo;

	public DevBootstrap(ProjectRepo projectRepo) {
		super();
		this.projectRepo = projectRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("welcome....");
		try {
			init();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void init() throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat objSDF = new SimpleDateFormat("dd-MM-yyyy");		
		Project project = new Project("abc","kolkata","20-08-2019","23-08-2020","sp");
		project.setPid(UUID.randomUUID().toString());
		project.setStart_date(objSDF.parse(project.getStartDate()));
		project.setEnd_date(objSDF.parse(project.getEndDate()));
		System.out.println(project.getEnd_date());
		Project pro = new Project(project.getPid(),project.getPname(),project.getPlocation(),project.getStart_date(),project.getEnd_date(),project.getPmanager());
		projectRepo.save(pro);
		
	}

}
