package com.google.firebase;

import android.content.Context;
import com.google.firebase.inject.Provider;

public final /* synthetic */ class a implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseApp f29663a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f29664b;

    public /* synthetic */ a(FirebaseApp firebaseApp, Context context) {
        this.f29663a = firebaseApp;
        this.f29664b = context;
    }

    public final Object get() {
        return this.f29663a.v(this.f29664b);
    }
}
