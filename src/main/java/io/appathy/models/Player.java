package io.appathy.models;

import com.google.auto.value.AutoValue;
import io.appathy.models.instances.Instance;

import java.util.Set;

@AutoValue public abstract class Player {
    //Realm + Character info
    public abstract String id();
    public abstract String name();
    public abstract Server server();

    //Character specifics
    public abstract int level();
    public abstract int itemLevel();
    public abstract PlayerRole role();
    public abstract Set<Instance> selectedInstances();
}
