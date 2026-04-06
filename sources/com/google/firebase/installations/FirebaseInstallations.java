package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class FirebaseInstallations implements FirebaseInstallationsApi {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f30777m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static final ThreadFactory f30778n = new ThreadFactory() {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f30791a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f30791a.getAndIncrement())}));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseApp f30779a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseInstallationServiceClient f30780b;

    /* renamed from: c  reason: collision with root package name */
    public final PersistedInstallation f30781c;

    /* renamed from: d  reason: collision with root package name */
    public final Utils f30782d;

    /* renamed from: e  reason: collision with root package name */
    public final Lazy f30783e;

    /* renamed from: f  reason: collision with root package name */
    public final RandomFidGenerator f30784f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f30785g;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f30786h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f30787i;

    /* renamed from: j  reason: collision with root package name */
    public String f30788j;

    /* renamed from: k  reason: collision with root package name */
    public Set f30789k;

    /* renamed from: l  reason: collision with root package name */
    public final List f30790l;

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$2  reason: invalid class name */
    class AnonymousClass2 implements FidListenerHandle {
    }

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30792a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f30793b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = com.google.firebase.installations.remote.TokenResult.ResponseCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30793b = r0
                r1 = 1
                com.google.firebase.installations.remote.TokenResult$ResponseCode r2 = com.google.firebase.installations.remote.TokenResult.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f30793b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f30793b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f30792a = r2
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r3 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f30792a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.FirebaseInstallations.AnonymousClass3.<clinit>():void");
        }
    }

    public FirebaseInstallations(FirebaseApp firebaseApp, Provider provider, ExecutorService executorService, Executor executor) {
        this(executorService, executor, firebaseApp, new FirebaseInstallationServiceClient(firebaseApp.k(), provider), new PersistedInstallation(firebaseApp), Utils.c(), new Lazy(new a(firebaseApp)), new RandomFidGenerator());
    }

    public static FirebaseInstallations q() {
        return r(FirebaseApp.l());
    }

    public static FirebaseInstallations r(FirebaseApp firebaseApp) {
        Preconditions.b(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations) firebaseApp.j(FirebaseInstallationsApi.class);
    }

    public static /* synthetic */ IidStore z(FirebaseApp firebaseApp) {
        return new IidStore(firebaseApp);
    }

    public final void A() {
        Preconditions.h(l(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.h(u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.h(k(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.b(Utils.h(l()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.b(Utils.g(k()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String B(PersistedInstallationEntry persistedInstallationEntry) {
        if ((!this.f30779a.m().equals("CHIME_ANDROID_SDK") && !this.f30779a.u()) || !persistedInstallationEntry.m()) {
            return this.f30784f.a();
        }
        String f2 = p().f();
        return TextUtils.isEmpty(f2) ? this.f30784f.a() : f2;
    }

    public final PersistedInstallationEntry C(PersistedInstallationEntry persistedInstallationEntry) {
        InstallationResponse d2 = this.f30780b.d(k(), persistedInstallationEntry.d(), u(), l(), (persistedInstallationEntry.d() == null || persistedInstallationEntry.d().length() != 11) ? null : p().i());
        int i2 = AnonymousClass3.f30792a[d2.e().ordinal()];
        if (i2 == 1) {
            return persistedInstallationEntry.s(d2.c(), d2.d(), this.f30782d.b(), d2.b().c(), d2.b().d());
        } else if (i2 == 2) {
            return persistedInstallationEntry.q("BAD CONFIG");
        } else {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    public final void D(Exception exc) {
        synchronized (this.f30785g) {
            try {
                Iterator it = this.f30790l.iterator();
                while (it.hasNext()) {
                    if (((StateListener) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public final void E(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.f30785g) {
            try {
                Iterator it = this.f30790l.iterator();
                while (it.hasNext()) {
                    if (((StateListener) it.next()).b(persistedInstallationEntry)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public final synchronized void F(String str) {
        this.f30788j = str;
    }

    public final synchronized void G(PersistedInstallationEntry persistedInstallationEntry, PersistedInstallationEntry persistedInstallationEntry2) {
        if (this.f30789k.size() != 0 && !TextUtils.equals(persistedInstallationEntry.d(), persistedInstallationEntry2.d())) {
            for (FidListener a2 : this.f30789k) {
                a2.a(persistedInstallationEntry2.d());
            }
        }
    }

    public final Task e() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g(new GetAuthTokenListener(this.f30782d, taskCompletionSource));
        return taskCompletionSource.a();
    }

    public final Task f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g(new GetIdListener(taskCompletionSource));
        return taskCompletionSource.a();
    }

    public final void g(StateListener stateListener) {
        synchronized (this.f30785g) {
            this.f30790l.add(stateListener);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r2.s()
            boolean r1 = r0.i()     // Catch:{ FirebaseInstallationsException -> 0x001d }
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0.l()     // Catch:{ FirebaseInstallationsException -> 0x001d }
            if (r1 == 0) goto L_0x0011
            goto L_0x0024
        L_0x0011:
            if (r3 != 0) goto L_0x001f
            com.google.firebase.installations.Utils r3 = r2.f30782d     // Catch:{ FirebaseInstallationsException -> 0x001d }
            boolean r3 = r3.f(r0)     // Catch:{ FirebaseInstallationsException -> 0x001d }
            if (r3 == 0) goto L_0x001c
            goto L_0x001f
        L_0x001c:
            return
        L_0x001d:
            r3 = move-exception
            goto L_0x0061
        L_0x001f:
            com.google.firebase.installations.local.PersistedInstallationEntry r3 = r2.j(r0)     // Catch:{ FirebaseInstallationsException -> 0x001d }
            goto L_0x0028
        L_0x0024:
            com.google.firebase.installations.local.PersistedInstallationEntry r3 = r2.C(r0)     // Catch:{ FirebaseInstallationsException -> 0x001d }
        L_0x0028:
            r2.v(r3)
            r2.G(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r3.d()
            r2.F(r0)
        L_0x003b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x004c
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r3.<init>(r0)
            r2.D(r3)
            goto L_0x0060
        L_0x004c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x005d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.D(r3)
            goto L_0x0060
        L_0x005d:
            r2.E(r3)
        L_0x0060:
            return
        L_0x0061:
            r2.D(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.FirebaseInstallations.w(boolean):void");
    }

    /* renamed from: i */
    public final void y(boolean z2) {
        PersistedInstallationEntry t2 = t();
        if (z2) {
            t2 = t2.p();
        }
        E(t2);
        this.f30787i.execute(new d(this, z2));
    }

    public final PersistedInstallationEntry j(PersistedInstallationEntry persistedInstallationEntry) {
        TokenResult e2 = this.f30780b.e(k(), persistedInstallationEntry.d(), u(), persistedInstallationEntry.f());
        int i2 = AnonymousClass3.f30793b[e2.b().ordinal()];
        if (i2 == 1) {
            return persistedInstallationEntry.o(e2.c(), e2.d(), this.f30782d.b());
        } else if (i2 == 2) {
            return persistedInstallationEntry.q("BAD CONFIG");
        } else {
            if (i2 == 3) {
                F((String) null);
                return persistedInstallationEntry.r();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    public String k() {
        return this.f30779a.n().b();
    }

    public String l() {
        return this.f30779a.n().c();
    }

    public Task m() {
        A();
        String o2 = o();
        if (o2 != null) {
            return Tasks.e(o2);
        }
        Task f2 = f();
        this.f30786h.execute(new b(this));
        return f2;
    }

    public Task n(boolean z2) {
        A();
        Task e2 = e();
        this.f30786h.execute(new c(this, z2));
        return e2;
    }

    public final synchronized String o() {
        return this.f30788j;
    }

    public final IidStore p() {
        return (IidStore) this.f30783e.get();
    }

    public final PersistedInstallationEntry s() {
        CrossProcessLock a2;
        PersistedInstallationEntry d2;
        synchronized (f30777m) {
            try {
                a2 = CrossProcessLock.a(this.f30779a.k(), "generatefid.lock");
                d2 = this.f30781c.d();
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d2;
    }

    public final PersistedInstallationEntry t() {
        CrossProcessLock a2;
        PersistedInstallationEntry d2;
        synchronized (f30777m) {
            try {
                a2 = CrossProcessLock.a(this.f30779a.k(), "generatefid.lock");
                d2 = this.f30781c.d();
                if (d2.j()) {
                    d2 = this.f30781c.b(d2.t(B(d2)));
                }
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d2;
    }

    public String u() {
        return this.f30779a.n().e();
    }

    public final void v(PersistedInstallationEntry persistedInstallationEntry) {
        CrossProcessLock a2;
        synchronized (f30777m) {
            try {
                a2 = CrossProcessLock.a(this.f30779a.k(), "generatefid.lock");
                this.f30781c.b(persistedInstallationEntry);
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void x() {
        y(false);
    }

    public FirebaseInstallations(ExecutorService executorService, Executor executor, FirebaseApp firebaseApp, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, Lazy lazy, RandomFidGenerator randomFidGenerator) {
        this.f30785g = new Object();
        this.f30789k = new HashSet();
        this.f30790l = new ArrayList();
        this.f30779a = firebaseApp;
        this.f30780b = firebaseInstallationServiceClient;
        this.f30781c = persistedInstallation;
        this.f30782d = utils;
        this.f30783e = lazy;
        this.f30784f = randomFidGenerator;
        this.f30786h = executorService;
        this.f30787i = executor;
    }
}
