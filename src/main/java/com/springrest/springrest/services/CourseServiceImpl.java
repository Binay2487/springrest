package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;
@Service
public class CourseServiceImpl implements CourseService {
	
	List<Courses> list;
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Courses(127,"Himesh","Sheker","himesh@shekar"));
		list.add(new Courses(177,"Zakir","Suman","suman@123"));
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

}
