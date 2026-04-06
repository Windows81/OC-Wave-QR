package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.ApplicationInfo;

public class FirebasePerfApplicationInfoValidator extends PerfMetricValidator {

    /* renamed from: b  reason: collision with root package name */
    public static final AndroidLogger f31000b = AndroidLogger.e();

    /* renamed from: a  reason: collision with root package name */
    public final ApplicationInfo f31001a;

    public FirebasePerfApplicationInfoValidator(ApplicationInfo applicationInfo) {
        this.f31001a = applicationInfo;
    }

    public boolean c() {
        if (g()) {
            return true;
        }
        f31000b.j("ApplicationInfo is invalid");
        return false;
    }

    public final boolean g() {
        ApplicationInfo applicationInfo = this.f31001a;
        if (applicationInfo == null) {
            f31000b.j("ApplicationInfo is null");
            return false;
        } else if (!applicationInfo.q0()) {
            f31000b.j("GoogleAppId is null");
            return false;
        } else if (!this.f31001a.o0()) {
            f31000b.j("AppInstanceId is null");
            return false;
        } else if (!this.f31001a.p0()) {
            f31000b.j("ApplicationProcessState is null");
            return false;
        } else if (!this.f31001a.n0()) {
            return true;
        } else {
            if (!this.f31001a.k0().j0()) {
                f31000b.j("AndroidAppInfo.packageName is null");
                return false;
            } else if (this.f31001a.k0().k0()) {
                return true;
            } else {
                f31000b.j("AndroidAppInfo.sdkVersion is null");
                return false;
            }
        }
    }
}
