package com.leesh.simpletodo.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Item {
    String contents;
    List<Item> subItems = new ArrayList<>();
}
