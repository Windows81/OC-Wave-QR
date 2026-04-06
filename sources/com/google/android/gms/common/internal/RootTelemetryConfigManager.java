package com.google.android.gms.common.internal;

public final class RootTelemetryConfigManager {

    /* renamed from: b  reason: collision with root package name */
    public static RootTelemetryConfigManager f24904b;

    /* renamed from: c  reason: collision with root package name */
    public static final RootTelemetryConfiguration f24905c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public RootTelemetryConfiguration f24906a;

    public static synchronized RootTelemetryConfigManager b() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (RootTelemetryConfigManager.class) {
            try {
                if (f24904b == null) {
                    f24904b = new RootTelemetryConfigManager();
                }
                rootTelemetryConfigManager = f24904b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return rootTelemetryConfigManager;
    }

    public RootTelemetryConfiguration a() {
        return this.f24906a;
    }

    public final synchronized void c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f24906a = f24905c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f24906a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.f0() < rootTelemetryConfiguration.f0()) {
            this.f24906a = rootTelemetryConfiguration;
        }
    }
}
