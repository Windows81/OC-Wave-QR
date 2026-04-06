package com.hansecom.abt.presentation.screens.home.faremedia.createCard;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface FareMediaCreateCard {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f36676a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return -235854040;
            }

            public String toString() {
                return "Confirm";
            }
        }

        @Metadata
        public static final class NickNameChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f36677a;

            public NickNameChange(String str) {
                Intrinsics.i(str, "value");
                this.f36677a = str;
            }

            public final String a() {
                return this.f36677a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NickNameChange) && Intrinsics.d(this.f36677a, ((NickNameChange) obj).f36677a);
            }

            public int hashCode() {
                return this.f36677a.hashCode();
            }

            public String toString() {
                String str = this.f36677a;
                return "NickNameChange(value=" + str + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36678a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36678a = stringValue;
            }

            public final StringValue a() {
                return this.f36678a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f36678a, ((Error) obj).f36678a);
            }

            public int hashCode() {
                return this.f36678a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36678a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Success f36679a = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return -472567610;
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
        public final StringValue f36680A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f36681B;

        /* renamed from: z  reason: collision with root package name */
        public final String f36682z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readString(), (StringValue) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, StringValue stringValue, boolean z2) {
            Intrinsics.i(str, "nickName");
            Intrinsics.i(stringValue, "nickNameError");
            this.f36682z = str;
            this.f36680A = stringValue;
            this.f36681B = z2;
        }

        public static /* synthetic */ State b(State state, String str, StringValue stringValue, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = state.f36682z;
            }
            if ((i2 & 2) != 0) {
                stringValue = state.f36680A;
            }
            if ((i2 & 4) != 0) {
                z2 = state.f36681B;
            }
            return state.a(str, stringValue, z2);
        }

        public final State a(String str, StringValue stringValue, boolean z2) {
            Intrinsics.i(str, "nickName");
            Intrinsics.i(stringValue, "nickNameError");
            return new State(str, stringValue, z2);
        }

        public final String c() {
            return this.f36682z;
        }

        public final StringValue d() {
            return this.f36680A;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f36681B;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f36682z, state.f36682z) && Intrinsics.d(this.f36680A, state.f36680A) && this.f36681B == state.f36681B;
        }

        public int hashCode() {
            return (((this.f36682z.hashCode() * 31) + this.f36680A.hashCode()) * 31) + Boolean.hashCode(this.f36681B);
        }

        public String toString() {
            String str = this.f36682z;
            StringValue stringValue = this.f36680A;
            boolean z2 = this.f36681B;
            return "State(nickName=" + str + ", nickNameError=" + stringValue + ", isLoading=" + z2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f36682z);
            parcel.writeParcelable(this.f36680A, i2);
            parcel.writeInt(this.f36681B ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(String str, StringValue stringValue, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? StringValue.Companion.a() : stringValue, (i2 & 4) != 0 ? false : z2);
        }
    }
}
