package io.appathy.models.instances;

import com.google.auto.value.AutoValue;

@AutoValue public abstract class Instance {
    public abstract String id();
    public abstract String name(); //Id != name to allow for multiple, same name, dungeons (i.e. ICC 10 man, ICC 25man)

    public abstract Integer levelMin();
    public abstract Integer levelMax();

    public abstract Integer groupCapacity(); //Unbound for world pvp/raids

    public abstract boolean ignoreRoles();
    public abstract boolean ignoreLeader();
}
