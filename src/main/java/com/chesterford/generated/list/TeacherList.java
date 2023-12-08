package com.chesterford.generated.list;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

import com.chesterford.generated.TeacherDto;

@Component
public class TeacherList {

  public ArrayList<TeacherDto> teacherDtoArrayList;

  TeacherList() {
    teacherDtoArrayList = new ArrayList<>();
  }

}
