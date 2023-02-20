package my.todo.mytodoapp.controller;

import lombok.AllArgsConstructor;
import my.todo.mytodoapp.model.ToDo;
import my.todo.mytodoapp.service.ToDoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@AllArgsConstructor
public class ToDoController {
    private final ToDoService toDoService;

    @GetMapping(value = "/todo")
    public List<ToDo> getUserList() {
        return ToDoService.getUserList();
    }
}
