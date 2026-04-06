package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.api.Endpoint;

final class zacd implements OnCompleteListener {

    /* renamed from: A  reason: collision with root package name */
    public final int f24686A;

    /* renamed from: B  reason: collision with root package name */
    public final ApiKey f24687B;
    public final long C;
    public final long D;

    /* renamed from: z  reason: collision with root package name */
    public final GoogleApiManager f24688z;

    public zacd(GoogleApiManager googleApiManager, int i2, ApiKey apiKey, long j2, long j3, String str, String str2) {
        this.f24688z = googleApiManager;
        this.f24686A = i2;
        this.f24687B = apiKey;
        this.C = j2;
        this.D = j3;
    }

    public static zacd b(GoogleApiManager googleApiManager, int i2, ApiKey apiKey) {
        boolean z2;
        if (!googleApiManager.d()) {
            return null;
        }
        RootTelemetryConfiguration a2 = RootTelemetryConfigManager.b().a();
        if (a2 == null) {
            z2 = true;
        } else if (!a2.S()) {
            return null;
        } else {
            z2 = a2.X();
            zabq s2 = googleApiManager.s(apiKey);
            if (s2 != null) {
                if (!(s2.t() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) s2.t();
                if (baseGmsClient.O() && !baseGmsClient.g()) {
                    ConnectionTelemetryConfiguration c2 = c(s2, baseGmsClient, i2);
                    if (c2 == null) {
                        return null;
                    }
                    s2.E();
                    z2 = c2.f0();
                }
            }
        }
        return new zacd(googleApiManager, i2, apiKey, z2 ? System.currentTimeMillis() : 0, z2 ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    public static ConnectionTelemetryConfiguration c(zabq zabq, BaseGmsClient baseGmsClient, int i2) {
        int[] Q;
        int[] S;
        ConnectionTelemetryConfiguration M = baseGmsClient.M();
        if (M == null || !M.X() || ((Q = M.Q()) != null ? !ArrayUtils.a(Q, i2) : !((S = M.S()) == null || !ArrayUtils.a(S, i2))) || zabq.q() >= M.H()) {
            return null;
        }
        return M;
    }

    public final void a(Task task) {
        zabq s2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2;
        long j3;
        if (this.f24688z.d()) {
            RootTelemetryConfiguration a2 = RootTelemetryConfigManager.b().a();
            if ((a2 == null || a2.S()) && (s2 = this.f24688z.s(this.f24687B)) != null && (s2.t() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) s2.t();
                boolean z2 = true;
                int i7 = 0;
                boolean z3 = this.C > 0;
                int E = baseGmsClient.E();
                int i8 = 100;
                if (a2 != null) {
                    boolean X = z3 & a2.X();
                    int H = a2.H();
                    int Q = a2.Q();
                    i4 = a2.f0();
                    if (baseGmsClient.O() && !baseGmsClient.g()) {
                        ConnectionTelemetryConfiguration c2 = c(s2, baseGmsClient, this.f24686A);
                        if (c2 != null) {
                            if (!c2.f0() || this.C <= 0) {
                                z2 = false;
                            }
                            Q = c2.H();
                            X = z2;
                        } else {
                            return;
                        }
                    }
                    i3 = H;
                    i2 = Q;
                } else {
                    i4 = 0;
                    i2 = 100;
                    i3 = 5000;
                }
                GoogleApiManager googleApiManager = this.f24688z;
                if (task.n()) {
                    i5 = 0;
                } else {
                    if (!task.l()) {
                        Exception j4 = task.j();
                        if (j4 instanceof ApiException) {
                            Status a3 = ((ApiException) j4).a();
                            i8 = a3.S();
                            ConnectionResult H2 = a3.H();
                            if (H2 != null) {
                                i5 = H2.H();
                                i7 = i8;
                            }
                        } else {
                            i7 = Endpoint.TARGET_FIELD_NUMBER;
                            i5 = -1;
                        }
                    }
                    i7 = i8;
                    i5 = -1;
                }
                if (z3) {
                    long j5 = this.C;
                    long j6 = this.D;
                    long currentTimeMillis = System.currentTimeMillis();
                    i6 = (int) (SystemClock.elapsedRealtime() - j6);
                    j2 = currentTimeMillis;
                    j3 = j5;
                } else {
                    j3 = 0;
                    j2 = 0;
                    i6 = -1;
                }
                googleApiManager.C(new MethodInvocation(this.f24686A, i7, i5, j3, j2, (String) null, (String) null, E, i6), i4, (long) i3, i2);
            }
        }
    }
}
