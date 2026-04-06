package com.google.firebase.installations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;

public final /* synthetic */ class a implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseApp f30807a;

    public /* synthetic */ a(FirebaseApp firebaseApp) {
        this.f30807a = firebaseApp;
    }

    public final Object get() {
        return FirebaseInstallations.z(this.f30807a);
    }
}
