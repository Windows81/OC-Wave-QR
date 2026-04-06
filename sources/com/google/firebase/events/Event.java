package com.google.firebase.events;

public class Event<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class f30748a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f30749b;

    public Object a() {
        return this.f30749b;
    }

    public Class b() {
        return this.f30748a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f30748a, this.f30749b});
    }
}
