package com.google.firebase.remoteconfig.internal;

import androidx.privacysandbox.ads.adservices.adid.e;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ConfigCacheClient {

    /* renamed from: d  reason: collision with root package name */
    public static final Map f31256d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final Executor f31257e = new e();

    /* renamed from: a  reason: collision with root package name */
    public final Executor f31258a;

    /* renamed from: b  reason: collision with root package name */
    public final ConfigStorageClient f31259b;

    /* renamed from: c  reason: collision with root package name */
    public Task f31260c = null;

    public static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f31261a;

        public AwaitListener() {
            this.f31261a = new CountDownLatch(1);
        }

        public void a(Object obj) {
            this.f31261a.countDown();
        }

        public void b() {
            this.f31261a.countDown();
        }

        public boolean c(long j2, TimeUnit timeUnit) {
            return this.f31261a.await(j2, timeUnit);
        }

        public void e(Exception exc) {
            this.f31261a.countDown();
        }
    }

    public ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.f31258a = executor;
        this.f31259b = configStorageClient;
    }

    public static Object c(Task task, long j2, TimeUnit timeUnit) {
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = f31257e;
        task.f(executor, awaitListener);
        task.e(executor, awaitListener);
        task.a(executor, awaitListener);
        if (!awaitListener.c(j2, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (task.n()) {
            return task.k();
        } else {
            throw new ExecutionException(task.j());
        }
    }

    public static synchronized ConfigCacheClient h(Executor executor, ConfigStorageClient configStorageClient) {
        ConfigCacheClient configCacheClient;
        synchronized (ConfigCacheClient.class) {
            try {
                String b2 = configStorageClient.b();
                Map map = f31256d;
                if (!map.containsKey(b2)) {
                    map.put(b2, new ConfigCacheClient(executor, configStorageClient));
                }
                configCacheClient = (ConfigCacheClient) map.get(b2);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return configCacheClient;
    }

    public void d() {
        synchronized (this) {
            this.f31260c = Tasks.e((Object) null);
        }
        this.f31259b.a();
    }

    public synchronized Task e() {
        try {
            Task task = this.f31260c;
            if (task != null) {
                if (task.m() && !this.f31260c.n()) {
                }
            }
            Executor executor = this.f31258a;
            ConfigStorageClient configStorageClient = this.f31259b;
            Objects.requireNonNull(configStorageClient);
            this.f31260c = Tasks.c(executor, new b(configStorageClient));
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f31260c;
    }

    public ConfigContainer f() {
        return g(5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        return (com.google.firebase.remoteconfig.internal.ConfigContainer) c(e(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.ConfigContainer g(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.tasks.Task r0 = r2.f31260c     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.n()     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.tasks.Task r3 = r2.f31260c     // Catch:{ all -> 0x0015 }
            java.lang.Object r3 = r3.k()     // Catch:{ all -> 0x0015 }
            com.google.firebase.remoteconfig.internal.ConfigContainer r3 = (com.google.firebase.remoteconfig.internal.ConfigContainer) r3     // Catch:{ all -> 0x0015 }
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r3
        L_0x0015:
            r3 = move-exception
            goto L_0x0033
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            com.google.android.gms.tasks.Task r0 = r2.e()     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            java.lang.Object r3 = c(r0, r3, r1)     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            com.google.firebase.remoteconfig.internal.ConfigContainer r3 = (com.google.firebase.remoteconfig.internal.ConfigContainer) r3     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            return r3
        L_0x0025:
            r3 = move-exception
            goto L_0x002a
        L_0x0027:
            r3 = move-exception
            goto L_0x002a
        L_0x0029:
            r3 = move-exception
        L_0x002a:
            java.lang.String r4 = "FirebaseRemoteConfig"
            java.lang.String r0 = "Reading from storage file failed."
            android.util.Log.d(r4, r0, r3)
            r3 = 0
            return r3
        L_0x0033:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigCacheClient.g(long):com.google.firebase.remoteconfig.internal.ConfigContainer");
    }

    public final /* synthetic */ Void i(ConfigContainer configContainer) {
        return this.f31259b.e(configContainer);
    }

    public final /* synthetic */ Task j(boolean z2, ConfigContainer configContainer, Void voidR) {
        if (z2) {
            m(configContainer);
        }
        return Tasks.e(configContainer);
    }

    public Task k(ConfigContainer configContainer) {
        return l(configContainer, true);
    }

    public Task l(ConfigContainer configContainer, boolean z2) {
        return Tasks.c(this.f31258a, new c(this, configContainer)).p(this.f31258a, new d(this, z2, configContainer));
    }

    public final synchronized void m(ConfigContainer configContainer) {
        this.f31260c = Tasks.e(configContainer);
    }
}
