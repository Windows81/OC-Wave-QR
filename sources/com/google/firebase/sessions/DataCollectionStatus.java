package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DataCollectionStatus {

    /* renamed from: a  reason: collision with root package name */
    public final DataCollectionState f31482a;

    /* renamed from: b  reason: collision with root package name */
    public final DataCollectionState f31483b;

    /* renamed from: c  reason: collision with root package name */
    public final double f31484c;

    public DataCollectionStatus(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d2) {
        Intrinsics.i(dataCollectionState, "performance");
        Intrinsics.i(dataCollectionState2, "crashlytics");
        this.f31482a = dataCollectionState;
        this.f31483b = dataCollectionState2;
        this.f31484c = d2;
    }

    public final DataCollectionState a() {
        return this.f31483b;
    }

    public final DataCollectionState b() {
        return this.f31482a;
    }

    public final double c() {
        return this.f31484c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCollectionStatus)) {
            return false;
        }
        DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
        return this.f31482a == dataCollectionStatus.f31482a && this.f31483b == dataCollectionStatus.f31483b && Double.compare(this.f31484c, dataCollectionStatus.f31484c) == 0;
    }

    public int hashCode() {
        return (((this.f31482a.hashCode() * 31) + this.f31483b.hashCode()) * 31) + Double.hashCode(this.f31484c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f31482a + ", crashlytics=" + this.f31483b + ", sessionSamplingRate=" + this.f31484c + ')';
    }
}
