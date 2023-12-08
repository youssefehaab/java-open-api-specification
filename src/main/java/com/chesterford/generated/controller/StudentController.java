package com.chesterford.generated.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.chesterford.generated.StudentApi;
import com.chesterford.generated.StudentDto;
import com.chesterford.generated.service.StudentService;

@RestController
@RequiredArgsConstructor
public class StudentController implements StudentApi {

  private final StudentService studentService;

  @Override
  public ResponseEntity<List<StudentDto>> getAllStudents() {
    return ResponseEntity.ok(studentService.getAllStudents());
  }

  @Override
  public ResponseEntity<Void> upsertStudent(StudentDto studentDto) {
    studentService.upsertStudent(studentDto);
    return ResponseEntity.noContent().build();
  }
}
