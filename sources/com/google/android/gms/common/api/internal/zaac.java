package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zaac implements OnCompleteListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zaad f24550A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f24551z;

    public zaac(zaad zaad, TaskCompletionSource taskCompletionSource) {
        this.f24550A = zaad;
        this.f24551z = taskCompletionSource;
    }

    public final void a(Task task) {
        this.f24550A.f24553b.remove(this.f24551z);
    }
}
