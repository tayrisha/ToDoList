package org.example;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tasks {
    private int taskNumber;
    private String taskText;
}
