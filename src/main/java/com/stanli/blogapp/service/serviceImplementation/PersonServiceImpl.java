package com.stanli.blogapp.service.serviceImplementation;

import com.stanli.blogapp.PersonRepository;
import com.stanli.blogapp.dto.PersonRequestDto;
import com.stanli.blogapp.dto.PersonResponseDto;
import com.stanli.blogapp.model.Person;
import com.stanli.blogapp.service.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class PersonServiceImpl implements PersonService, UserDetailsService {

    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    public PersonServiceImpl(PersonRepository personRepository, ModelMapper modelMapper) {
        this.personRepository = personRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public PersonResponseDto register(PersonRequestDto requestDto) {
        Person person = new Person();
        modelMapper.map(requestDto, person);
        personRepository.save(person);

        PersonResponseDto responseDto = new PersonResponseDto();
        modelMapper.map(person, responseDto);
        return responseDto;
    }

    @Override
    public PersonResponseDto login(PersonRequestDto requestDto) {

        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
