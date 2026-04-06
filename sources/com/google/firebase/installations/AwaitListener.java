package com.google.firebase.installations;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

final class AwaitListener implements OnCompleteListener<Void> {

    /* renamed from: z  reason: collision with root package name */
    public final CountDownLatch f30774z;

    public void a(Task task) {
        this.f30774z.countDown();
    }
}
