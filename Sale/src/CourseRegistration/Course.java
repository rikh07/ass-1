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
public class Course {
    
    private String id;
    private String title;
    private int credit;
    private int tuitionPerCredit;
    
    // get methods
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCredit() {
        return credit;
    }

    public int getTuitionPerCredit() {
        return tuitionPerCredit;
    }
    
    // set methods
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setTuitionPerCredit(int tuitionPerCredit) {
        this.tuitionPerCredit = tuitionPerCredit;
    }
    
    public int getSubTotal() {
        return credit*tuitionPerCredit;
    }
}
