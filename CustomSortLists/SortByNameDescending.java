import java.util.Comparator;
public class SortByNameDescending implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s2.sname.compareTo(s1.sname)>0)return 1;
        else if (s2.sname.compareTo(s1.sname)==0)return 0;
        else return -1;
    }
}