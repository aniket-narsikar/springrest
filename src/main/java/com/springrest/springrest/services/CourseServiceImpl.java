package com.springrest.springrest.services;

import com.springrest.springrest.DAO.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl() {}

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        return courseDao.getOne(courseId);
    }


    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(long courseId, Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
        Course entity = courseDao.getOne(courseId);
        courseDao.delete(entity);
    }
}


//package com.springrest.springrest.services;
//import com.springrest.springrest.DAO.CourseDao;
//import com.springrest.springrest.entities.Course;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class CourseServiceImpl implements CourseService {
//
//    @Autowired
//    private CourseDao courseDao;
////    List<Course> list;
//
//    public CourseServiceImpl() {
//
////        list= new ArrayList<>();
////        list.add(new Course((long) 123L,"Core Java","Creating Rest Apis in Java Spring Boot"));
////        list.add(new Course((long) 124L,"Advance Java","Creating Rest Apis in Java Spring Boot "));
////        list.add(new Course((long) 125L,"Java Spring","Creating Rest Apis in Java Spring Boot"));
//    }
//
//    @Override
//    public List<Course> getCourses() {
//        return courseDao.findAll();
//    }
//
//    @Override
//    public Course getCourse(long courseId) {
////        Course c= null;
////        for (Course course : list)
////        {
////            if(course.getId() == courseId)
////            {
////                c = course;
////                break;
////              }
////        }
//        return courseDao.getOne(courseId);
//    }
//
//    @Override
//    public Course addCourse(Course course) {
//
////        list.add(course);
//            courseDao.save(course);
////        return course;
//        return course;
//    }
//
//    @Override
//    public Course updateCourse( long courseId, Course course) {
////        Course existingCourse = getCourse(courseId);
////        if (existingCourse != null) {
////            existingCourse.setTitle(course.getTitle());
////            existingCourse.setDescription(course.getDescription());
//////            logger.info("Updated course: " + existingCourse);
////            return existingCourse;
////        }
//        courseDao.save(course);
//        return course;
//    }
//
//    @Override
//    public void deleteCourse(long courseId) {
////        Course course = getCourse(courseId);
////        if (course != null) {
////            list.remove(course);
//////            logger.info("Deleted course with id: " + courseId);
////        }
////        Long Long;
////        Course entity = courseDao.getOne(Long);
////        courseDao.delete(entity);
//
//
//    }
//
//
//}
