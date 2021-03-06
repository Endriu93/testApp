package com.awegrzyn.testapp.service.mapper;

import com.awegrzyn.testapp.domain.*;
import com.awegrzyn.testapp.service.dto.BookDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Book and its DTO BookDTO.
 */
@Mapper(componentModel = "spring", uses = {AuthorMapper.class})
public interface BookMapper extends EntityMapper<BookDTO, Book> {

    @Mapping(source = "author.id", target = "authorId")
    @Mapping(source = "author.name", target = "authorName")
    BookDTO toDto(Book book);

    @Mapping(source = "authorId", target = "author")
    Book toEntity(BookDTO bookDTO);

    default Book fromId(String id) {
        if (id == null) {
            return null;
        }
        Book book = new Book();
        book.setId(id);
        return book;
    }
}
