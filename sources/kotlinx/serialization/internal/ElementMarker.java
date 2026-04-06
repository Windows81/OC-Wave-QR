package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
@CoreFriendModuleApi
public final class ElementMarker {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f42106e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final long[] f42107f = new long[0];

    /* renamed from: a  reason: collision with root package name */
    public final SerialDescriptor f42108a;

    /* renamed from: b  reason: collision with root package name */
    public final Function2 f42109b;

    /* renamed from: c  reason: collision with root package name */
    public long f42110c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f42111d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ElementMarker(SerialDescriptor serialDescriptor, Function2 function2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(function2, "readIfAbsent");
        this.f42108a = serialDescriptor;
        this.f42109b = function2;
        int f2 = serialDescriptor.f();
        long j2 = 0;
        if (f2 <= 64) {
            this.f42110c = f2 != 64 ? -1 << f2 : j2;
            this.f42111d = f42107f;
            return;
        }
        this.f42110c = 0;
        this.f42111d = e(f2);
    }

    public final void a(int i2) {
        if (i2 < 64) {
            this.f42110c |= 1 << i2;
        } else {
            b(i2);
        }
    }

    public final void b(int i2) {
        int i3 = (i2 >>> 6) - 1;
        long[] jArr = this.f42111d;
        jArr[i3] = jArr[i3] | (1 << (i2 & 63));
    }

    public final int c() {
        int length = this.f42111d.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int i4 = i3 * 64;
            long j2 = this.f42111d[i2];
            while (j2 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                j2 |= 1 << numberOfTrailingZeros;
                int i5 = numberOfTrailingZeros + i4;
                if (((Boolean) this.f42109b.m(this.f42108a, Integer.valueOf(i5))).booleanValue()) {
                    this.f42111d[i2] = j2;
                    return i5;
                }
            }
            this.f42111d[i2] = j2;
            i2 = i3;
        }
        return -1;
    }

    public final int d() {
        int numberOfTrailingZeros;
        int f2 = this.f42108a.f();
        do {
            long j2 = this.f42110c;
            if (j2 != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                this.f42110c |= 1 << numberOfTrailingZeros;
            } else if (f2 > 64) {
                return c();
            } else {
                return -1;
            }
        } while (!((Boolean) this.f42109b.m(this.f42108a, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }

    public final long[] e(int i2) {
        long[] jArr = new long[((i2 - 1) >>> 6)];
        if ((i2 & 63) != 0) {
            jArr[ArraysKt.l0(jArr)] = -1 << i2;
        }
        return jArr;
    }
}
