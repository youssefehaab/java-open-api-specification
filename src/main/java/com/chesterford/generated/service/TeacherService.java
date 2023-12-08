package com.chesterford.generated.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import com.chesterford.generated.TeacherDto;
import com.chesterford.generated.list.TeacherList;

@Service
@RequiredArgsConstructor
public class TeacherService {

  private final TeacherList teacherList;

  public void upsertTeacher(TeacherDto teacherDto) {
    var teacherId = teacherDto.getId();
    if (teacherId != null) {
      var teacherListSize = teacherList.teacherDtoArrayList.size();
      for (int i = 0; i < teacherListSize; i++) {
        var teacher = teacherList.teacherDtoArrayList.get(i);
        if (teacher.getId().equals(teacherId)) {
          teacherList.teacherDtoArrayList.set(i, teacherDto);
          return;
        }
      }
      teacherList.teacherDtoArrayList.add(teacherDto);
    }
  }

  public List<TeacherDto> getAllTeachers() {
    return teacherList.teacherDtoArrayList;
  }
}
