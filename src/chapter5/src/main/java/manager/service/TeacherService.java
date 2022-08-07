package manager.service;

import manager.dao.TeacherDao;
import manager.domain.Teacher;

public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();

    public boolean isExist(String id) {
        return teacherDao.isExist(id);
    }

    public boolean addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }

    public String listTeachers() {
        return teacherDao.listTeachers();
    }

    public boolean deleteTeacher(String id) {
        return teacherDao.deleteTeacher(id);
    }

    public boolean editTeacher(String id, String name, int age, String birthday) {
        return teacherDao.editTeacher(id, name, age, birthday);
    }


    public boolean isEmpty() {
        return teacherDao.isEmpty();
    }
}
