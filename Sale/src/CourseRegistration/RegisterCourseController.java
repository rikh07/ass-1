/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CourseRegistration;

/**
 *
 * @author Nibir
 */
public class RegisterCourseController {
    
    Registration registration;
    
    public void makeNewRegistration(){
        registration = new Registration();
    }
    
    public void addCourse(String id){
        CourseFactory courseFactory = new CourseFactory();
        registration.addCourse(courseFactory.getCourse(id));
    }
    
    public Registration getRegistration(){
        return this.registration;
    }
    
    public void getCourse(String id){
        CourseFactory courseFactory = new CourseFactory();
        courseFactory.getCourse(id);
    }
}
