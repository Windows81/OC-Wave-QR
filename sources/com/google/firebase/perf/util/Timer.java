package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new Parcelable.Creator<Timer>() {
        /* renamed from: a */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel);
        }

        /* renamed from: b */
        public Timer[] newArray(int i2) {
            return new Timer[i2];
        }
    };

    /* renamed from: A  reason: collision with root package name */
    public long f31134A;

    /* renamed from: z  reason: collision with root package name */
    public long f31135z;

    public static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static Timer f(long j2) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j2);
        return new Timer(h() + (micros - a()), micros);
    }

    public static long h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public long b() {
        return this.f31135z + c();
    }

    public long c() {
        return d(new Timer());
    }

    public long d(Timer timer) {
        return timer.f31134A - this.f31134A;
    }

    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f31135z;
    }

    public void g() {
        this.f31135z = h();
        this.f31134A = a();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f31135z);
        parcel.writeLong(this.f31134A);
    }

    public Timer() {
        this(h(), a());
    }

    public Timer(long j2, long j3) {
        this.f31135z = j2;
        this.f31134A = j3;
    }

    public Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
