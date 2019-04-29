package com.awegrzyn.testapp.service.impl;

import com.awegrzyn.testapp.service.AuthorService;
import com.awegrzyn.testapp.domain.Author;
import com.awegrzyn.testapp.repository.AuthorRepository;
import com.awegrzyn.testapp.service.dto.AuthorDTO;
import com.awegrzyn.testapp.service.mapper.AuthorMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing Author.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    private final Logger log = LoggerFactory.getLogger(AuthorServiceImpl.class);

    private final AuthorRepository authorRepository;

    private final AuthorMapper authorMapper;

    public AuthorServiceImpl(AuthorRepository authorRepository, AuthorMapper authorMapper) {
        this.authorRepository = authorRepository;
        this.authorMapper = authorMapper;
    }

    /**
     * Save a author.
     *
     * @param authorDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public AuthorDTO save(AuthorDTO authorDTO) {
        log.debug("Request to save Author : {}", authorDTO);
        Author author = authorMapper.toEntity(authorDTO);
        author = authorRepository.save(author);
        return authorMapper.toDto(author);
    }

    /**
     * Get all the authors.
     *
     * @return the list of entities
     */
    @Override
    public List<AuthorDTO> findAll() {
        log.debug("Request to get all Authors");
        return authorRepository.findAll().stream()
            .map(authorMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }


    /**
     * Get one author by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    public Optional<AuthorDTO> findOne(String id) {
        log.debug("Request to get Author : {}", id);
        return authorRepository.findById(id)
            .map(authorMapper::toDto);
    }

    /**
     * Delete the author by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(String id) {
        log.debug("Request to delete Author : {}", id);        authorRepository.deleteById(id);
    }
}
