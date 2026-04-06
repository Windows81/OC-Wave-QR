package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class BlockingServiceConnection implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f24374a = false;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue f24375b = new LinkedBlockingQueue();

    public IBinder a(long j2, TimeUnit timeUnit) {
        Preconditions.l("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f24374a) {
            this.f24374a = true;
            IBinder iBinder = (IBinder) this.f24375b.poll(j2, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f24375b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
