package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import java.util.Map;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Event f29806A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f29807z;

    public /* synthetic */ j(Map.Entry entry, Event event) {
        this.f29807z = entry;
        this.f29806A = event;
    }

    public final void run() {
        ((EventHandler) this.f29807z.getKey()).a(this.f29806A);
    }
}
