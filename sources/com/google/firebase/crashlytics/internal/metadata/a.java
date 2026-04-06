package com.google.firebase.crashlytics.internal.metadata;

import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UserMetadata f30172a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f30173b;

    public /* synthetic */ a(UserMetadata userMetadata, List list) {
        this.f30172a = userMetadata;
        this.f30173b = list;
    }

    public final Object call() {
        return this.f30172a.i(this.f30173b);
    }
}
