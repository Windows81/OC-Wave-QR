package com.hansecom.abt.data.preferences.base;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class Seconds {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f33366b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final long f33367a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Seconds a(long j2) {
            long j3 = (long) 60;
            return new Seconds(j2 * j3 * j3 * ((long) 24));
        }

        public final Seconds b(long j2) {
            long j3 = (long) 60;
            return new Seconds(j2 * j3 * j3);
        }

        public final Seconds c(long j2) {
            return new Seconds(j2 * ((long) 60));
        }

        public Companion() {
        }
    }

    public Seconds(long j2) {
        this.f33367a = j2;
    }

    public final long a() {
        return this.f33367a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Seconds) && this.f33367a == ((Seconds) obj).f33367a;
    }

    public int hashCode() {
        return Long.hashCode(this.f33367a);
    }

    public String toString() {
        long j2 = this.f33367a;
        return "Seconds(value=" + j2 + ")";
    }
}
