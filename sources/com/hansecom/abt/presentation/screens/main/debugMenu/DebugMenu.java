package com.hansecom.abt.presentation.screens.main.debugMenu;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface DebugMenu {

    @Metadata
    public interface Action {

        @Metadata
        public static final class BreakAccessTokens implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final BreakAccessTokens f37605a = new BreakAccessTokens();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof BreakAccessTokens);
            }

            public int hashCode() {
                return -66604583;
            }

            public String toString() {
                return "BreakAccessTokens";
            }
        }

        @Metadata
        public static final class RealmChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f37606a;

            public RealmChange(String str) {
                Intrinsics.i(str, "realm");
                this.f37606a = str;
            }

            public final String a() {
                return this.f37606a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RealmChange) && Intrinsics.d(this.f37606a, ((RealmChange) obj).f37606a);
            }

            public int hashCode() {
                return this.f37606a.hashCode();
            }

            public String toString() {
                String str = this.f37606a;
                return "RealmChange(realm=" + str + ")";
            }
        }

        @Metadata
        public static final class RestartApp implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final RestartApp f37607a = new RestartApp();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof RestartApp);
            }

            public int hashCode() {
                return -12911114;
            }

            public String toString() {
                return "RestartApp";
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
        public final String f37608A;

        /* renamed from: z  reason: collision with root package name */
        public final PersistentList f37609z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(ExtensionsKt.e(parcel.createStringArrayList()), parcel.readString());
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(PersistentList persistentList, String str) {
            Intrinsics.i(persistentList, "realms");
            Intrinsics.i(str, "selectedRealm");
            this.f37609z = persistentList;
            this.f37608A = str;
        }

        public static /* synthetic */ State b(State state, PersistentList persistentList, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                persistentList = state.f37609z;
            }
            if ((i2 & 2) != 0) {
                str = state.f37608A;
            }
            return state.a(persistentList, str);
        }

        public final State a(PersistentList persistentList, String str) {
            Intrinsics.i(persistentList, "realms");
            Intrinsics.i(str, "selectedRealm");
            return new State(persistentList, str);
        }

        public final PersistentList c() {
            return this.f37609z;
        }

        public final String d() {
            return this.f37608A;
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
            return Intrinsics.d(this.f37609z, state.f37609z) && Intrinsics.d(this.f37608A, state.f37608A);
        }

        public int hashCode() {
            return (this.f37609z.hashCode() * 31) + this.f37608A.hashCode();
        }

        public String toString() {
            PersistentList persistentList = this.f37609z;
            String str = this.f37608A;
            return "State(realms=" + persistentList + ", selectedRealm=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeStringList(this.f37609z);
            parcel.writeString(this.f37608A);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(PersistentList persistentList, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? ExtensionsKt.a() : persistentList, (i2 & 2) != 0 ? "" : str);
        }
    }
}
