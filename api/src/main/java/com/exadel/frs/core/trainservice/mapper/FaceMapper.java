/*
 * Copyright (c) 2020 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.exadel.frs.core.trainservice.mapper;

import com.exadel.frs.core.trainservice.cache.CachedFace;
import com.exadel.frs.core.trainservice.dto.ui.FaceResponseDto;
import java.util.List;
import java.util.Set;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface FaceMapper {

    @Mapping(source = "imageId", target = "image_id")
    @Mapping(source = "name", target = "subject")
    FaceResponseDto toResponseDto(CachedFace faces);

    List<FaceResponseDto> toResponseDto(Set<CachedFace> faces);
}