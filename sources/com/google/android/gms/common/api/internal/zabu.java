package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

final class zabu implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {

    /* renamed from: a  reason: collision with root package name */
    public final Api.Client f24675a;

    /* renamed from: b  reason: collision with root package name */
    public final ApiKey f24676b;

    /* renamed from: c  reason: collision with root package name */
    public IAccountAccessor f24677c = null;

    /* renamed from: d  reason: collision with root package name */
    public Set f24678d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f24679e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f24680f;

    public zabu(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        this.f24680f = googleApiManager;
        this.f24675a = client;
        this.f24676b = apiKey;
    }

    public final void a(ConnectionResult connectionResult) {
        this.f24680f.f24497n.post(new zabt(this, connectionResult));
    }

    public final void b(ConnectionResult connectionResult) {
        zabq zabq = (zabq) this.f24680f.f24493j.get(this.f24676b);
        if (zabq != null) {
            zabq.G(connectionResult);
        }
    }

    public final void c(IAccountAccessor iAccountAccessor, Set set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new ConnectionResult(4));
            return;
        }
        this.f24677c = iAccountAccessor;
        this.f24678d = set;
        i();
    }

    public final void d(int i2) {
        zabq zabq = (zabq) this.f24680f.f24493j.get(this.f24676b);
        if (zabq == null) {
            return;
        }
        if (zabq.f24666t) {
            zabq.G(new ConnectionResult(17));
        } else {
            zabq.J(i2);
        }
    }

    public final void i() {
        IAccountAccessor iAccountAccessor;
        if (this.f24679e && (iAccountAccessor = this.f24677c) != null) {
            this.f24675a.e(iAccountAccessor, this.f24678d);
        }
    }
}
