package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SessionLifecycleServiceBinderImpl implements SessionLifecycleServiceBinder {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f31571b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseApp f31572a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SessionLifecycleServiceBinderImpl(FirebaseApp firebaseApp) {
        Intrinsics.i(firebaseApp, "firebaseApp");
        this.f31572a = firebaseApp;
    }

    public void a(Messenger messenger, ServiceConnection serviceConnection) {
        boolean z2;
        Intrinsics.i(messenger, "callback");
        Intrinsics.i(serviceConnection, "serviceConnection");
        Context applicationContext = this.f31572a.k().getApplicationContext();
        Intent intent = new Intent(applicationContext, SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        try {
            z2 = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e2) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e2);
            z2 = false;
        }
        if (!z2) {
            Intrinsics.h(applicationContext, "appContext");
            b(applicationContext, serviceConnection);
            Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
        }
    }

    public final Object b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return Unit.f40552a;
        } catch (IllegalArgumentException e2) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e2));
        }
    }
}
