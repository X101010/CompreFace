package com.exadel.frs.commonservice.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface EmbeddingResponseTimeProjection {
    String getId();
    String getSubjectName();
    LocalDateTime getCreatedDate();
}
