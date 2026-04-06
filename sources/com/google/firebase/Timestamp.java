package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Timestamp implements Comparable<Timestamp>, Parcelable {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f29660B = new Companion((DefaultConstructorMarker) null);
    public static final Parcelable.Creator<Timestamp> CREATOR = new Timestamp$Companion$CREATOR$1();

    /* renamed from: A  reason: collision with root package name */
    public final int f29661A;

    /* renamed from: z  reason: collision with root package name */
    public final long f29662z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void b(long j2, int i2) {
            if (i2 < 0 || i2 >= 1000000000) {
                throw new IllegalArgumentException(("Timestamp nanoseconds out of range: " + i2).toString());
            } else if (-62135596800L > j2 || j2 >= 253402300800L) {
                throw new IllegalArgumentException(("Timestamp seconds out of range: " + j2).toString());
            }
        }

        public Companion() {
        }
    }

    public Timestamp(long j2, int i2) {
        f29660B.b(j2, i2);
        this.f29662z = j2;
        this.f29661A = i2;
    }

    /* renamed from: d */
    public int compareTo(Timestamp timestamp) {
        Intrinsics.i(timestamp, "other");
        return ComparisonsKt.e(this, timestamp, Timestamp$compareTo$1.H, Timestamp$compareTo$2.H);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0);
    }

    public final int f() {
        return this.f29661A;
    }

    public final long h() {
        return this.f29662z;
    }

    public int hashCode() {
        long j2 = this.f29662z;
        return (((((int) j2) * 1369) + ((int) (j2 >> 32))) * 37) + this.f29661A;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.f29662z + ", nanoseconds=" + this.f29661A + ')';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeLong(this.f29662z);
        parcel.writeInt(this.f29661A);
    }
}
