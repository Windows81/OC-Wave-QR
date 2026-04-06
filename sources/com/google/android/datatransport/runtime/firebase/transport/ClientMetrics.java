package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ClientMetrics {

    /* renamed from: e  reason: collision with root package name */
    public static final ClientMetrics f24110e = new Builder().b();

    /* renamed from: a  reason: collision with root package name */
    public final TimeWindow f24111a;

    /* renamed from: b  reason: collision with root package name */
    public final List f24112b;

    /* renamed from: c  reason: collision with root package name */
    public final GlobalMetrics f24113c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24114d;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public TimeWindow f24115a = null;

        /* renamed from: b  reason: collision with root package name */
        public List f24116b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public GlobalMetrics f24117c = null;

        /* renamed from: d  reason: collision with root package name */
        public String f24118d = "";

        public Builder a(LogSourceMetrics logSourceMetrics) {
            this.f24116b.add(logSourceMetrics);
            return this;
        }

        public ClientMetrics b() {
            return new ClientMetrics(this.f24115a, Collections.unmodifiableList(this.f24116b), this.f24117c, this.f24118d);
        }

        public Builder c(String str) {
            this.f24118d = str;
            return this;
        }

        public Builder d(GlobalMetrics globalMetrics) {
            this.f24117c = globalMetrics;
            return this;
        }

        public Builder e(TimeWindow timeWindow) {
            this.f24115a = timeWindow;
            return this;
        }
    }

    public ClientMetrics(TimeWindow timeWindow, List list, GlobalMetrics globalMetrics, String str) {
        this.f24111a = timeWindow;
        this.f24112b = list;
        this.f24113c = globalMetrics;
        this.f24114d = str;
    }

    public static Builder e() {
        return new Builder();
    }

    public String a() {
        return this.f24114d;
    }

    public GlobalMetrics b() {
        return this.f24113c;
    }

    public List c() {
        return this.f24112b;
    }

    public TimeWindow d() {
        return this.f24111a;
    }

    public byte[] f() {
        return ProtoEncoderDoNotUse.a(this);
    }
}
