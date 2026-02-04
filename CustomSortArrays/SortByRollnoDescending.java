import java.util.*;
class SortByRollnoDescending implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s2.rollno>s1.rollno)return 1;
        else if (s2.rollno==s1.rollno)return 0;
        else return -1;
    }
}