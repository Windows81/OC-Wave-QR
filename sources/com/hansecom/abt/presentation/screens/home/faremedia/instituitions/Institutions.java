package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.presentation.model.InstitutionState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface Institutions {

    @Metadata
    public interface Action {
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36763a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36763a = stringValue;
            }

            public final StringValue a() {
                return this.f36763a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f36763a, ((Error) obj).f36763a);
            }

            public int hashCode() {
                return this.f36763a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36763a;
                return "Error(message=" + stringValue + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final ImmutableList f36764A;

        /* renamed from: B  reason: collision with root package name */
        public final int f36765B;
        public final boolean C;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f36766z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                boolean z2 = false;
                boolean z3 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(InstitutionState.CREATOR.createFromParcel(parcel));
                }
                PersistentList e2 = ExtensionsKt.e(arrayList);
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new State(z3, e2, readInt2, z2);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2, ImmutableList immutableList, int i2, boolean z3) {
            Intrinsics.i(immutableList, "institutions");
            this.f36766z = z2;
            this.f36764A = immutableList;
            this.f36765B = i2;
            this.C = z3;
        }

        public static /* synthetic */ State b(State state, boolean z2, ImmutableList immutableList, int i2, boolean z3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z2 = state.f36766z;
            }
            if ((i3 & 2) != 0) {
                immutableList = state.f36764A;
            }
            if ((i3 & 4) != 0) {
                i2 = state.f36765B;
            }
            if ((i3 & 8) != 0) {
                z3 = state.C;
            }
            return state.a(z2, immutableList, i2, z3);
        }

        public final State a(boolean z2, ImmutableList immutableList, int i2, boolean z3) {
            Intrinsics.i(immutableList, "institutions");
            return new State(z2, immutableList, i2, z3);
        }

        public final boolean c() {
            return this.C && this.f36764A.size() < this.f36765B;
        }

        public final ImmutableList d() {
            return this.f36764A;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f36766z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.f36766z == state.f36766z && Intrinsics.d(this.f36764A, state.f36764A) && this.f36765B == state.f36765B && this.C == state.C;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f36766z) * 31) + this.f36764A.hashCode()) * 31) + Integer.hashCode(this.f36765B)) * 31) + Boolean.hashCode(this.C);
        }

        public String toString() {
            boolean z2 = this.f36766z;
            ImmutableList immutableList = this.f36764A;
            int i2 = this.f36765B;
            boolean z3 = this.C;
            return "State(isLoading=" + z2 + ", institutions=" + immutableList + ", maxInstitutionsCount=" + i2 + ", canManageInstitutions=" + z3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f36766z ? 1 : 0);
            ImmutableList<InstitutionState> immutableList = this.f36764A;
            parcel.writeInt(immutableList.size());
            for (InstitutionState writeToParcel : immutableList) {
                writeToParcel.writeToParcel(parcel, i2);
            }
            parcel.writeInt(this.f36765B);
            parcel.writeInt(this.C ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(boolean z2, ImmutableList immutableList, int i2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z2, (i3 & 2) != 0 ? ExtensionsKt.a() : immutableList, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? true : z3);
        }
    }
}
