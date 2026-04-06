package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final KotlinVersion E = KotlinVersionCurrentValue.a();

    /* renamed from: A  reason: collision with root package name */
    public final int f40506A;

    /* renamed from: B  reason: collision with root package name */
    public final int f40507B;
    public final int C;

    /* renamed from: z  reason: collision with root package name */
    public final int f40508z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public KotlinVersion(int i2, int i3, int i4) {
        this.f40508z = i2;
        this.f40506A = i3;
        this.f40507B = i4;
        this.C = f(i2, i3, i4);
    }

    /* renamed from: d */
    public int compareTo(KotlinVersion kotlinVersion) {
        Intrinsics.i(kotlinVersion, "other");
        return this.C - kotlinVersion.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        if (kotlinVersion == null) {
            return false;
        }
        return this.C == kotlinVersion.C;
    }

    public final int f(int i2, int i3, int i4) {
        if (i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256 && i4 >= 0 && i4 < 256) {
            return (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    public int hashCode() {
        return this.C;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40508z);
        sb.append('.');
        sb.append(this.f40506A);
        sb.append('.');
        sb.append(this.f40507B);
        return sb.toString();
    }
}
