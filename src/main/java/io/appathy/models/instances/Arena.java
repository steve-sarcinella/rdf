package io.appathy.models.instances;

public abstract class Arena extends RoleIgnoringInstance {
    @Override
    public boolean ignoreLeader() {
        return false;
    }
}
