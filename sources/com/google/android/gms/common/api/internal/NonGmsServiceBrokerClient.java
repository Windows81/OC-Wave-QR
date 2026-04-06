package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

public final class NonGmsServiceBrokerClient implements Api.Client, ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final String f24508a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24509b;

    /* renamed from: c  reason: collision with root package name */
    public final ComponentName f24510c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f24511d;

    /* renamed from: e  reason: collision with root package name */
    public final ConnectionCallbacks f24512e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f24513f;

    /* renamed from: g  reason: collision with root package name */
    public final OnConnectionFailedListener f24514g;

    /* renamed from: h  reason: collision with root package name */
    public IBinder f24515h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f24516i;

    /* renamed from: j  reason: collision with root package name */
    public String f24517j;

    /* renamed from: k  reason: collision with root package name */
    public String f24518k;

    public final boolean a() {
        x();
        return this.f24515h != null;
    }

    public final boolean c() {
        return false;
    }

    public final Set d() {
        return Collections.emptySet();
    }

    public final void e(IAccountAccessor iAccountAccessor, Set set) {
    }

    public final void f(String str) {
        x();
        this.f24517j = str;
        j();
    }

    public final boolean g() {
        x();
        return this.f24516i;
    }

    public final String h() {
        String str = this.f24508a;
        if (str != null) {
            return str;
        }
        Preconditions.m(this.f24510c);
        return this.f24510c.getPackageName();
    }

    public final void i(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        x();
        String.valueOf(this.f24515h);
        if (a()) {
            try {
                f("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f24510c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f24508a).setAction(this.f24509b);
            }
            boolean bindService = this.f24511d.bindService(intent, this, GmsClientSupervisor.a());
            this.f24516i = bindService;
            if (!bindService) {
                this.f24515h = null;
                this.f24514g.N(new ConnectionResult(16));
            }
            String.valueOf(this.f24515h);
        } catch (SecurityException e2) {
            this.f24516i = false;
            this.f24515h = null;
            throw e2;
        }
    }

    public final void j() {
        x();
        String.valueOf(this.f24515h);
        try {
            this.f24511d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f24516i = false;
        this.f24515h = null;
    }

    public final void k(BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    public final void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final boolean m() {
        return false;
    }

    public final int o() {
        return 0;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f24513f.post(new zacg(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f24513f.post(new zacf(this));
    }

    public final Feature[] p() {
        return new Feature[0];
    }

    public final String r() {
        return this.f24517j;
    }

    public final Intent s() {
        return new Intent();
    }

    public final boolean t() {
        return false;
    }

    public final /* synthetic */ void u() {
        this.f24516i = false;
        this.f24515h = null;
        this.f24512e.J(1);
    }

    public final /* synthetic */ void v(IBinder iBinder) {
        this.f24516i = false;
        this.f24515h = iBinder;
        String.valueOf(iBinder);
        this.f24512e.P(new Bundle());
    }

    public final void w(String str) {
        this.f24518k = str;
    }

    public final void x() {
        if (Thread.currentThread() != this.f24513f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }
}
