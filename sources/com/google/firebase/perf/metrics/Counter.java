package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new Parcelable.Creator<Counter>() {
        /* renamed from: a */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel);
        }

        /* renamed from: b */
        public Counter[] newArray(int i2) {
            return new Counter[i2];
        }
    };

    /* renamed from: A  reason: collision with root package name */
    public final AtomicLong f30981A;

    /* renamed from: z  reason: collision with root package name */
    public final String f30982z;

    public long a() {
        return this.f30981A.get();
    }

    public String b() {
        return this.f30982z;
    }

    public void c(long j2) {
        this.f30981A.addAndGet(j2);
    }

    public void d(long j2) {
        this.f30981A.set(j2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f30982z);
        parcel.writeLong(this.f30981A.get());
    }

    public Counter(String str) {
        this.f30982z = str;
        this.f30981A = new AtomicLong(0);
    }

    public Counter(Parcel parcel) {
        this.f30982z = parcel.readString();
        this.f30981A = new AtomicLong(parcel.readLong());
    }
}
