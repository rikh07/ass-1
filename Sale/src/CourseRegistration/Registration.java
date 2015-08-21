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

//import java.util.ArrayList;
import java.util.LinkedList;

public class Registration {
    
    LinkedList<Course> courseList;
    
    public Registration(){
        courseList = new LinkedList<>();
    }
    
    public void addCourse(Course course){
        courseList.add(course);
    }
    
    public int getTotal(){
        int total = 0;
        for(int i = 0; i < courseList.size(); i++)
            total += courseList.get(i).getSubTotal();
        System.out.println(total);
        return total;
    }
    
}
