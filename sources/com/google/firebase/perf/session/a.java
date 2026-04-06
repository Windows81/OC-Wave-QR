package com.google.firebase.perf.session;

import android.content.Context;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Context f31033A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PerfSession f31034B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SessionManager f31035z;

    public /* synthetic */ a(SessionManager sessionManager, Context context, PerfSession perfSession) {
        this.f31035z = sessionManager;
        this.f31033A = context;
        this.f31034B = perfSession;
    }

    public final void run() {
        this.f31035z.lambda$setApplicationContext$0(this.f31033A, this.f31034B);
    }
}
