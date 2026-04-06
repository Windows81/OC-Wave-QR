package io.realm.internal.async;

import io.realm.RealmAsyncTask;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public final class RealmAsyncTaskImpl implements RealmAsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final Future f40253a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadPoolExecutor f40254b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f40255c = false;

    public RealmAsyncTaskImpl(Future future, ThreadPoolExecutor threadPoolExecutor) {
        this.f40253a = future;
        this.f40254b = threadPoolExecutor;
    }
}
