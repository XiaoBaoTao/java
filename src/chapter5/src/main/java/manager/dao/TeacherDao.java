package manager.dao;

import com.google.gson.Gson;
import manager.domain.Teacher;

import java.util.ArrayList;
import java.util.Optional;

public class TeacherDao {

    private static final ArrayList<Teacher> teachers = new ArrayList<>();

    public boolean isExist(String id) {
        Optional<Teacher> first = teachers.stream().filter(teacher -> teacher.getId().equals(id)).findFirst();
        return first.isPresent();
    }

    public boolean addTeacher(Teacher teacher) {
        teachers.add(teacher);
        return true;
    }

    public String listTeachers() {
        return new Gson().toJson(teachers);
    }

    public boolean deleteTeacher(String id) {
        return teachers.removeIf(teacher -> teacher.getId().equals(id));
    }

    public boolean editTeacher(String id, String name, int age, String birthday) {
        Teacher teacher = teachers.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher != null) {
            teacher.setName(name);
            teacher.setAge(age);
            teacher.setBirthday(birthday);
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return teachers.isEmpty();
    }
}
