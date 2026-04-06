package com.google.android.gms.common.api.internal;

final class zabo implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zabp f24656z;

    public zabo(zabp zabp) {
        this.f24656z = zabp;
    }

    public final void run() {
        zabq zabq = this.f24656z.f24657a;
        zabq.f24659m.f(zabq.f24659m.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
