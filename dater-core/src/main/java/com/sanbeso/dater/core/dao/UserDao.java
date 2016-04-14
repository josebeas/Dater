package com.sanbeso.dater.core.dao;


import com.sanbeso.dater.core.dto.UserDto;
import com.sanbeso.dater.core.exception.PersistenceException;
import com.sanbeso.dater.core.exception.ValidationException;

import java.util.List;

public interface UserDao {

    String insert(UserDto user) throws PersistenceException, ValidationException;

    String update(UserDto user) throws PersistenceException, ValidationException;

    String delete(UserDto user) throws PersistenceException;

    UserDto get(UserDto user) throws PersistenceException;

    UserDto get(String userId) throws PersistenceException;

    List<UserDto> list(UserDto user) throws PersistenceException;

}
