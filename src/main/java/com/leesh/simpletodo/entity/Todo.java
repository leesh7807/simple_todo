package com.leesh.simpletodo.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Todo {
    String title;
    List<Item> items = new ArrayList<>();
}
