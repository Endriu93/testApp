package com.awegrzyn.testapp.service.mapper;

import com.awegrzyn.testapp.domain.*;
import com.awegrzyn.testapp.service.dto.AuthorDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Author and its DTO AuthorDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AuthorMapper extends EntityMapper<AuthorDTO, Author> {


    @Mapping(target = "books", ignore = true)
    Author toEntity(AuthorDTO authorDTO);

    default Author fromId(String id) {
        if (id == null) {
            return null;
        }
        Author author = new Author();
        author.setId(id);
        return author;
    }
}
