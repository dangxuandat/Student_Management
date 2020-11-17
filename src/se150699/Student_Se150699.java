
package se150699;

/**
 *
 * @author SE150699
 */
public class Student_Se150699{
    String code;
    String name;
    String class_id;
    float mark_pro192;
    float mark_Pro201;
    float mark_dbi202;
    float GPA;

    public Student_Se150699(String code, String name, String class_id, float mark_pro192, float mark_Pro201, float mark_dbi202){
        this.code = code;
        this.name = name;
        this.class_id = class_id;
        this.mark_pro192 = mark_pro192;
        this.mark_Pro201 = mark_Pro201;
        this.mark_dbi202 = mark_dbi202;
        this.GPA = (mark_pro192 + mark_Pro201 + mark_dbi202)/3;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass_id() {
        return this.class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public float getMark_pro192() {
        return this.mark_pro192;
    }

    public void setMark_pro192(float mark_pro192) {
        this.mark_pro192 = mark_pro192;
    }

    public float getMark_Pro201() {
        return this.mark_Pro201;
    }

    public void setMark_Pro201(float mark_Pro201) {
        this.mark_Pro201 = mark_Pro201;
    }

    public float getMark_dbi202() {
        return this.mark_dbi202;
    }

    public void setMark_dbi202(float mark_dbi202) {
        this.mark_dbi202 = mark_dbi202;
    }
    public float getGPA(){
        return this.GPA;
    }

    public void print(){
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Class-id: " + class_id);
        System.out.println("Mark_pro192: " + mark_pro192);
        System.out.println("Mark_Pro201: " + mark_Pro201);
        System.out.println("Mark_dbi202: " + mark_dbi202);

    }

}
