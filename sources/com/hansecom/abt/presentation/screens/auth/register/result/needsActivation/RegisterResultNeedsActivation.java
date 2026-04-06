package com.hansecom.abt.presentation.screens.auth.register.result.needsActivation;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface RegisterResultNeedsActivation {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Resend implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Resend f34548a = new Resend();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Resend);
            }

            public int hashCode() {
                return -2096885654;
            }

            public String toString() {
                return "Resend";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f34549a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f34549a = stringValue;
            }

            public final StringValue a() {
                return this.f34549a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f34549a, ((Error) obj).f34549a);
            }

            public int hashCode() {
                return this.f34549a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f34549a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f34550a;

            public Success(String str) {
                Intrinsics.i(str, "email");
                this.f34550a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.d(this.f34550a, ((Success) obj).f34550a);
            }

            public int hashCode() {
                return this.f34550a.hashCode();
            }

            public String toString() {
                String str = this.f34550a;
                return "Success(email=" + str + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final boolean f34551A;

        /* renamed from: z  reason: collision with root package name */
        public final String f34552z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readString(), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, boolean z2) {
            Intrinsics.i(str, "email");
            this.f34552z = str;
            this.f34551A = z2;
        }

        public static /* synthetic */ State b(State state, String str, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = state.f34552z;
            }
            if ((i2 & 2) != 0) {
                z2 = state.f34551A;
            }
            return state.a(str, z2);
        }

        public final State a(String str, boolean z2) {
            Intrinsics.i(str, "email");
            return new State(str, z2);
        }

        public final String c() {
            return this.f34552z;
        }

        public final boolean d() {
            return this.f34551A;
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
            return Intrinsics.d(this.f34552z, state.f34552z) && this.f34551A == state.f34551A;
        }

        public int hashCode() {
            return (this.f34552z.hashCode() * 31) + Boolean.hashCode(this.f34551A);
        }

        public String toString() {
            String str = this.f34552z;
            boolean z2 = this.f34551A;
            return "State(email=" + str + ", isLoading=" + z2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f34552z);
            parcel.writeInt(this.f34551A ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(String str, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z2);
        }
    }
}
