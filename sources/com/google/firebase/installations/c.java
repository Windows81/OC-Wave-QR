package com.google.firebase.installations;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f30809A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f30810z;

    public /* synthetic */ c(FirebaseInstallations firebaseInstallations, boolean z2) {
        this.f30810z = firebaseInstallations;
        this.f30809A = z2;
    }

    public final void run() {
        this.f30810z.y(this.f30809A);
    }
}
