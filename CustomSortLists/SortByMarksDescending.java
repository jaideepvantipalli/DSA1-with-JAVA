import java.util.*;
class SortByMarksDescending implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s2.marks>s1.marks)return 1;
        else if (s2.marks==s1.marks)return 0;
        else return -1;
    }
}
