package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new Parcelable.Creator<PerfSession>() {
        /* renamed from: a */
        public PerfSession createFromParcel(Parcel parcel) {
            return new PerfSession(parcel);
        }

        /* renamed from: b */
        public PerfSession[] newArray(int i2) {
            return new PerfSession[i2];
        }
    };

    /* renamed from: A  reason: collision with root package name */
    public final Timer f31030A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f31031B;

    /* renamed from: z  reason: collision with root package name */
    public final String f31032z;

    public static com.google.firebase.perf.v1.PerfSession[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        com.google.firebase.perf.v1.PerfSession[] perfSessionArr = new com.google.firebase.perf.v1.PerfSession[list.size()];
        com.google.firebase.perf.v1.PerfSession a2 = ((PerfSession) list.get(0)).a();
        boolean z2 = false;
        for (int i2 = 1; i2 < list.size(); i2++) {
            com.google.firebase.perf.v1.PerfSession a3 = ((PerfSession) list.get(i2)).a();
            if (z2 || !((PerfSession) list.get(i2)).g()) {
                perfSessionArr[i2] = a3;
            } else {
                perfSessionArr[0] = a3;
                perfSessionArr[i2] = a2;
                z2 = true;
            }
        }
        if (!z2) {
            perfSessionArr[0] = a2;
        }
        return perfSessionArr;
    }

    public static PerfSession c(String str) {
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new Clock());
        perfSession.i(j());
        return perfSession;
    }

    public static boolean j() {
        ConfigResolver g2 = ConfigResolver.g();
        return g2.K() && Math.random() < g2.D();
    }

    public com.google.firebase.perf.v1.PerfSession a() {
        PerfSession.Builder P = com.google.firebase.perf.v1.PerfSession.l0().P(this.f31032z);
        if (this.f31031B) {
            P.O(SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (com.google.firebase.perf.v1.PerfSession) P.d();
    }

    public Timer d() {
        return this.f31030A;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f31031B;
    }

    public boolean f() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f31030A.c()) > ConfigResolver.g().A();
    }

    public boolean g() {
        return this.f31031B;
    }

    public String h() {
        return this.f31032z;
    }

    public void i(boolean z2) {
        this.f31031B = z2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f31032z);
        parcel.writeByte(this.f31031B ? (byte) 1 : 0);
        parcel.writeParcelable(this.f31030A, 0);
    }

    public PerfSession(String str, Clock clock) {
        this.f31031B = false;
        this.f31032z = str;
        this.f31030A = clock.a();
    }

    public PerfSession(Parcel parcel) {
        boolean z2 = false;
        this.f31031B = false;
        this.f31032z = parcel.readString();
        this.f31031B = parcel.readByte() != 0 ? true : z2;
        this.f31030A = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
