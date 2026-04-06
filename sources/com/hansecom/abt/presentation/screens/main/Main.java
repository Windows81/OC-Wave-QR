package com.hansecom.abt.presentation.screens.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.data.useCases.appUpdate.AppUpdate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface Main {

    @Metadata
    public interface Action {

        @Metadata
        public static final class IgnoreAppUpdate implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final IgnoreAppUpdate f37553a = new IgnoreAppUpdate();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof IgnoreAppUpdate);
            }

            public int hashCode() {
                return -461458023;
            }

            public String toString() {
                return "IgnoreAppUpdate";
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
        public final Boolean f37554A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f37555B;
        public final boolean C;
        public final AppUpdate D;
        public final boolean E;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f37556z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Intrinsics.i(parcel, "parcel");
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new State(z2, valueOf, parcel.readInt() != 0, parcel.readInt() != 0, AppUpdate.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2, Boolean bool, boolean z3, boolean z4, AppUpdate appUpdate, boolean z5) {
            Intrinsics.i(appUpdate, "appUpdate");
            this.f37556z = z2;
            this.f37554A = bool;
            this.f37555B = z3;
            this.C = z4;
            this.D = appUpdate;
            this.E = z5;
        }

        public static /* synthetic */ State b(State state, boolean z2, Boolean bool, boolean z3, boolean z4, AppUpdate appUpdate, boolean z5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = state.f37556z;
            }
            if ((i2 & 2) != 0) {
                bool = state.f37554A;
            }
            Boolean bool2 = bool;
            if ((i2 & 4) != 0) {
                z3 = state.f37555B;
            }
            boolean z6 = z3;
            if ((i2 & 8) != 0) {
                z4 = state.C;
            }
            boolean z7 = z4;
            if ((i2 & 16) != 0) {
                appUpdate = state.D;
            }
            AppUpdate appUpdate2 = appUpdate;
            if ((i2 & 32) != 0) {
                z5 = state.E;
            }
            return state.a(z2, bool2, z6, z7, appUpdate2, z5);
        }

        public final State a(boolean z2, Boolean bool, boolean z3, boolean z4, AppUpdate appUpdate, boolean z5) {
            Intrinsics.i(appUpdate, "appUpdate");
            return new State(z2, bool, z3, z4, appUpdate, z5);
        }

        public final AppUpdate c() {
            return this.D;
        }

        public final boolean d() {
            return this.f37556z || this.f37554A == null;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f37555B;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.f37556z == state.f37556z && Intrinsics.d(this.f37554A, state.f37554A) && this.f37555B == state.f37555B && this.C == state.C && this.D == state.D && this.E == state.E;
        }

        public final boolean f() {
            return this.E;
        }

        public final Boolean g() {
            return this.f37554A;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.f37556z) * 31;
            Boolean bool = this.f37554A;
            return ((((((((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.f37555B)) * 31) + Boolean.hashCode(this.C)) * 31) + this.D.hashCode()) * 31) + Boolean.hashCode(this.E);
        }

        public String toString() {
            boolean z2 = this.f37556z;
            Boolean bool = this.f37554A;
            boolean z3 = this.f37555B;
            boolean z4 = this.C;
            AppUpdate appUpdate = this.D;
            boolean z5 = this.E;
            return "State(splashScreenAnimationOn=" + z2 + ", isLoggedIn=" + bool + ", welcomeScreenEnabled=" + z3 + ", guestModeEnabled=" + z4 + ", appUpdate=" + appUpdate + ", isLocked=" + z5 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            boolean booleanValue;
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f37556z ? 1 : 0);
            Boolean bool = this.f37554A;
            if (bool == null) {
                booleanValue = false;
            } else {
                parcel.writeInt(1);
                booleanValue = bool.booleanValue();
            }
            parcel.writeInt(booleanValue ? 1 : 0);
            parcel.writeInt(this.f37555B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeString(this.D.name());
            parcel.writeInt(this.E ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(boolean r5, java.lang.Boolean r6, boolean r7, boolean r8, com.hansecom.abt.data.useCases.appUpdate.AppUpdate r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r4 = this;
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0005
                r5 = 1
            L_0x0005:
                r12 = r11 & 2
                if (r12 == 0) goto L_0x000a
                r6 = 0
            L_0x000a:
                r12 = r6
                r6 = r11 & 4
                r0 = 0
                if (r6 == 0) goto L_0x0012
                r1 = r0
                goto L_0x0013
            L_0x0012:
                r1 = r7
            L_0x0013:
                r6 = r11 & 8
                if (r6 == 0) goto L_0x0019
                r2 = r0
                goto L_0x001a
            L_0x0019:
                r2 = r8
            L_0x001a:
                r6 = r11 & 16
                if (r6 == 0) goto L_0x0020
                com.hansecom.abt.data.useCases.appUpdate.AppUpdate r9 = com.hansecom.abt.data.useCases.appUpdate.AppUpdate.NONE
            L_0x0020:
                r3 = r9
                r6 = r11 & 32
                if (r6 == 0) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r0 = r10
            L_0x0027:
                r6 = r4
                r7 = r5
                r8 = r12
                r9 = r1
                r10 = r2
                r11 = r3
                r12 = r0
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.Main.State.<init>(boolean, java.lang.Boolean, boolean, boolean, com.hansecom.abt.data.useCases.appUpdate.AppUpdate, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
