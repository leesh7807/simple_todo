package com.leesh.simpletodo.entity;

import java.util.ArrayList;
import java.util.List;

public class Item {
    String contents;
    List<Item> subItems = new ArrayList<>();
}
