//package ss10_list.bai_tap.bai_tap_them_1.repository.impl;
//
//public class TeacherRepository implements ITeacherRepository {
//    private static List<Teacher> teachersList = new ArrayList<>();
//    static {
//        teachersList.add(new Teacher(102, "Huy", "15/11/2001", true, "Toán"));
//        teachersList.add(new Teacher(190, "Chuong", "15/1/2001", true, "Lý "));
//        teachersList.add(new Teacher(316, "Bao", "5/11/2001", true, "Hoa"));
//    }
//
//    public List<Teacher> getAllTeacher() {
//        return teachersList;
//    }
//
//    @Override
//    public void addTeacher(Teacher teacher) {
//        teachersList.add(teacher);
//    }
//
//    @Override
//    public void deleteTeacher(int removeID) {
//        teachersList.remove(removeID);
//    }
//
//}
