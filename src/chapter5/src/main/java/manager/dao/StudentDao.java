package manager.dao;

import manager.domain.Student;

import java.util.ArrayList;

public class StudentDao {


    private static final ArrayList<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {
        students.add(student);
        return true;
    }

    public ArrayList<Student> listStudents() {
        return students;
    }

    public boolean isExist(String id) {
        boolean isExist = false;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    public boolean deleteStudent(String id) {
        boolean isDelete = false;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId().equals(id)) {
                students.remove(student);
                isDelete = true;
            }
        }
        return isDelete;
    }

    public boolean editStudent(String id, String name, int age, String birthday) {
        boolean isEdit = false;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(name);
                student.setAge(age);
                student.setBirthday(birthday);
                isEdit = true;
                break;

            }
        }
        return isEdit;
    }
}
