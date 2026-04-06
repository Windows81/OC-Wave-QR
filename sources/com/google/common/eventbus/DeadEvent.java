package com.google.common.eventbus;

import com.google.common.base.MoreObjects;

@ElementTypesAreNonnullByDefault
public class DeadEvent {

    /* renamed from: a  reason: collision with root package name */
    public final Object f28709a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f28710b;

    public String toString() {
        return MoreObjects.c(this).d("source", this.f28709a).d("event", this.f28710b).toString();
    }
}
