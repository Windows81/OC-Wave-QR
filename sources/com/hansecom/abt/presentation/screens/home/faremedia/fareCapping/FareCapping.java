package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface FareCapping {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Refresh implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Refresh f36712a = new Refresh();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Refresh);
            }

            public int hashCode() {
                return -572252095;
            }

            public String toString() {
                return "Refresh";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36713a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36713a = stringValue;
            }

            public final StringValue a() {
                return this.f36713a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f36713a, ((Error) obj).f36713a);
            }

            public int hashCode() {
                return this.f36713a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36713a;
                return "Error(message=" + stringValue + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final PersistentList f36714A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f36715B;
        public final boolean C;

        /* renamed from: z  reason: collision with root package name */
        public final String f36716z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                boolean z2 = false;
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
                }
                PersistentList e2 = ExtensionsKt.e(arrayList);
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new State(readString, e2, z3, z2);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, PersistentList persistentList, boolean z2, boolean z3) {
            Intrinsics.i(str, "cardNickname");
            Intrinsics.i(persistentList, "cappings");
            this.f36716z = str;
            this.f36714A = persistentList;
            this.f36715B = z2;
            this.C = z3;
        }

        public static /* synthetic */ State b(State state, String str, PersistentList persistentList, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = state.f36716z;
            }
            if ((i2 & 2) != 0) {
                persistentList = state.f36714A;
            }
            if ((i2 & 4) != 0) {
                z2 = state.f36715B;
            }
            if ((i2 & 8) != 0) {
                z3 = state.C;
            }
            return state.a(str, persistentList, z2, z3);
        }

        public final State a(String str, PersistentList persistentList, boolean z2, boolean z3) {
            Intrinsics.i(str, "cardNickname");
            Intrinsics.i(persistentList, "cappings");
            return new State(str, persistentList, z2, z3);
        }

        public final String c() {
            return this.f36716z;
        }

        public final List d() {
            PersistentList persistentList = this.f36714A;
            ArrayList arrayList = new ArrayList();
            for (Object next : persistentList) {
                if (next instanceof FareCappingCardState.Concluded) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public final int describeContents() {
            return 0;
        }

        public final List e() {
            PersistentList persistentList = this.f36714A;
            ArrayList arrayList = new ArrayList();
            for (Object next : persistentList) {
                if (next instanceof FareCappingCardState.InProgress) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f36716z, state.f36716z) && Intrinsics.d(this.f36714A, state.f36714A) && this.f36715B == state.f36715B && this.C == state.C;
        }

        public final boolean f() {
            return this.f36715B;
        }

        public final boolean g() {
            return this.C;
        }

        public int hashCode() {
            return (((((this.f36716z.hashCode() * 31) + this.f36714A.hashCode()) * 31) + Boolean.hashCode(this.f36715B)) * 31) + Boolean.hashCode(this.C);
        }

        public String toString() {
            String str = this.f36716z;
            PersistentList persistentList = this.f36714A;
            boolean z2 = this.f36715B;
            boolean z3 = this.C;
            return "State(cardNickname=" + str + ", cappings=" + persistentList + ", isLoading=" + z2 + ", isRefreshing=" + z3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f36716z);
            PersistentList<Parcelable> persistentList = this.f36714A;
            parcel.writeInt(persistentList.size());
            for (Parcelable writeParcelable : persistentList) {
                parcel.writeParcelable(writeParcelable, i2);
            }
            parcel.writeInt(this.f36715B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(String str, PersistentList persistentList, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? ExtensionsKt.a() : persistentList, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? false : z3);
        }
    }
}
