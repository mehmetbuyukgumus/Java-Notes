package introduction;
public class arrays {
    public static void main(String[] args) {
        String[] students = new String[3];
        students[0] = "Ahmet";
        students[1] = "Mehmet";
        students[2] = "İbrahim";
        String[] teachers = {"Mehmet", "Ahmet"};
        for (int i=0; i<students.length; i++){
            System.out.println(students[i]);
        }
        for(String stu : students){
            System.out.println(stu);
        }
        for(String teacher : teachers){
            System.out.println(teacher);
        }
        Integer[] numbers = {1,2,3,4};
        for (Integer number : numbers){
            System.out.println(number);
        }
    }
}