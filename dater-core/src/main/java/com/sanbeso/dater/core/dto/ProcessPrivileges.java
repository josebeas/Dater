package com.sanbeso.dater.core.dto;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Process privileges DTO
 *
 * @author Jose Beas
 * @version 1.0
 */
@Entity(name = "processPrivileges")
public class ProcessPrivileges implements Serializable {

    private UserDto userDto;

    private Process process;

    private boolean canWrite;

    private boolean canRead;

    private boolean canUpdate;

    private boolean canDelete;

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public boolean isCanWrite() {
        return canWrite;
    }

    public void setCanWrite(boolean canWrite) {
        this.canWrite = canWrite;
    }

    public boolean isCanRead() {
        return canRead;
    }

    public void setCanRead(boolean canRead) {
        this.canRead = canRead;
    }

    public boolean isCanUpdate() {
        return canUpdate;
    }

    public void setCanUpdate(boolean canUpdate) {
        this.canUpdate = canUpdate;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }
}
