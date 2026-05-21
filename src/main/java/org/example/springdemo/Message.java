package org.example.springdemo;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record Message(String id, String name, String message) {
}
