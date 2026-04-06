package androidx.privacysandbox.ads.adservices.measurement;

import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DeletionRequest {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f22728g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f22729a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22730b;

    /* renamed from: c  reason: collision with root package name */
    public final Instant f22731c;

    /* renamed from: d  reason: collision with root package name */
    public final Instant f22732d;

    /* renamed from: e  reason: collision with root package name */
    public final List f22733e;

    /* renamed from: f  reason: collision with root package name */
    public final List f22734f;

    @Metadata
    public static final class Builder {
    }

    @Metadata
    public static final class Companion {

        @Metadata
        @Retention
        @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
        public @interface DeletionMode {
        }

        @Metadata
        @Retention
        @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
        public @interface MatchBehavior {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final int a() {
        return this.f22729a;
    }

    public final List b() {
        return this.f22733e;
    }

    public final Instant c() {
        return this.f22732d;
    }

    public final int d() {
        return this.f22730b;
    }

    public final List e() {
        return this.f22734f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) obj;
        return this.f22729a == deletionRequest.f22729a && Intrinsics.d(new HashSet(this.f22733e), new HashSet(deletionRequest.f22733e)) && Intrinsics.d(new HashSet(this.f22734f), new HashSet(deletionRequest.f22734f)) && Intrinsics.d(this.f22731c, deletionRequest.f22731c) && Intrinsics.d(this.f22732d, deletionRequest.f22732d) && this.f22730b == deletionRequest.f22730b;
    }

    public final Instant f() {
        return this.f22731c;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f22729a) * 31) + this.f22733e.hashCode()) * 31) + this.f22734f.hashCode()) * 31) + this.f22731c.hashCode()) * 31) + this.f22732d.hashCode()) * 31) + Integer.hashCode(this.f22730b);
    }

    public String toString() {
        String str = this.f22729a == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA";
        String str2 = this.f22730b == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE";
        return "DeletionRequest { DeletionMode=" + str + ", MatchBehavior=" + str2 + ", Start=" + this.f22731c + ", End=" + this.f22732d + ", DomainUris=" + this.f22733e + ", OriginUris=" + this.f22734f + " }";
    }
}
