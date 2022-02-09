package com.stanli.blogapp.service;

import com.stanli.blogapp.dto.PersonRequestDto;
import com.stanli.blogapp.dto.PersonResponseDto;

public interface PersonService {

    PersonResponseDto register(PersonRequestDto requestDto);

    PersonResponseDto login(PersonRequestDto requestDto);
}
