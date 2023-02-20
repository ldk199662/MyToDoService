package my.todo.mytodoapp.service;

import lombok.AllArgsConstructor;
import my.todo.mytodoapp.model.ToDo;
import my.todo.mytodoapp.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ToDoService {
    private ToDoRepository toDoRepository;

    public static List<ToDo> getUserList() {
        return toDoRepository.findAll();
    }
}
