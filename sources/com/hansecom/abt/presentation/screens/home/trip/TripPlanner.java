package com.hansecom.abt.presentation.screens.home.trip;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface TripPlanner {

    @Metadata
    public interface Action {
    }

    @Metadata
    public interface Effect {
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final String f37499A;

        /* renamed from: z  reason: collision with root package name */
        public final String f37500z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, String str2) {
            Intrinsics.i(str, "appUrl");
            this.f37500z = str;
            this.f37499A = str2;
        }

        public final State a(String str, String str2) {
            Intrinsics.i(str, "appUrl");
            return new State(str, str2);
        }

        public final String b() {
            return this.f37499A;
        }

        public final String c() {
            return this.f37500z;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f37500z, state.f37500z) && Intrinsics.d(this.f37499A, state.f37499A);
        }

        public int hashCode() {
            int hashCode = this.f37500z.hashCode() * 31;
            String str = this.f37499A;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f37500z;
            String str2 = this.f37499A;
            return "State(appUrl=" + str + ", appFallbackUrl=" + str2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f37500z);
            parcel.writeString(this.f37499A);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2);
        }
    }
}
