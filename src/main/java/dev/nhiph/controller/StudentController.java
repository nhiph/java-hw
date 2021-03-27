package dev.nhiph.controller;

import dev.nhiph.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private List<Student> studentList = new ArrayList<>();
//    List<Student> studentList = Arrays.asList(
//            new Student("binhcn", 23),
//            new Student("nhiph", 23));

//    @PostConstruct
//    private void init() {
//        studentList.add(new Student("binhcn", 23));
//        studentList.add(new Student("nhiph", 23));
//    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudentList() {
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id) {
        return new ResponseEntity<>(studentList.get(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Student> getStudent(@RequestBody Student student) {
        studentList.add(student);
//        return new ResponseEntity<>(student, HttpStatus.OK);
        return ResponseEntity.ok().body(student);
    }
}
