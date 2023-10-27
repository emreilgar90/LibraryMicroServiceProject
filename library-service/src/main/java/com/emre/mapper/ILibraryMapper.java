package com.emre.mapper;

import com.emre.dto.LibraryDto;
import com.emre.repository.entity.Library;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE )
public interface ILibraryMapper {
    ILibraryMapper INSTANCE = Mappers.getMapper(ILibraryMapper.class);

    LibraryDto toLibraryDto(final Library library);
}
