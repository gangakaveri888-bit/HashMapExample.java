import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
                HashMap<Integer, String> students = new HashMap<>();
               students.put(101, "Rahul");
        students.put(102, "Anil");
        students.put(103, "Priya");
        students.put(104, "Sneha");
        System.out.println("Student Details:");
        System.out.println(students);
        System.out.println("Student with Roll No 102: "
                + students.get(102));
        students.remove(104);
                System.out.println("After removing Roll No 104:");
        System.out.println(students);
    }
}
output:
Student Details:
{101=Rahul, 102=Anil, 103=Priya, 104=Sneha}
Student with Roll No 102: Anil
After removing Roll No 104:
{101=Rahul, 102=Anil, 103=Priya}
