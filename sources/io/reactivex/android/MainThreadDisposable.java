package io.reactivex.android;

import io.reactivex.disposables.Disposable;

public abstract class MainThreadDisposable implements Disposable {

    /* renamed from: io.reactivex.android.MainThreadDisposable$1  reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ MainThreadDisposable f39844z;

        public void run() {
            this.f39844z.a();
        }
    }

    public abstract void a();
}
