package session2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Classroom {
    String className;
    String room;
    ArrayList<Student> list = new ArrayList<>();

    public Classroom() {
    }

    public Classroom(String className, String room) {
        this.className = className;
        this.room = room;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public void update(Student s){
        for(int i=0;i<list.size();i++){
            if(list.get(i).id == s.id){
                list.get(i).name = s.name;
                list.get(i).email = s.email;
                list.get(i).mark = s.mark;
                return;
            }
        }
    }

    public void sort(){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.mark < o2.mark?-1:0;
            }
        });
    }
}
