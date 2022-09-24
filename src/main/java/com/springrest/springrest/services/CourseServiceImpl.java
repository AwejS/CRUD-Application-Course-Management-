package com.springrest.springrest.services;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
//	List<Course> list;
	
	@Autowired
	private CourseDao courseDao;
	public CourseServiceImpl() {
		
//		list = new ArrayList<>();
//		list.add(new Course(154,"Java Course","this is basic java course"));
//		list.add(new Course(114,"Javascript Course","this is basic javascript course"));
		
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
		// TODO Auto-generated method stub
//		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		return courseDao.getOne(courseId);
//		Course c=null;	
//		// TODO Auto-generated method stub
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		
		courseDao.save(course);
//		list.add(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e->{
//			if(e.getId()== course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
//		list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());	
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
