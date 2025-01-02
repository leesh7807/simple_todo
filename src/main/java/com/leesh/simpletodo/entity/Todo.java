package com.leesh.simpletodo.entity;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
public class Todo {
    @Id
    String id;
    String title;
    List<Item> items = new ArrayList<>();
}
