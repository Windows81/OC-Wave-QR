package com.hansecom.abt.presentation.screens.home.faremedia.unlockCard;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface FareMediaUnlockCard {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Confirm implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Confirm f37371a = new Confirm();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Confirm);
            }

            public int hashCode() {
                return 2073965720;
            }

            public String toString() {
                return "Confirm";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f37372a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f37372a = stringValue;
            }

            public final StringValue a() {
                return this.f37372a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f37372a, ((Error) obj).f37372a);
            }

            public int hashCode() {
                return this.f37372a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f37372a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class Success implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Success f37373a = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return 1837252150;
            }

            public String toString() {
                return "Success";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: z  reason: collision with root package name */
        public final boolean f37374z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2) {
            this.f37374z = z2;
        }

        public final State a(boolean z2) {
            return new State(z2);
        }

        public final boolean b() {
            return this.f37374z;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof State) && this.f37374z == ((State) obj).f37374z;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f37374z);
        }

        public String toString() {
            boolean z2 = this.f37374z;
            return "State(isLoading=" + z2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f37374z ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z2);
        }
    }
}
