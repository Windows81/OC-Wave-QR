package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class FirebaseSessions {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f31490c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseApp f31491a;

    /* renamed from: b  reason: collision with root package name */
    public final SessionsSettings f31492b;

    @Metadata
    @DebugMetadata(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {45, 49}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.FirebaseSessions$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public final /* synthetic */ FirebaseSessions E;

        {
            this.E = r1;
        }

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.E, coroutineContext, sessionLifecycleServiceBinder, continuation);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.D
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0020
                if (r1 == r4) goto L_0x001c
                if (r1 != r3) goto L_0x0014
                kotlin.ResultKt.b(r6)
                goto L_0x0069
            L_0x0014:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001c:
                kotlin.ResultKt.b(r6)
                goto L_0x002e
            L_0x0020:
                kotlin.ResultKt.b(r6)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r6 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f31578a
                r5.D = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L_0x002e
                return r0
            L_0x002e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L_0x0044
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x0044
                goto L_0x009b
            L_0x0044:
                java.util.Iterator r6 = r6.iterator()
            L_0x0048:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L_0x009b
                java.lang.Object r1 = r6.next()
                com.google.firebase.sessions.api.SessionSubscriber r1 = (com.google.firebase.sessions.api.SessionSubscriber) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L_0x0048
                com.google.firebase.sessions.FirebaseSessions r6 = r5.E
                com.google.firebase.sessions.settings.SessionsSettings r6 = r6.f31492b
                r5.D = r3
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L_0x0069
                return r0
            L_0x0069:
                com.google.firebase.sessions.FirebaseSessions r6 = r5.E
                com.google.firebase.sessions.settings.SessionsSettings r6 = r6.f31492b
                boolean r6 = r6.d()
                if (r6 != 0) goto L_0x007b
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto L_0x00a0
            L_0x007b:
                com.google.firebase.sessions.SessionLifecycleClient r6 = new com.google.firebase.sessions.SessionLifecycleClient
                kotlin.coroutines.CoroutineContext r0 = r9
                r6.<init>(r0)
                com.google.firebase.sessions.SessionLifecycleServiceBinder r0 = r10
                r6.i(r0)
                com.google.firebase.sessions.SessionsActivityLifecycleCallbacks r0 = com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.f31575z
                r0.a(r6)
                com.google.firebase.sessions.FirebaseSessions r6 = r5.E
                com.google.firebase.FirebaseApp r6 = r6.f31491a
                com.google.firebase.sessions.b r0 = new com.google.firebase.sessions.b
                r0.<init>()
                r6.h(r0)
                goto L_0x00a0
            L_0x009b:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
            L_0x00a0:
                kotlin.Unit r6 = kotlin.Unit.f40552a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessions.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public FirebaseSessions(FirebaseApp firebaseApp, SessionsSettings sessionsSettings, final CoroutineContext coroutineContext, final SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        Intrinsics.i(firebaseApp, "firebaseApp");
        Intrinsics.i(sessionsSettings, "settings");
        Intrinsics.i(coroutineContext, "backgroundDispatcher");
        Intrinsics.i(sessionLifecycleServiceBinder, "lifecycleServiceBinder");
        this.f31491a = firebaseApp;
        this.f31492b = sessionsSettings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = firebaseApp.k().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(SessionsActivityLifecycleCallbacks.f31575z);
            Job unused = BuildersKt__Builders_commonKt.d(CoroutineScopeKt.a(coroutineContext), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, (Continuation) null), 3, (Object) null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
