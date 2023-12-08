package com.chesterford.generated.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.chesterford.generated.TeacherApi;
import com.chesterford.generated.TeacherDto;
import com.chesterford.generated.service.TeacherService;

@RestController
@RequiredArgsConstructor
public class TeacherController implements TeacherApi {

  private final TeacherService teacherService;


  @Override
  public ResponseEntity<List<TeacherDto>> getAllTeachers() {
    return ResponseEntity.ok(teacherService.getAllTeachers());
  }

  @Override
  public ResponseEntity<Void> upsertTeacher(TeacherDto teacherDto) {
    teacherService.upsertTeacher(teacherDto);
    return ResponseEntity.noContent().build();
  }
}
