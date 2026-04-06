package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.ui.components.passCard.PassOfferCardState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface AddPasses {

    @Metadata
    public interface Action {

        @Metadata
        public static final class AddPassClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final int f37017a;

            /* renamed from: b  reason: collision with root package name */
            public final Integer f37018b;

            public AddPassClick(int i2, Integer num) {
                this.f37017a = i2;
                this.f37018b = num;
            }

            public final Integer a() {
                return this.f37018b;
            }

            public final int b() {
                return this.f37017a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AddPassClick)) {
                    return false;
                }
                AddPassClick addPassClick = (AddPassClick) obj;
                return this.f37017a == addPassClick.f37017a && Intrinsics.d(this.f37018b, addPassClick.f37018b);
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.f37017a) * 31;
                Integer num = this.f37018b;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            public String toString() {
                int i2 = this.f37017a;
                Integer num = this.f37018b;
                return "AddPassClick(passId=" + i2 + ", groupSize=" + num + ")";
            }
        }

        @Metadata
        public static final class LessClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final int f37019a;

            public LessClick(int i2) {
                this.f37019a = i2;
            }

            public final int a() {
                return this.f37019a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LessClick) && this.f37019a == ((LessClick) obj).f37019a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f37019a);
            }

            public String toString() {
                int i2 = this.f37019a;
                return "LessClick(passId=" + i2 + ")";
            }
        }

        @Metadata
        public static final class MoreClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final int f37020a;

            public MoreClick(int i2) {
                this.f37020a = i2;
            }

            public final int a() {
                return this.f37020a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MoreClick) && this.f37020a == ((MoreClick) obj).f37020a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f37020a);
            }

            public String toString() {
                int i2 = this.f37020a;
                return "MoreClick(passId=" + i2 + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class AddPassEffect implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final int f37021a;

            /* renamed from: b  reason: collision with root package name */
            public final Integer f37022b;

            public AddPassEffect(int i2, Integer num) {
                this.f37021a = i2;
                this.f37022b = num;
            }

            public final Integer a() {
                return this.f37022b;
            }

            public final int b() {
                return this.f37021a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AddPassEffect)) {
                    return false;
                }
                AddPassEffect addPassEffect = (AddPassEffect) obj;
                return this.f37021a == addPassEffect.f37021a && Intrinsics.d(this.f37022b, addPassEffect.f37022b);
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.f37021a) * 31;
                Integer num = this.f37022b;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            public String toString() {
                int i2 = this.f37021a;
                Integer num = this.f37022b;
                return "AddPassEffect(passId=" + i2 + ", groupSize=" + num + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final PersistentList f37023A;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f37024z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                boolean z2 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(PassOfferCardState.CREATOR.createFromParcel(parcel));
                }
                return new State(z2, ExtensionsKt.e(arrayList));
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2, PersistentList persistentList) {
            Intrinsics.i(persistentList, "passes");
            this.f37024z = z2;
            this.f37023A = persistentList;
        }

        public static /* synthetic */ State b(State state, boolean z2, PersistentList persistentList, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = state.f37024z;
            }
            if ((i2 & 2) != 0) {
                persistentList = state.f37023A;
            }
            return state.a(z2, persistentList);
        }

        public final State a(boolean z2, PersistentList persistentList) {
            Intrinsics.i(persistentList, "passes");
            return new State(z2, persistentList);
        }

        public final boolean c() {
            return this.f37024z;
        }

        public final PersistentList d() {
            return this.f37023A;
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
            return this.f37024z == state.f37024z && Intrinsics.d(this.f37023A, state.f37023A);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f37024z) * 31) + this.f37023A.hashCode();
        }

        public String toString() {
            boolean z2 = this.f37024z;
            PersistentList persistentList = this.f37023A;
            return "State(loading=" + z2 + ", passes=" + persistentList + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f37024z ? 1 : 0);
            PersistentList<PassOfferCardState> persistentList = this.f37023A;
            parcel.writeInt(persistentList.size());
            for (PassOfferCardState writeToParcel : persistentList) {
                writeToParcel.writeToParcel(parcel, i2);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(boolean z2, PersistentList persistentList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? ExtensionsKt.a() : persistentList);
        }
    }
}
