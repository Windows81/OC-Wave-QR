package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class u implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f30112a;

    public /* synthetic */ u(TaskCompletionSource taskCompletionSource) {
        this.f30112a = taskCompletionSource;
    }

    public final Object a(Task task) {
        return Utils.l(this.f30112a, task);
    }
}
