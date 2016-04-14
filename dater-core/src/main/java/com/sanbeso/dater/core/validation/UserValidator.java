package com.sanbeso.dater.core.validation;

import com.sanbeso.dater.core.dto.UserDto;
import com.sanbeso.dater.core.utils.SanbesoStringUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 */
@Component
@Qualifier("userValidator")
public class UserValidator implements Validator{

    /**
     *
     * @param aClass
     * @return
     */
    public boolean supports(Class<?> aClass) {
        if(aClass !=null){
            return aClass.getClass().equals(UserDto.class);
        }
        return false;
    }

    /**
     *
     * @param target
     * @param errors
     */
    public void validate(Object target, Errors errors) {
        if(target != null){
            UserDto user = (UserDto)target;
            if(SanbesoStringUtils.isEmpty(user.getUsername())){
                errors.rejectValue("name", "user.validation.name");
            }
        }
    }
}
