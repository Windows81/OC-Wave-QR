package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

public class BaseImplementation {

    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {

        /* renamed from: q  reason: collision with root package name */
        public final Api.AnyClientKey f24459q;

        /* renamed from: r  reason: collision with root package name */
        public final Api f24460r;

        public ApiMethodImpl(Api api, GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.n(googleApiClient, "GoogleApiClient must not be null"));
            Preconditions.n(api, "Api must not be null");
            this.f24459q = api.b();
            this.f24460r = api;
        }

        public /* bridge */ /* synthetic */ void a(Object obj) {
            super.j((Result) obj);
        }

        public abstract void r(Api.AnyClient anyClient);

        public final Api s() {
            return this.f24460r;
        }

        public final Api.AnyClientKey t() {
            return this.f24459q;
        }

        public void u(Result result) {
        }

        public final void v(Api.AnyClient anyClient) {
            try {
                r(anyClient);
            } catch (DeadObjectException e2) {
                w(e2);
                throw e2;
            } catch (RemoteException e3) {
                w(e3);
            }
        }

        public final void w(RemoteException remoteException) {
            x(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        public final void x(Status status) {
            Preconditions.b(!status.o0(), "Failed result must not be success");
            Result f2 = f(status);
            j(f2);
            u(f2);
        }
    }

    public interface ResultHolder<R> {
        void a(Object obj);
    }
}
