package com.google.firebase.concurrent;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Runnable f29845A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CustomThreadFactory f29846z;

    public /* synthetic */ a(CustomThreadFactory customThreadFactory, Runnable runnable) {
        this.f29846z = customThreadFactory;
        this.f29845A = runnable;
    }

    public final void run() {
        this.f29846z.b(this.f29845A);
    }
}
