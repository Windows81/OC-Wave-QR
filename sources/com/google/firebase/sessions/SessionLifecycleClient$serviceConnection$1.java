package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

@Metadata
public final class SessionLifecycleClient$serviceConnection$1 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionLifecycleClient f31564a;

    public SessionLifecycleClient$serviceConnection$1(SessionLifecycleClient sessionLifecycleClient) {
        this.f31564a = sessionLifecycleClient;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + this.f31564a.f31561d.size());
        this.f31564a.f31559b = new Messenger(iBinder);
        this.f31564a.f31560c = true;
        SessionLifecycleClient sessionLifecycleClient = this.f31564a;
        Job unused = sessionLifecycleClient.o(sessionLifecycleClient.j());
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
        this.f31564a.f31559b = null;
        this.f31564a.f31560c = false;
    }
}
