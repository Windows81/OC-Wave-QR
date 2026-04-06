package okio.internal;

import kotlin.Metadata;

@Metadata
final class EocdRecord {

    /* renamed from: a  reason: collision with root package name */
    public final long f43476a;

    /* renamed from: b  reason: collision with root package name */
    public final long f43477b;

    /* renamed from: c  reason: collision with root package name */
    public final int f43478c;

    public EocdRecord(long j2, long j3, int i2) {
        this.f43476a = j2;
        this.f43477b = j3;
        this.f43478c = i2;
    }

    public final long a() {
        return this.f43477b;
    }

    public final int b() {
        return this.f43478c;
    }

    public final long c() {
        return this.f43476a;
    }
}
