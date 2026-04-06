package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.presentation.model.InstitutionState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface AddInstitution {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Link implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Link f36793a = new Link();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Link);
            }

            public int hashCode() {
                return -1977700678;
            }

            public String toString() {
                return "Link";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36794a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36794a = stringValue;
            }

            public final StringValue a() {
                return this.f36794a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f36794a, ((Error) obj).f36794a);
            }

            public int hashCode() {
                return this.f36794a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36794a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Success f36795a = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return 1217886622;
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
        public final boolean f36796A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f36797B;
        public final boolean C;

        /* renamed from: z  reason: collision with root package name */
        public final InstitutionState f36798z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                InstitutionState createFromParcel = parcel.readInt() == 0 ? null : InstitutionState.CREATOR.createFromParcel(parcel);
                boolean z2 = false;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new State(createFromParcel, z3, z4, z2);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(InstitutionState institutionState, boolean z2, boolean z3, boolean z4) {
            this.f36798z = institutionState;
            this.f36796A = z2;
            this.f36797B = z3;
            this.C = z4;
        }

        public static /* synthetic */ State b(State state, InstitutionState institutionState, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                institutionState = state.f36798z;
            }
            if ((i2 & 2) != 0) {
                z2 = state.f36796A;
            }
            if ((i2 & 4) != 0) {
                z3 = state.f36797B;
            }
            if ((i2 & 8) != 0) {
                z4 = state.C;
            }
            return state.a(institutionState, z2, z3, z4);
        }

        public final State a(InstitutionState institutionState, boolean z2, boolean z3, boolean z4) {
            return new State(institutionState, z2, z3, z4);
        }

        public final boolean c() {
            return this.C;
        }

        public final InstitutionState d() {
            return this.f36798z;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f36797B;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f36798z, state.f36798z) && this.f36796A == state.f36796A && this.f36797B == state.f36797B && this.C == state.C;
        }

        public final boolean f() {
            return this.f36796A;
        }

        public int hashCode() {
            InstitutionState institutionState = this.f36798z;
            return ((((((institutionState == null ? 0 : institutionState.hashCode()) * 31) + Boolean.hashCode(this.f36796A)) * 31) + Boolean.hashCode(this.f36797B)) * 31) + Boolean.hashCode(this.C);
        }

        public String toString() {
            InstitutionState institutionState = this.f36798z;
            boolean z2 = this.f36796A;
            boolean z3 = this.f36797B;
            boolean z4 = this.C;
            return "State(institution=" + institutionState + ", isLoading=" + z2 + ", showFullInfo=" + z3 + ", canManageInstitutions=" + z4 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            InstitutionState institutionState = this.f36798z;
            if (institutionState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                institutionState.writeToParcel(parcel, i2);
            }
            parcel.writeInt(this.f36796A ? 1 : 0);
            parcel.writeInt(this.f36797B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(InstitutionState institutionState, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : institutionState, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? true : z4);
        }
    }
}
