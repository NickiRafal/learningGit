package com.kodilla.learninggit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Posts {
    private String title;
    private String content;
    private String author;
    private int likeCounter;

}
