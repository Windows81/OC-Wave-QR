package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f31537g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final double f31538h = Math.random();

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseApp f31539b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseInstallationsApi f31540c;

    /* renamed from: d  reason: collision with root package name */
    public final SessionsSettings f31541d;

    /* renamed from: e  reason: collision with root package name */
    public final EventGDTLoggerInterface f31542e;

    /* renamed from: f  reason: collision with root package name */
    public final CoroutineContext f31543f;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SessionFirelogPublisherImpl(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, SessionsSettings sessionsSettings, EventGDTLoggerInterface eventGDTLoggerInterface, CoroutineContext coroutineContext) {
        Intrinsics.i(firebaseApp, "firebaseApp");
        Intrinsics.i(firebaseInstallationsApi, "firebaseInstallations");
        Intrinsics.i(sessionsSettings, "sessionSettings");
        Intrinsics.i(eventGDTLoggerInterface, "eventGDTLogger");
        Intrinsics.i(coroutineContext, "backgroundDispatcher");
        this.f31539b = firebaseApp;
        this.f31540c = firebaseInstallationsApi;
        this.f31541d = sessionsSettings;
        this.f31542e = eventGDTLoggerInterface;
        this.f31543f = coroutineContext;
    }

    public void a(SessionDetails sessionDetails) {
        Intrinsics.i(sessionDetails, "sessionDetails");
        Job unused = BuildersKt__Builders_commonKt.d(CoroutineScopeKt.a(this.f31543f), (CoroutineContext) null, (CoroutineStart) null, new SessionFirelogPublisherImpl$logSession$1(this, sessionDetails, (Continuation) null), 3, (Object) null);
    }

    public final void g(SessionEvent sessionEvent) {
        try {
            this.f31542e.a(sessionEvent);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + sessionEvent.c().f());
        } catch (RuntimeException e2) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e2);
        }
    }

    public final boolean h() {
        return f31538h <= this.f31541d.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r0 = r0.C
            com.google.firebase.sessions.SessionFirelogPublisherImpl r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r0
            kotlin.ResultKt.b(r6)
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            kotlin.ResultKt.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            com.google.firebase.sessions.settings.SessionsSettings r6 = r5.f31541d
            r0.C = r5
            r0.F = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
        L_0x004d:
            com.google.firebase.sessions.settings.SessionsSettings r6 = r0.f31541d
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L_0x0060
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.a(r1)
            return r6
        L_0x0060:
            boolean r6 = r0.h()
            if (r6 != 0) goto L_0x0070
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.a(r1)
            return r6
        L_0x0070:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.i(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
