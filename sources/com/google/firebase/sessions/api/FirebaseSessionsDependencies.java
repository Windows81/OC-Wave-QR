package com.google.firebase.sessions.api;

import android.util.Log;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public final class FirebaseSessionsDependencies {

    /* renamed from: a  reason: collision with root package name */
    public static final FirebaseSessionsDependencies f31578a = new FirebaseSessionsDependencies();

    /* renamed from: b  reason: collision with root package name */
    public static final Map f31579b = Collections.synchronizedMap(new LinkedHashMap());

    @Metadata
    public static final class Dependency {

        /* renamed from: a  reason: collision with root package name */
        public final Mutex f31580a;

        /* renamed from: b  reason: collision with root package name */
        public SessionSubscriber f31581b;

        public Dependency(Mutex mutex, SessionSubscriber sessionSubscriber) {
            Intrinsics.i(mutex, "mutex");
            this.f31580a = mutex;
            this.f31581b = sessionSubscriber;
        }

        public final Mutex a() {
            return this.f31580a;
        }

        public final SessionSubscriber b() {
            return this.f31581b;
        }

        public final void c(SessionSubscriber sessionSubscriber) {
            this.f31581b = sessionSubscriber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) obj;
            return Intrinsics.d(this.f31580a, dependency.f31580a) && Intrinsics.d(this.f31581b, dependency.f31581b);
        }

        public int hashCode() {
            int hashCode = this.f31580a.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.f31581b;
            return hashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f31580a + ", subscriber=" + this.f31581b + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Dependency(Mutex mutex, SessionSubscriber sessionSubscriber, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(mutex, (i2 & 2) != 0 ? null : sessionSubscriber);
        }
    }

    public static final void a(SessionSubscriber.Name name) {
        Intrinsics.i(name, "subscriberName");
        if (name != SessionSubscriber.Name.PERFORMANCE) {
            Map map = f31579b;
            if (map.containsKey(name)) {
                Log.d("SessionsDependencies", "Dependency " + name + " already added.");
                return;
            }
            Intrinsics.h(map, "dependencies");
            map.put(name, new Dependency(MutexKt.a(true), (SessionSubscriber) null, 2, (DefaultConstructorMarker) null));
            Log.d("SessionsDependencies", "Dependency to " + name + " added.");
            return;
        }
        throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
    }

    public static final void e(SessionSubscriber sessionSubscriber) {
        Intrinsics.i(sessionSubscriber, "subscriber");
        SessionSubscriber.Name b2 = sessionSubscriber.b();
        Dependency b3 = f31578a.b(b2);
        if (b3.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + b2 + " already registered.");
            return;
        }
        b3.c(sessionSubscriber);
        Log.d("SessionsDependencies", "Subscriber " + b2 + " registered.");
        Mutex.DefaultImpls.c(b3.a(), (Object) null, 1, (Object) null);
    }

    public final Dependency b(SessionSubscriber.Name name) {
        Map map = f31579b;
        Intrinsics.h(map, "dependencies");
        Object obj = map.get(name);
        if (obj != null) {
            Intrinsics.h(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (Dependency) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + name + ". Dependencies should be added at class load time.");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.firebase.sessions.api.SessionSubscriber$Name} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.K = r1
            goto L_0x0018
        L_0x0013:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.K
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r2 = r0.H
            java.lang.Object r5 = r0.G
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.F
            kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
            java.lang.Object r7 = r0.E
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r8 = r0.D
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.C
            java.util.Map r9 = (java.util.Map) r9
            kotlin.ResultKt.b(r11)
            goto L_0x00a2
        L_0x0040:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0048:
            kotlin.ResultKt.b(r11)
            java.util.Map r11 = f31579b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.h(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.MapsKt.e(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L_0x006b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x00b5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r11 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r11
            kotlinx.coroutines.sync.Mutex r6 = r11.a()
            r0.C = r5
            r0.D = r8
            r0.E = r7
            r0.F = r6
            r0.G = r5
            r0.H = r2
            r0.K = r3
            java.lang.Object r11 = r6.d(r4, r0)
            if (r11 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r9 = r5
        L_0x00a2:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r11 = f31578a     // Catch:{ all -> 0x00b0 }
            com.google.firebase.sessions.api.SessionSubscriber r11 = r11.d(r7)     // Catch:{ all -> 0x00b0 }
            r6.e(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L_0x006b
        L_0x00b0:
            r11 = move-exception
            r6.e(r4)
            throw r11
        L_0x00b5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final SessionSubscriber d(SessionSubscriber.Name name) {
        Intrinsics.i(name, "subscriberName");
        SessionSubscriber b2 = b(name).b();
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("Subscriber " + name + " has not been registered.");
    }
}
