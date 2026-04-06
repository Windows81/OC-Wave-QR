package com.hansecom.abt.presentation.screens.home;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface Home {

    @Metadata
    public interface Action {

        @Metadata
        public static final class ActivateBiometricLock implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final ActivateBiometricLock f34965a = new ActivateBiometricLock();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ActivateBiometricLock);
            }

            public int hashCode() {
                return -1178052527;
            }

            public String toString() {
                return "ActivateBiometricLock";
            }
        }

        @Metadata
        public static final class DismissBiometricLockActivation implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final DismissBiometricLockActivation f34966a = new DismissBiometricLockActivation();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof DismissBiometricLockActivation);
            }

            public int hashCode() {
                return 724376110;
            }

            public String toString() {
                return "DismissBiometricLockActivation";
            }
        }
    }

    @Metadata
    public interface Effect {
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final boolean f34967A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f34968B;
        public final boolean C;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f34969z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                boolean z2 = false;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new State(z3, z4, z5, z2);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2, boolean z3, boolean z4, boolean z5) {
            this.f34969z = z2;
            this.f34967A = z3;
            this.f34968B = z4;
            this.C = z5;
        }

        public static /* synthetic */ State b(State state, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = state.f34969z;
            }
            if ((i2 & 2) != 0) {
                z3 = state.f34967A;
            }
            if ((i2 & 4) != 0) {
                z4 = state.f34968B;
            }
            if ((i2 & 8) != 0) {
                z5 = state.C;
            }
            return state.a(z2, z3, z4, z5);
        }

        public final State a(boolean z2, boolean z3, boolean z4, boolean z5) {
            return new State(z2, z3, z4, z5);
        }

        public final boolean c() {
            return this.C;
        }

        public final boolean d() {
            return this.f34967A;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f34969z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.f34969z == state.f34969z && this.f34967A == state.f34967A && this.f34968B == state.f34968B && this.C == state.C;
        }

        public final boolean f() {
            return this.f34968B;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f34969z) * 31) + Boolean.hashCode(this.f34967A)) * 31) + Boolean.hashCode(this.f34968B)) * 31) + Boolean.hashCode(this.C);
        }

        public String toString() {
            boolean z2 = this.f34969z;
            boolean z3 = this.f34967A;
            boolean z4 = this.f34968B;
            boolean z5 = this.C;
            return "State(isBarcodeEnabled=" + z2 + ", isBarcodeButtonEnabled=" + z3 + ", isTripPlannerTabEnabled=" + z4 + ", showActivateBiometricDialog=" + z5 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f34969z ? 1 : 0);
            parcel.writeInt(this.f34967A ? 1 : 0);
            parcel.writeInt(this.f34968B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(boolean z2, boolean z3, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? true : z3, (i2 & 4) != 0 ? true : z4, (i2 & 8) != 0 ? false : z5);
        }
    }
}
