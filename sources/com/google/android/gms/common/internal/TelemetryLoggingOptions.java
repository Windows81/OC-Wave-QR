package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;

public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {

    /* renamed from: A  reason: collision with root package name */
    public static final TelemetryLoggingOptions f24914A = a().a();

    /* renamed from: z  reason: collision with root package name */
    public final String f24915z;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f24916a;

        public /* synthetic */ Builder(zaac zaac) {
        }

        public TelemetryLoggingOptions a() {
            return new TelemetryLoggingOptions(this.f24916a, (zaad) null);
        }
    }

    public /* synthetic */ TelemetryLoggingOptions(String str, zaad zaad) {
        this.f24915z = str;
    }

    public static Builder a() {
        return new Builder((zaac) null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f24915z;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TelemetryLoggingOptions)) {
            return false;
        }
        return Objects.a(this.f24915z, ((TelemetryLoggingOptions) obj).f24915z);
    }

    public final int hashCode() {
        return Objects.b(this.f24915z);
    }
}
