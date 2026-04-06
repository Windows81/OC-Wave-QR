package com.google.android.datatransport;

public abstract class Event<T> {
    public static Event f(Object obj) {
        return new AutoValue_Event((Integer) null, obj, Priority.DEFAULT, (ProductData) null, (EventContext) null);
    }

    public static Event g(Object obj) {
        return new AutoValue_Event((Integer) null, obj, Priority.HIGHEST, (ProductData) null, (EventContext) null);
    }

    public abstract Integer a();

    public abstract EventContext b();

    public abstract Object c();

    public abstract Priority d();

    public abstract ProductData e();
}
