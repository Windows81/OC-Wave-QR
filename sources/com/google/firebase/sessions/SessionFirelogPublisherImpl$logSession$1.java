package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {63, 64, 70}, m = "invokeSuspend")
public final class SessionFirelogPublisherImpl$logSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public int J;
    public final /* synthetic */ SessionFirelogPublisherImpl K;
    public final /* synthetic */ SessionDetails L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$logSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, SessionDetails sessionDetails, Continuation continuation) {
        super(2, continuation);
        this.K = sessionFirelogPublisherImpl;
        this.L = sessionDetails;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SessionFirelogPublisherImpl$logSession$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SessionFirelogPublisherImpl$logSession$1(this.K, this.L, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r10.J
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0045
            if (r1 == r4) goto L_0x0041
            if (r1 == r3) goto L_0x003d
            if (r1 != r2) goto L_0x0035
            java.lang.Object r0 = r10.I
            com.google.firebase.sessions.settings.SessionsSettings r0 = (com.google.firebase.sessions.settings.SessionsSettings) r0
            java.lang.Object r1 = r10.H
            com.google.firebase.sessions.SessionDetails r1 = (com.google.firebase.sessions.SessionDetails) r1
            java.lang.Object r2 = r10.G
            com.google.firebase.FirebaseApp r2 = (com.google.firebase.FirebaseApp) r2
            java.lang.Object r3 = r10.F
            com.google.firebase.sessions.SessionEvents r3 = (com.google.firebase.sessions.SessionEvents) r3
            java.lang.Object r4 = r10.E
            com.google.firebase.sessions.SessionFirelogPublisherImpl r4 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r4
            java.lang.Object r5 = r10.D
            com.google.firebase.sessions.InstallationId r5 = (com.google.firebase.sessions.InstallationId) r5
            kotlin.ResultKt.b(r11)
            r7 = r4
            r8 = r3
            r3 = r0
            r0 = r8
            r9 = r2
            r2 = r1
            r1 = r9
            goto L_0x009d
        L_0x0035:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x003d:
            kotlin.ResultKt.b(r11)
            goto L_0x006c
        L_0x0041:
            kotlin.ResultKt.b(r11)
            goto L_0x0053
        L_0x0045:
            kotlin.ResultKt.b(r11)
            com.google.firebase.sessions.SessionFirelogPublisherImpl r11 = r10.K
            r10.J = r4
            java.lang.Object r11 = r11.i(r10)
            if (r11 != r0) goto L_0x0053
            return r0
        L_0x0053:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00b0
            com.google.firebase.sessions.InstallationId$Companion r11 = com.google.firebase.sessions.InstallationId.f31494c
            com.google.firebase.sessions.SessionFirelogPublisherImpl r1 = r10.K
            com.google.firebase.installations.FirebaseInstallationsApi r1 = r1.f31540c
            r10.J = r3
            java.lang.Object r11 = r11.a(r1, r10)
            if (r11 != r0) goto L_0x006c
            return r0
        L_0x006c:
            r5 = r11
            com.google.firebase.sessions.InstallationId r5 = (com.google.firebase.sessions.InstallationId) r5
            com.google.firebase.sessions.SessionFirelogPublisherImpl r4 = r10.K
            com.google.firebase.sessions.SessionEvents r3 = com.google.firebase.sessions.SessionEvents.f31533a
            com.google.firebase.FirebaseApp r11 = r4.f31539b
            com.google.firebase.sessions.SessionDetails r1 = r10.L
            com.google.firebase.sessions.SessionFirelogPublisherImpl r6 = r10.K
            com.google.firebase.sessions.settings.SessionsSettings r6 = r6.f31541d
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r7 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f31578a
            r10.D = r5
            r10.E = r4
            r10.F = r3
            r10.G = r11
            r10.H = r1
            r10.I = r6
            r10.J = r2
            java.lang.Object r2 = r7.c(r10)
            if (r2 != r0) goto L_0x0096
            return r0
        L_0x0096:
            r0 = r3
            r7 = r4
            r3 = r6
            r8 = r1
            r1 = r11
            r11 = r2
            r2 = r8
        L_0x009d:
            r4 = r11
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r11 = r5.b()
            java.lang.String r6 = r5.a()
            r5 = r11
            com.google.firebase.sessions.SessionEvent r11 = r0.a(r1, r2, r3, r4, r5, r6)
            r7.g(r11)
        L_0x00b0:
            kotlin.Unit r11 = kotlin.Unit.f40552a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1.x(java.lang.Object):java.lang.Object");
    }
}
