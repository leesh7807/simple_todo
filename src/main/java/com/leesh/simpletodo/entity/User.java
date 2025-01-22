package com.leesh.simpletodo.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Builder
@Getter
public class User {
    @Id
    String id;
    String email;
    List<Todo> todos = new ArrayList<>();
}
