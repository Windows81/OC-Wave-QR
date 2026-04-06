package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {
    public static final Object G = new Object();
    public static final HashMap H = new HashMap();

    /* renamed from: A  reason: collision with root package name */
    public WorkEnqueuer f19496A;

    /* renamed from: B  reason: collision with root package name */
    public CommandProcessor f19497B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final ArrayList F;

    /* renamed from: z  reason: collision with root package name */
    public CompatJobEngine f19498z;

    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public CommandProcessor() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                GenericWorkItem a2 = JobIntentService.this.a();
                if (a2 == null) {
                    return null;
                }
                JobIntentService.this.d(a2.getIntent());
                a2.a();
            }
        }

        /* renamed from: b */
        public void onCancelled(Void voidR) {
            JobIntentService.this.f();
        }

        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.f();
        }
    }

    public interface CompatJobEngine {
        IBinder a();

        GenericWorkItem b();
    }

    public static final class CompatWorkEnqueuer extends WorkEnqueuer {

        /* renamed from: a  reason: collision with root package name */
        public final PowerManager.WakeLock f19500a;

        /* renamed from: b  reason: collision with root package name */
        public final PowerManager.WakeLock f19501b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f19502c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f19503d;

        public void a() {
            synchronized (this) {
                try {
                    if (this.f19503d) {
                        if (this.f19502c) {
                            this.f19500a.acquire(60000);
                        }
                        this.f19503d = false;
                        this.f19501b.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b() {
            synchronized (this) {
                try {
                    if (!this.f19503d) {
                        this.f19503d = true;
                        this.f19501b.acquire(600000);
                        this.f19500a.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void c() {
            synchronized (this) {
                this.f19502c = false;
            }
        }
    }

    public final class CompatWorkItem implements GenericWorkItem {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f19504a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19505b;

        public CompatWorkItem(Intent intent, int i2) {
            this.f19504a = intent;
            this.f19505b = i2;
        }

        public void a() {
            JobIntentService.this.stopSelf(this.f19505b);
        }

        public Intent getIntent() {
            return this.f19504a;
        }
    }

    public interface GenericWorkItem {
        void a();

        Intent getIntent();
    }

    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {

        /* renamed from: a  reason: collision with root package name */
        public final JobIntentService f19507a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f19508b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public JobParameters f19509c;

        public final class WrapperWorkItem implements GenericWorkItem {

            /* renamed from: a  reason: collision with root package name */
            public final JobWorkItem f19510a;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.f19510a = jobWorkItem;
            }

            public void a() {
                synchronized (JobServiceEngineImpl.this.f19508b) {
                    try {
                        JobParameters jobParameters = JobServiceEngineImpl.this.f19509c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f19510a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            public Intent getIntent() {
                return this.f19510a.getIntent();
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f19507a = jobIntentService;
        }

        public IBinder a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f19507a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
            return new androidx.core.app.JobIntentService.JobServiceEngineImpl.WrapperWorkItem(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.GenericWorkItem b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f19508b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f19509c     // Catch:{ all -> 0x000a }
                r2 = 0
                if (r1 != 0) goto L_0x000c
                monitor-exit(r0)     // Catch:{ all -> 0x000a }
                return r2
            L_0x000a:
                r1 = move-exception
                goto L_0x0027
            L_0x000c:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x000a }
                monitor-exit(r0)     // Catch:{ all -> 0x000a }
                if (r1 == 0) goto L_0x0026
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f19507a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$JobServiceEngineImpl$WrapperWorkItem r0 = new androidx.core.app.JobIntentService$JobServiceEngineImpl$WrapperWorkItem
                r0.<init>(r1)
                return r0
            L_0x0026:
                return r2
            L_0x0027:
                monitor-exit(r0)     // Catch:{ all -> 0x000a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.JobServiceEngineImpl.b():androidx.core.app.JobIntentService$GenericWorkItem");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f19509c = jobParameters;
            this.f19507a.c(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b2 = this.f19507a.b();
            synchronized (this.f19508b) {
                this.f19509c = null;
            }
            return b2;
        }
    }

    public static final class JobWorkEnqueuer extends WorkEnqueuer {
    }

    public static abstract class WorkEnqueuer {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public GenericWorkItem a() {
        CompatJobEngine compatJobEngine = this.f19498z;
        if (compatJobEngine != null) {
            return compatJobEngine.b();
        }
        synchronized (this.F) {
            try {
                if (this.F.size() <= 0) {
                    return null;
                }
                GenericWorkItem genericWorkItem = (GenericWorkItem) this.F.remove(0);
                return genericWorkItem;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        CommandProcessor commandProcessor = this.f19497B;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.C);
        }
        this.D = true;
        return e();
    }

    public void c(boolean z2) {
        if (this.f19497B == null) {
            this.f19497B = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.f19496A;
            if (workEnqueuer != null && z2) {
                workEnqueuer.b();
            }
            this.f19497B.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void d(Intent intent);

    public boolean e() {
        return true;
    }

    public void f() {
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f19497B = null;
                    ArrayList arrayList2 = this.F;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        c(false);
                    } else if (!this.E) {
                        this.f19496A.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        CompatJobEngine compatJobEngine = this.f19498z;
        if (compatJobEngine != null) {
            return compatJobEngine.a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f19498z = new JobServiceEngineImpl(this);
        this.f19496A = null;
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.E = true;
                this.f19496A.a();
            }
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        if (this.F == null) {
            return 2;
        }
        this.f19496A.c();
        synchronized (this.F) {
            ArrayList arrayList = this.F;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i3));
            c(true);
        }
        return 3;
    }
}
