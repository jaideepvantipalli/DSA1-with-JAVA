import java.util.Comparator;
public class SortByCgpaAscending implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.cgpa>s2.cgpa)return 1;
        else if (s1.cgpa==s2.cgpa)return 0;
        else return -1;
    }
}