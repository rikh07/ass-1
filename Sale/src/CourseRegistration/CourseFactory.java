/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CourseRegistration;


//import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Nibir
 */
public class CourseFactory {
    
    LinkedList<Course> cList;
    
    public CourseFactory() {
        cList = new LinkedList<>();
        
        Course course = new Course();
        course.setId("CSE 327");
        course.setTitle("Soft Eng.");
        course.setCredit(3);
        course.setTuitionPerCredit(1500);
        
        Course course1 = new Course();
        course1.setId("CSE 327");
        course1.setTitle("Soft Eng.");
        course1.setCredit(3);
        course1.setTuitionPerCredit(1500);
        
        Course course2 = new Course();
        course2.setId("CSE 323");
        course2.setTitle("OS");
        course2.setCredit(3);
        course2.setTuitionPerCredit(1500);
        
        Course course3 = new Course();
        course3.setId("CSE 327");
        course3.setTitle("Soft Eng.");
        course3.setCredit(3);
        course3.setTuitionPerCredit(1500);
        
        Course course4 = new Course();
        course4.setId("CSE 327");
        course4.setTitle("Soft Eng.");
        course4.setCredit(3);
        course4.setTuitionPerCredit(1500);
        
        Course course5 = new Course();
        course5.setId("CSE 327");
        course5.setTitle("Soft Eng.");
        course5.setCredit(3);
        course5.setTuitionPerCredit(1500);
        
        Course course6 = new Course();
        course6.setId("CSE 327");
        course6.setTitle("Soft Eng.");
        course6.setCredit(3);
        course6.setTuitionPerCredit(1500);
        
        Course course7 = new Course();
        course7.setId("CSE 327");
        course7.setTitle("Soft Eng.");
        course7.setCredit(3);
        course7.setTuitionPerCredit(1500);
        
        Course course8 = new Course();
        course8.setId("CSE 327");
        course8.setTitle("Soft Eng.");
        course8.setCredit(3);
        course8.setTuitionPerCredit(1500);
        
        Course course9 = new Course();
        course9.setId("CSE 327");
        course9.setTitle("Soft Eng.");
        course9.setCredit(3);
        course9.setTuitionPerCredit(1500);
        
        cList.add(course);
        cList.add(course1);
        cList.add(course2);
        cList.add(course3);
        cList.add(course4);
        cList.add(course5);
        cList.add(course6);
        cList.add(course7);
        cList.add(course8);
        cList.add(course9);
    }
    
    public Course getCourse(String id){
        Course course = null;       
        for(int i = 0; i < cList.size(); i++)
        {
            if(cList.get(i).getId().equals(id))
            {
                course = cList.get(i);
                break;
            }
        }
        return course;
    }
}
