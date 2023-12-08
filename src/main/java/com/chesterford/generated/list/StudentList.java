package com.chesterford.generated.list;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

import com.chesterford.generated.StudentDto;

@Component
public class StudentList {

  public ArrayList<StudentDto> studentDtoArrayList;

  StudentList() {
    studentDtoArrayList = new ArrayList<>();
  }
}
