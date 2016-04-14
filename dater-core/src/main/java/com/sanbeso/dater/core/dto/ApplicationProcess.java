package com.sanbeso.dater.core.dto;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Process DTO
 *
 * @author Jose Beas
 * @version 1.0
 */
@Entity(name = "applicationProcess")
public class ApplicationProcess implements Serializable {

    private String id;

    private String name;

    private Module module;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
