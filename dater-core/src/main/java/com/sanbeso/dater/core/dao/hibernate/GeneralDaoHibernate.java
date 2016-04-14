package com.sanbeso.dater.core.dao.hibernate;

import com.sanbeso.dater.core.dao.GeneralDao;
import com.sanbeso.dater.core.exception.ValidationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.List;

/**
 *
 *
 * @author Jose Beas
 * @version 1.0
 */
@Repository
public class GeneralDaoHibernate implements GeneralDao {

    @Autowired
    protected SessionFactory sessionFactory;

    @Autowired
    protected MessageSource messageSource;

    protected Errors errors;

    /**
     * @return
     */
    public Session getSession() {
        if(sessionFactory.getCurrentSession().isOpen()) {
            return sessionFactory.getCurrentSession();
        } else {
            return sessionFactory.openSession();
        }
    }

    /**
     * @param validator
     * @param target
     * @param objectName
     */
    public void validate(Validator validator, Object target, String objectName) throws ValidationException {
        errors = new BindException(target, objectName);
        validator.validate(target, errors);
        if(errors.hasErrors()){
            List<ObjectError> errorList = errors.getAllErrors();
            StringBuilder sb = new StringBuilder();
            sb.append("A validation error occurred, details: ");
            for(ObjectError error : errorList){
                sb.append(messageSource.getMessage(error.getCode(), null, LocaleContextHolder.getLocale()));
                sb.append("|");
            }
            throw new ValidationException(sb.toString());
        }
    }
}
