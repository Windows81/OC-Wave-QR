package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class s implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f30108a;

    public /* synthetic */ s(CountDownLatch countDownLatch) {
        this.f30108a = countDownLatch;
    }

    public final Object a(Task task) {
        return this.f30108a.countDown();
    }
}
