package io.appathy.models.instances;

public abstract class RoleIgnoringInstance extends Instance {
    @Override
    public boolean ignoreRoles() {
        return true;
    }

    @Override
    public boolean ignoreLeader() {
        return true;
    }
}
