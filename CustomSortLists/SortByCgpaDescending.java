import java.util.*;
class SortByCgpaDescending implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s2.cgpa>s1.cgpa)return 1;
        else if (s2.cgpa==s1.cgpa)return 0;
        else return -1;
    }
}