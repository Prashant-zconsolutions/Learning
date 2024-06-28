package modelmapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

import java.util.ArrayList;
import java.util.List;

public class DashBoard {

    public static void main(String[] args) {
        Student student = new Student(1,101,"Rohit");

        List<Student> list = new ArrayList<>();
        list.add(student);

        // Explicit Field Mapping
//        ModelMapper modelMapper = new ModelMapper();
//        TypeMap<Student,StudentDto> typeMap = modelMapper.createTypeMap(Student.class, StudentDto.class);
//        typeMap.addMappings(mapper -> {
//           mapper.map(src-> src.getStuId(),StudentDto::setDeptId);
//           mapper.map(src-> src.getDeptId(),StudentDto::setStuId);
//           mapper.map(src-> src.getName(),StudentDto::setName);
//        });
//        StudentDto studentDto = modelMapper.map(student, StudentDto.class);

         // Explicit Field Mapping
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.typeMap(Student.class, StudentDto.class).addMappings(mapper->
        {
           mapper.map(stu-> stu.getStuId(),StudentDto::setDeptId);
           mapper.map(stu-> stu.getDeptId(),StudentDto::setStuId);
           mapper.map(stu-> stu.getName(),StudentDto::setName);
        });
        StudentDto studentDto = modelMapper.map(student, StudentDto.class);


        // Property Mapping
//        ModelMapper modelMapper = new ModelMapper();
//         modelMapper.typeMap(Student.class, StudentDto.class).addMappings(mapper ->
//        {
//            mapper.map(Student::getDeptId,StudentDto::setStuId);
//            mapper.map(Student::getStuId,StudentDto::setDeptId);
//            mapper.map(Student::getName,StudentDto::setName);
//        });




        System.out.println(studentDto);


    }
}
