package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.ui.components.passCard.PassCardState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface FareMediaPasses {

    @Metadata
    public interface Action {

        @Metadata
        public static final class AddMorePassClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final AddMorePassClick f36986a = new AddMorePassClick();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AddMorePassClick);
            }

            public int hashCode() {
                return -1753096641;
            }

            public String toString() {
                return "AddMorePassClick";
            }
        }

        @Metadata
        public static final class OnAutoLoadClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final long f36987a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f36988b;

            public OnAutoLoadClick(long j2, boolean z2) {
                this.f36987a = j2;
                this.f36988b = z2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OnAutoLoadClick)) {
                    return false;
                }
                OnAutoLoadClick onAutoLoadClick = (OnAutoLoadClick) obj;
                return this.f36987a == onAutoLoadClick.f36987a && this.f36988b == onAutoLoadClick.f36988b;
            }

            public int hashCode() {
                return (Long.hashCode(this.f36987a) * 31) + Boolean.hashCode(this.f36988b);
            }

            public String toString() {
                long j2 = this.f36987a;
                boolean z2 = this.f36988b;
                return "OnAutoLoadClick(id=" + j2 + ", isOn=" + z2 + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class AddPassEffect implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final AddPassEffect f36989a = new AddPassEffect();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AddPassEffect);
            }

            public int hashCode() {
                return -194314208;
            }

            public String toString() {
                return "AddPassEffect";
            }
        }

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36990a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36990a = stringValue;
            }

            public final StringValue a() {
                return this.f36990a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f36990a, ((Error) obj).f36990a);
            }

            public int hashCode() {
                return this.f36990a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36990a;
                return "Error(message=" + stringValue + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final PersistentList f36991A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f36992B;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f36993z;

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
                    arrayList.add(PassCardState.CREATOR.createFromParcel(parcel));
                }
                PersistentList e2 = ExtensionsKt.e(arrayList);
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new State(z3, e2, z2);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2, PersistentList persistentList, boolean z3) {
            Intrinsics.i(persistentList, "passes");
            this.f36993z = z2;
            this.f36991A = persistentList;
            this.f36992B = z3;
        }

        public static /* synthetic */ State b(State state, boolean z2, PersistentList persistentList, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = state.f36993z;
            }
            if ((i2 & 2) != 0) {
                persistentList = state.f36991A;
            }
            if ((i2 & 4) != 0) {
                z3 = state.f36992B;
            }
            return state.a(z2, persistentList, z3);
        }

        public final State a(boolean z2, PersistentList persistentList, boolean z3) {
            Intrinsics.i(persistentList, "passes");
            return new State(z2, persistentList, z3);
        }

        public final boolean c() {
            return this.f36992B;
        }

        public final PersistentList d() {
            return this.f36991A;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f36993z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.f36993z == state.f36993z && Intrinsics.d(this.f36991A, state.f36991A) && this.f36992B == state.f36992B;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f36993z) * 31) + this.f36991A.hashCode()) * 31) + Boolean.hashCode(this.f36992B);
        }

        public String toString() {
            boolean z2 = this.f36993z;
            PersistentList persistentList = this.f36991A;
            boolean z3 = this.f36992B;
            return "State(isLoading=" + z2 + ", passes=" + persistentList + ", canAddPasses=" + z3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f36993z ? 1 : 0);
            PersistentList<PassCardState> persistentList = this.f36991A;
            parcel.writeInt(persistentList.size());
            for (PassCardState writeToParcel : persistentList) {
                writeToParcel.writeToParcel(parcel, i2);
            }
            parcel.writeInt(this.f36992B ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(boolean z2, PersistentList persistentList, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? ExtensionsKt.a() : persistentList, (i2 & 4) != 0 ? true : z3);
        }
    }
}
