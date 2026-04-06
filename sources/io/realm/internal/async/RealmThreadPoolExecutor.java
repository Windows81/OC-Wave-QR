package io.realm.internal.async;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public class RealmThreadPoolExecutor extends ThreadPoolExecutor {
    public static final int C = a();

    /* renamed from: A  reason: collision with root package name */
    public ReentrantLock f40256A;

    /* renamed from: B  reason: collision with root package name */
    public Condition f40257B;

    /* renamed from: z  reason: collision with root package name */
    public boolean f40258z;

    public RealmThreadPoolExecutor(int i2, int i3) {
        super(i2, i3, 0, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f40256A = reentrantLock;
        this.f40257B = reentrantLock.newCondition();
    }

    public static int a() {
        int b2 = b("/sys/devices/system/cpu/", "cpu[0-9]+");
        if (b2 <= 0) {
            b2 = Runtime.getRuntime().availableProcessors();
        }
        if (b2 <= 0) {
            return 1;
        }
        return 1 + (b2 * 2);
    }

    public static int b(String str, String str2) {
        final Pattern compile = Pattern.compile(str2);
        try {
            File[] listFiles = new File(str).listFiles(new FileFilter() {
                public boolean accept(File file) {
                    return compile.matcher(file.getName()).matches();
                }
            });
            if (listFiles == null) {
                return 0;
            }
            return listFiles.length;
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static RealmThreadPoolExecutor c() {
        int i2 = C;
        return new RealmThreadPoolExecutor(i2, i2);
    }

    public static RealmThreadPoolExecutor d() {
        return new RealmThreadPoolExecutor(1, 1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r0.f40256A.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1.interrupt();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void beforeExecute(java.lang.Thread r1, java.lang.Runnable r2) {
        /*
            r0 = this;
            super.beforeExecute(r1, r2)
            java.util.concurrent.locks.ReentrantLock r2 = r0.f40256A
            r2.lock()
        L_0x0008:
            boolean r2 = r0.f40258z     // Catch:{ InterruptedException -> 0x001a }
            if (r2 == 0) goto L_0x0014
            java.util.concurrent.locks.Condition r2 = r0.f40257B     // Catch:{ InterruptedException -> 0x001a }
            r2.await()     // Catch:{ InterruptedException -> 0x001a }
            goto L_0x0008
        L_0x0012:
            r1 = move-exception
            goto L_0x001f
        L_0x0014:
            java.util.concurrent.locks.ReentrantLock r1 = r0.f40256A
            r1.unlock()
            goto L_0x001e
        L_0x001a:
            r1.interrupt()     // Catch:{ all -> 0x0012 }
            goto L_0x0014
        L_0x001e:
            return
        L_0x001f:
            java.util.concurrent.locks.ReentrantLock r2 = r0.f40256A
            r2.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.async.RealmThreadPoolExecutor.beforeExecute(java.lang.Thread, java.lang.Runnable):void");
    }

    public Future e(Runnable runnable) {
        return super.submit(new BgPriorityRunnable(runnable));
    }
}
