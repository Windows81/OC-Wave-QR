package com.hansecom.abt.presentation.screens.main.lock;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface Lock {

    @Metadata
    public interface Action {

        @Metadata
        public static final class ErrorOnUnlock implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f37666a;

            public ErrorOnUnlock(String str) {
                this.f37666a = str;
            }

            public final String a() {
                return this.f37666a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ErrorOnUnlock) && Intrinsics.d(this.f37666a, ((ErrorOnUnlock) obj).f37666a);
            }

            public int hashCode() {
                String str = this.f37666a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.f37666a;
                return "ErrorOnUnlock(message=" + str + ")";
            }
        }

        @Metadata
        public static final class ShowBiometricDialog implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final ShowBiometricDialog f37667a = new ShowBiometricDialog();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowBiometricDialog);
            }

            public int hashCode() {
                return -1383537433;
            }

            public String toString() {
                return "ShowBiometricDialog";
            }
        }

        @Metadata
        public static final class Unlock implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Unlock f37668a = new Unlock();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Unlock);
            }

            public int hashCode() {
                return -1958198464;
            }

            public String toString() {
                return "Unlock";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f37669a;

            public Error(String str) {
                Intrinsics.i(str, "message");
                this.f37669a = str;
            }

            public final String a() {
                return this.f37669a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f37669a, ((Error) obj).f37669a);
            }

            public int hashCode() {
                return this.f37669a.hashCode();
            }

            public String toString() {
                String str = this.f37669a;
                return "Error(message=" + str + ")";
            }
        }

        @Metadata
        public static final class ShowBiometricDialog implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final ShowBiometricDialog f37670a = new ShowBiometricDialog();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowBiometricDialog);
            }

            public int hashCode() {
                return 1307829442;
            }

            public String toString() {
                return "ShowBiometricDialog";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: z  reason: collision with root package name */
        public final boolean f37671z;

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
            this.f37671z = z2;
        }

        public final boolean a() {
            return this.f37671z;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof State) && this.f37671z == ((State) obj).f37671z;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f37671z);
        }

        public String toString() {
            boolean z2 = this.f37671z;
            return "State(hasFaceId=" + z2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f37671z ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z2);
        }
    }
}
