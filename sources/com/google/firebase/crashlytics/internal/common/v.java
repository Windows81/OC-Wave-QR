package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class v implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f30113a;

    public /* synthetic */ v(TaskCompletionSource taskCompletionSource) {
        this.f30113a = taskCompletionSource;
    }

    public final Object a(Task task) {
        return Utils.j(this.f30113a, task);
    }
}
