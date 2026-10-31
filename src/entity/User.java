package entity;

import java.time.LocalDateTime;

public record User(
    int id,
    String name,
    int age
) {}
