package com.google.android.gms.identity.intents;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.identity.intents.Address;
import com.google.android.gms.internal.identity.zze;

final class zza extends Api.AbstractClientBuilder<zze, Address.AddressOptions> {
    public final /* bridge */ /* synthetic */ Api.Client b(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Address.AddressOptions addressOptions = (Address.AddressOptions) obj;
        Preconditions.b(context instanceof Activity, "An Activity must be used for Address APIs");
        if (addressOptions == null) {
            addressOptions = new Address.AddressOptions();
        }
        return new zze((Activity) context, looper, clientSettings, addressOptions.f25247z, connectionCallbacks, onConnectionFailedListener);
    }
}
