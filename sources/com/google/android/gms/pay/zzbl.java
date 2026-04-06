package com.google.android.gms.pay;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.pay.zzab;

final class zzbl extends Api.AbstractClientBuilder {
    public final /* synthetic */ Api.Client c(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Api.ApiOptions.NotRequiredOptions notRequiredOptions = (Api.ApiOptions.NotRequiredOptions) obj;
        return new zzab(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
