package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public class AvailabilityException extends Exception {

    /* renamed from: z  reason: collision with root package name */
    public final ArrayMap f24416z;

    public AvailabilityException(ArrayMap arrayMap) {
        this.f24416z = arrayMap;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (ApiKey apiKey : this.f24416z.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.m((ConnectionResult) this.f24416z.get(apiKey));
            z2 &= !connectionResult.f0();
            arrayList.add(apiKey.b() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
