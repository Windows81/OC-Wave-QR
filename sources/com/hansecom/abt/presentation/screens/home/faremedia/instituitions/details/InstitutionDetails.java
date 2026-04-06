package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.presentation.model.InstitutionState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface InstitutionDetails {

    @Metadata
    public interface Action {

        @Metadata
        public static final class ShowUnlinkDialog implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f36825a;

            public ShowUnlinkDialog(boolean z2) {
                this.f36825a = z2;
            }

            public final boolean a() {
                return this.f36825a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowUnlinkDialog) && this.f36825a == ((ShowUnlinkDialog) obj).f36825a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f36825a);
            }

            public String toString() {
                boolean z2 = this.f36825a;
                return "ShowUnlinkDialog(show=" + z2 + ")";
            }
        }

        @Metadata
        public static final class Unlink implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Unlink f36826a = new Unlink();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Unlink);
            }

            public int hashCode() {
                return 1571705301;
            }

            public String toString() {
                return "Unlink";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36827a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36827a = stringValue;
            }

            public final StringValue a() {
                return this.f36827a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f36827a, ((Error) obj).f36827a);
            }

            public int hashCode() {
                return this.f36827a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36827a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Success f36828a = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return -1818271524;
            }

            public String toString() {
                return "Success";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final boolean f36829A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f36830B;
        public final boolean C;
        public final boolean D;

        /* renamed from: z  reason: collision with root package name */
        public final InstitutionState f36831z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readInt() == 0 ? null : InstitutionState.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(InstitutionState institutionState, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.f36831z = institutionState;
            this.f36829A = z2;
            this.f36830B = z3;
            this.C = z4;
            this.D = z5;
        }

        public static /* synthetic */ State b(State state, InstitutionState institutionState, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                institutionState = state.f36831z;
            }
            if ((i2 & 2) != 0) {
                z2 = state.f36829A;
            }
            boolean z6 = z2;
            if ((i2 & 4) != 0) {
                z3 = state.f36830B;
            }
            boolean z7 = z3;
            if ((i2 & 8) != 0) {
                z4 = state.C;
            }
            boolean z8 = z4;
            if ((i2 & 16) != 0) {
                z5 = state.D;
            }
            return state.a(institutionState, z6, z7, z8, z5);
        }

        public final State a(InstitutionState institutionState, boolean z2, boolean z3, boolean z4, boolean z5) {
            return new State(institutionState, z2, z3, z4, z5);
        }

        public final boolean c() {
            return this.D;
        }

        public final InstitutionState d() {
            return this.f36831z;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.C;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f36831z, state.f36831z) && this.f36829A == state.f36829A && this.f36830B == state.f36830B && this.C == state.C && this.D == state.D;
        }

        public final boolean f() {
            return this.f36829A;
        }

        public final boolean g() {
            return this.f36830B;
        }

        public int hashCode() {
            InstitutionState institutionState = this.f36831z;
            return ((((((((institutionState == null ? 0 : institutionState.hashCode()) * 31) + Boolean.hashCode(this.f36829A)) * 31) + Boolean.hashCode(this.f36830B)) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.D);
        }

        public String toString() {
            InstitutionState institutionState = this.f36831z;
            boolean z2 = this.f36829A;
            boolean z3 = this.f36830B;
            boolean z4 = this.C;
            boolean z5 = this.D;
            return "State(institution=" + institutionState + ", showUnlinkDialog=" + z2 + ", isLoading=" + z3 + ", showFullInfo=" + z4 + ", canManageInstitutions=" + z5 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            InstitutionState institutionState = this.f36831z;
            if (institutionState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                institutionState.writeToParcel(parcel, i2);
            }
            parcel.writeInt(this.f36829A ? 1 : 0);
            parcel.writeInt(this.f36830B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeInt(this.D ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(com.hansecom.abt.presentation.model.InstitutionState r4, boolean r5, boolean r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L_0x0005
                r4 = 0
            L_0x0005:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto L_0x000c
                r10 = r0
                goto L_0x000d
            L_0x000c:
                r10 = r5
            L_0x000d:
                r5 = r9 & 4
                if (r5 == 0) goto L_0x0013
                r1 = r0
                goto L_0x0014
            L_0x0013:
                r1 = r6
            L_0x0014:
                r5 = r9 & 8
                if (r5 == 0) goto L_0x0019
                goto L_0x001a
            L_0x0019:
                r0 = r7
            L_0x001a:
                r5 = r9 & 16
                if (r5 == 0) goto L_0x001f
                r8 = 1
            L_0x001f:
                r2 = r8
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r1
                r9 = r0
                r10 = r2
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetails.State.<init>(com.hansecom.abt.presentation.model.InstitutionState, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
