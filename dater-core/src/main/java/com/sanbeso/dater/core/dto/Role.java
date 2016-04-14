package com.sanbeso.dater.core.dto;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

/**
 * Role DTO
 *
 * @author Jose Beas
 * @version 1.0
 */
@Entity(name = "role")
public class Role implements Serializable {

    private String name;

    private Module module;

    private List<ApplicationProcess> applicationProcess;

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

    public List<ApplicationProcess> getApplicationProcess() {
        return applicationProcess;
    }

    public void setApplicationProcess(List<ApplicationProcess> applicationProcess) {
        this.applicationProcess = applicationProcess;
    }
}
