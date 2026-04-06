package com.google.firebase.sessions;

import com.google.android.datatransport.Transformer;

public final /* synthetic */ class a implements Transformer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EventGDTLogger f31577a;

    public /* synthetic */ a(EventGDTLogger eventGDTLogger) {
        this.f31577a = eventGDTLogger;
    }

    public final Object apply(Object obj) {
        return this.f31577a.c((SessionEvent) obj);
    }
}
