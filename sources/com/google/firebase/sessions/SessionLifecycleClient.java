package com.google.firebase.sessions;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class SessionLifecycleClient {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f31557f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f31558a;

    /* renamed from: b  reason: collision with root package name */
    public Messenger f31559b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f31560c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedBlockingDeque f31561d = new LinkedBlockingDeque(20);

    /* renamed from: e  reason: collision with root package name */
    public final SessionLifecycleClient$serviceConnection$1 f31562e = new SessionLifecycleClient$serviceConnection$1(this);

    @Metadata
    public static final class ClientUpdateHandler extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final CoroutineContext f31563a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(CoroutineContext coroutineContext) {
            super(Looper.getMainLooper());
            Intrinsics.i(coroutineContext, "backgroundDispatcher");
            this.f31563a = coroutineContext;
        }

        public final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            Job unused = BuildersKt__Builders_commonKt.d(CoroutineScopeKt.a(this.f31563a), (CoroutineContext) null, (CoroutineStart) null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(str, (Continuation) null), 3, (Object) null);
        }

        public void handleMessage(Message message) {
            String str;
            Intrinsics.i(message, "msg");
            if (message.what == 3) {
                Bundle data = message.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                a(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
            super.handleMessage(message);
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

    public SessionLifecycleClient(CoroutineContext coroutineContext) {
        Intrinsics.i(coroutineContext, "backgroundDispatcher");
        this.f31558a = coroutineContext;
    }

    public final void h() {
        n(2);
    }

    public final void i(SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        Intrinsics.i(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.a(new Messenger(new ClientUpdateHandler(this.f31558a)), this.f31562e);
    }

    public final List j() {
        ArrayList arrayList = new ArrayList();
        this.f31561d.drainTo(arrayList);
        return arrayList;
    }

    public final void k() {
        n(1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.os.Message} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Message l(java.util.List r7, int r8) {
        /*
            r6 = this;
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x000b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r7.next()
            r2 = r1
            android.os.Message r2 = (android.os.Message) r2
            int r2 = r2.what
            if (r2 != r8) goto L_0x000b
            r0.add(r1)
            goto L_0x000b
        L_0x0020:
            java.util.Iterator r7 = r0.iterator()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L_0x002c
            r7 = 0
            goto L_0x0057
        L_0x002c:
            java.lang.Object r8 = r7.next()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0038
        L_0x0036:
            r7 = r8
            goto L_0x0057
        L_0x0038:
            r0 = r8
            android.os.Message r0 = (android.os.Message) r0
            long r0 = r0.getWhen()
        L_0x003f:
            java.lang.Object r2 = r7.next()
            r3 = r2
            android.os.Message r3 = (android.os.Message) r3
            long r3 = r3.getWhen()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0050
            r8 = r2
            r0 = r3
        L_0x0050:
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L_0x003f
            goto L_0x0036
        L_0x0057:
            android.os.Message r7 = (android.os.Message) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionLifecycleClient.l(java.util.List, int):android.os.Message");
    }

    public final void m(Message message) {
        if (this.f31561d.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.f31561d.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    public final void n(int i2) {
        List j2 = j();
        Message obtain = Message.obtain((Handler) null, i2, 0, 0);
        Intrinsics.h(obtain, "obtain(null, messageCode, 0, 0)");
        j2.add(obtain);
        o(j2);
    }

    public final Job o(List list) {
        return BuildersKt__Builders_commonKt.d(CoroutineScopeKt.a(this.f31558a), (CoroutineContext) null, (CoroutineStart) null, new SessionLifecycleClient$sendLifecycleEvents$1(this, list, (Continuation) null), 3, (Object) null);
    }

    public final void p(Message message) {
        if (this.f31559b != null) {
            try {
                Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.f31559b;
                if (messenger != null) {
                    messenger.send(message);
                }
            } catch (RemoteException e2) {
                Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e2);
                m(message);
            }
        } else {
            m(message);
        }
    }
}
