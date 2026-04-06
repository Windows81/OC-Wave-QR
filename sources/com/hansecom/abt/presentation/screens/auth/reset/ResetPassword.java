package com.hansecom.abt.presentation.screens.auth.reset;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface ResetPassword {

    @Metadata
    public interface Action {

        @Metadata
        public static final class EmailChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f34599a;

            public EmailChange(String str) {
                Intrinsics.i(str, "value");
                this.f34599a = str;
            }

            public final String a() {
                return this.f34599a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EmailChange) && Intrinsics.d(this.f34599a, ((EmailChange) obj).f34599a);
            }

            public int hashCode() {
                return this.f34599a.hashCode();
            }

            public String toString() {
                String str = this.f34599a;
                return "EmailChange(value=" + str + ")";
            }
        }

        @Metadata
        public static final class Reset implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Reset f34600a = new Reset();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Reset);
            }

            public int hashCode() {
                return -426630777;
            }

            public String toString() {
                return "Reset";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f34601a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f34601a = stringValue;
            }

            public final StringValue a() {
                return this.f34601a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f34601a, ((Error) obj).f34601a);
            }

            public int hashCode() {
                return this.f34601a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f34601a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f34602a;

            public Success(String str) {
                Intrinsics.i(str, "email");
                this.f34602a = str;
            }

            public final String a() {
                return this.f34602a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.d(this.f34602a, ((Success) obj).f34602a);
            }

            public int hashCode() {
                return this.f34602a.hashCode();
            }

            public String toString() {
                String str = this.f34602a;
                return "Success(email=" + str + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final boolean f34603A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f34604B;

        /* renamed from: z  reason: collision with root package name */
        public final String f34605z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                String readString = parcel.readString();
                boolean z2 = false;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new State(readString, z3, z2);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, boolean z2, boolean z3) {
            Intrinsics.i(str, "email");
            this.f34605z = str;
            this.f34603A = z2;
            this.f34604B = z3;
        }

        public static /* synthetic */ State b(State state, String str, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = state.f34605z;
            }
            if ((i2 & 2) != 0) {
                z2 = state.f34603A;
            }
            if ((i2 & 4) != 0) {
                z3 = state.f34604B;
            }
            return state.a(str, z2, z3);
        }

        public final State a(String str, boolean z2, boolean z3) {
            Intrinsics.i(str, "email");
            return new State(str, z2, z3);
        }

        public final String c() {
            return this.f34605z;
        }

        public final boolean d() {
            return this.f34603A;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f34604B;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f34605z, state.f34605z) && this.f34603A == state.f34603A && this.f34604B == state.f34604B;
        }

        public int hashCode() {
            return (((this.f34605z.hashCode() * 31) + Boolean.hashCode(this.f34603A)) * 31) + Boolean.hashCode(this.f34604B);
        }

        public String toString() {
            String str = this.f34605z;
            boolean z2 = this.f34603A;
            boolean z3 = this.f34604B;
            return "State(email=" + str + ", emailIsValid=" + z2 + ", showProgress=" + z3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f34605z);
            parcel.writeInt(this.f34603A ? 1 : 0);
            parcel.writeInt(this.f34604B ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(String str, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? false : z3);
        }
    }
}
