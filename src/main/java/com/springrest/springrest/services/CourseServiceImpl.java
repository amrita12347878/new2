package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService
{
	List<Course> list;
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Course(144, "java course", "this is a programming language"));
		list.add(new Course(123, "android course", "this is use to develop mobile application"));
	}

	@Override
	public List<Course> getCourses() 
	{
		
		return list;
	}

}
