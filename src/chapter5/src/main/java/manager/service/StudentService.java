package manager.service;

import manager.dao.StudentDao;
import manager.domain.Student;

import java.util.ArrayList;

public class StudentService {

    private final StudentDao studentDao = new StudentDao();

    public boolean addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    public ArrayList<Student> listStudents() {
        return studentDao.listStudents();
    }

    public boolean isExist(String id) {
        return studentDao.isExist(id);
    }

    public boolean deleteStudent(String id) {
        return studentDao.deleteStudent(id);
    }

    public boolean editStudent(String id, String name, int age, String birthday) {
        return studentDao.editStudent(id, name, age, birthday);
    }
}
