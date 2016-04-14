package com.sanbeso.dater.core.dao.hibernate;

import com.sanbeso.dater.core.dao.UserDao;
import com.sanbeso.dater.core.dto.UserDto;
import com.sanbeso.dater.core.exception.PersistenceException;
import com.sanbeso.dater.core.exception.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.Validator;

import java.util.List;
import java.util.logging.Logger;

public class UserDaoHibernate extends GeneralDaoHibernate implements UserDao {

    private static final Logger LOGGER = Logger.getLogger(UserDaoHibernate.class.getName());

    private static final String LABEL = "users";

    private static final String OBJECT_NAME = "user";

    private static final Object[] NULL_PARAMS_FOR_MESSAGES = {};

    @Autowired
    @Qualifier("userValidator")
    private Validator validator;

    private boolean exist(UserDto userDto) throws PersistenceException {
        boolean exist = false;
        UserDto toFind = new UserDto();
        toFind.setUsername(userDto.getUsername());
        List<UserDto> found = list(toFind);
        return exist;
    }

    public String insert(UserDto user) throws PersistenceException, ValidationException {
        return null;
    }

    public String update(UserDto user) throws PersistenceException, ValidationException {
        return null;
    }

    public String delete(UserDto user) throws PersistenceException {
        return null;
    }

    public UserDto get(UserDto user) throws PersistenceException {
        return null;
    }

    public UserDto get(String userId) throws PersistenceException {
        return null;
    }

    public List<UserDto> list(UserDto user) throws PersistenceException {
        return null;
    }
}
