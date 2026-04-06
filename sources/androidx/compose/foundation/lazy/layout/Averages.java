package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

@Metadata
final class Averages {

    /* renamed from: a  reason: collision with root package name */
    public long f4770a;

    /* renamed from: b  reason: collision with root package name */
    public long f4771b;

    public final long a(long j2, long j3) {
        if (j3 == 0) {
            return j2;
        }
        long j4 = (long) 4;
        return (j2 / j4) + ((j3 / j4) * ((long) 3));
    }

    public final Averages b() {
        Averages averages = new Averages();
        averages.f4770a = this.f4770a;
        averages.f4771b = this.f4771b;
        return averages;
    }

    public final long c() {
        return this.f4770a;
    }

    public final long d() {
        return this.f4771b;
    }

    public final void e(long j2) {
        this.f4770a = a(j2, this.f4770a);
    }

    public final void f(long j2) {
        this.f4771b = a(j2, this.f4771b);
    }
}
