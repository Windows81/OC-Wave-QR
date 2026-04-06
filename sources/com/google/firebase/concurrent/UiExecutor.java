package com.google.firebase.concurrent;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum UiExecutor implements Executor {
    INSTANCE;
    

    /* renamed from: A  reason: collision with root package name */
    public static final Handler f29842A = null;

    static {
        f29842A = new Handler(Looper.getMainLooper());
    }

    public void execute(Runnable runnable) {
        f29842A.post(runnable);
    }
}
