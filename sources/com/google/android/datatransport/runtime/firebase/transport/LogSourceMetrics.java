package com.google.android.datatransport.runtime.firebase.transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LogSourceMetrics {

    /* renamed from: c  reason: collision with root package name */
    public static final LogSourceMetrics f24130c = new Builder().a();

    /* renamed from: a  reason: collision with root package name */
    public final String f24131a;

    /* renamed from: b  reason: collision with root package name */
    public final List f24132b;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f24133a = "";

        /* renamed from: b  reason: collision with root package name */
        public List f24134b = new ArrayList();

        public LogSourceMetrics a() {
            return new LogSourceMetrics(this.f24133a, Collections.unmodifiableList(this.f24134b));
        }

        public Builder b(List list) {
            this.f24134b = list;
            return this;
        }

        public Builder c(String str) {
            this.f24133a = str;
            return this;
        }
    }

    public LogSourceMetrics(String str, List list) {
        this.f24131a = str;
        this.f24132b = list;
    }

    public static Builder c() {
        return new Builder();
    }

    public List a() {
        return this.f24132b;
    }

    public String b() {
        return this.f24131a;
    }
}
