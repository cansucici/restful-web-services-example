package com.example.restfulwebservicesexample.todo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList();

    private static long idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "in28Minutes", "Learn to Dance", new Date(), false));
        todos.add(new Todo(++idCounter, "in28Minutes", "Learn to mvc", new Date(), false));
        todos.add(new Todo(++idCounter, "in28Minutes", "Learn to react", new Date(), false));
        todos.add(new Todo(++idCounter, "in28Minutes", "Learn to react", new Date(), false));
        todos.add(new Todo(++idCounter, "in28Minutes", "Learn to react", new Date(), false));
        todos.add(new Todo(++idCounter, "in28Minutes", "Learn to react", new Date(), false));
        todos.add(new Todo(++idCounter, "in28Minutes", "Learn to react", new Date(), false));
        todos.add(new Todo(++idCounter, "in28Minutes", "Learn to react", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Todo save(Todo todo) {
        if(todo.getId() == -1 || todo.getId()==0) {
            todo.setId(++idCounter);
        } else {
            deleteById(todo.getId());
        }
        todos.add(todo);
        return todo;
    }

    public Todo deleteById(long id) {
        Todo todo = findById(id);
        if (todo == null) return null;
        if (todos.remove(todo)) {
            return todo;
        }
        return null;
    }

    public Todo findById(long id) {
        for (Todo todoItem : todos) {
            if (todoItem.getId() == id) {
                return todoItem;
            }
        }
        return null;
    }
}
