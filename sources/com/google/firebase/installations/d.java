package com.google.firebase.installations;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f30811A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f30812z;

    public /* synthetic */ d(FirebaseInstallations firebaseInstallations, boolean z2) {
        this.f30812z = firebaseInstallations;
        this.f30811A = z2;
    }

    public final void run() {
        this.f30812z.w(this.f30811A);
    }
}
