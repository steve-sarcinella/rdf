package io.appathy.models;

import com.google.auto.value.AutoValue;

@AutoValue public abstract class Server {
    public abstract String name(); //Utilizing name as a unique constraint
    public abstract int populationMax();
    public abstract int populationCurrent();
}
