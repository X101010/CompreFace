package com.exadel.frs.core.trainservice.dto;

import lombok.Value;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Value
public class EmbeddingInfo {

    @NotNull
    String calculator;

    @NotNull
    double[] embedding;

    @Nullable
    byte[] source;
    @NotNull
    LocalDateTime createdDate;
}
