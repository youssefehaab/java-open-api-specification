package com.chesterford.generated.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import com.chesterford.generated.StudentDto;
import com.chesterford.generated.list.StudentList;

@Service
@RequiredArgsConstructor
public class StudentService {

  private final StudentList studentList;

  public void upsertStudent(StudentDto studentDto) {
    var studentDtoId = studentDto.getId();
    if (studentDtoId != null) {
      var studentListSize = studentList.studentDtoArrayList.size();
      for (int i = 0; i < studentListSize; i++) {
        var student = studentList.studentDtoArrayList.get(i);
        if (student.getId().equals(studentDtoId)) {
          studentList.studentDtoArrayList.set(i, studentDto);
          return;
        }
      }
      studentList.studentDtoArrayList.add(studentDto);
    }
  }

  public List<StudentDto> getAllStudents() {
    return studentList.studentDtoArrayList;
  }

}
