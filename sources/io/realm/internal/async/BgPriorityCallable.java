package io.realm.internal.async;

import android.os.Process;
import java.util.concurrent.Callable;

public class BgPriorityCallable<T> implements Callable<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Callable f40251a;

    public Object call() {
        Process.setThreadPriority(10);
        return this.f40251a.call();
    }
}
