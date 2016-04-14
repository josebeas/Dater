package com.sanbeso.dater.core.dao;

import com.sanbeso.dater.core.exception.ValidationException;
import org.hibernate.Session;
import org.springframework.validation.Validator;

/**
 * General DAO interface, determines general behavior or each dao implementation
 *
 * @author Jose Beas
 * @version 1.0
 */
public interface GeneralDao {

    /**
     *
     * @return
     */
    Session getSession();

    /**
     *
     * @param validator
     * @param target
     * @param objectName
     */
    void validate(Validator validator, Object target, String objectName) throws ValidationException;
}
