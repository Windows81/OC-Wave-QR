package com.hansecom.abt.presentation.screens.home.barcode;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface BarcodeDisplay {

    @Metadata
    public interface Action {
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f35840a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f35840a = stringValue;
            }

            public final StringValue a() {
                return this.f35840a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f35840a, ((Error) obj).f35840a);
            }

            public int hashCode() {
                return this.f35840a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f35840a;
                return "Error(message=" + stringValue + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final BigDecimal f35841A;

        /* renamed from: B  reason: collision with root package name */
        public final String f35842B;

        /* renamed from: z  reason: collision with root package name */
        public final Bitmap f35843z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State((Bitmap) parcel.readParcelable(State.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), parcel.readString());
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(Bitmap bitmap, BigDecimal bigDecimal, String str) {
            Intrinsics.i(str, "cardName");
            this.f35843z = bitmap;
            this.f35841A = bigDecimal;
            this.f35842B = str;
        }

        public static /* synthetic */ State b(State state, Bitmap bitmap, BigDecimal bigDecimal, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bitmap = state.f35843z;
            }
            if ((i2 & 2) != 0) {
                bigDecimal = state.f35841A;
            }
            if ((i2 & 4) != 0) {
                str = state.f35842B;
            }
            return state.a(bitmap, bigDecimal, str);
        }

        public final State a(Bitmap bitmap, BigDecimal bigDecimal, String str) {
            Intrinsics.i(str, "cardName");
            return new State(bitmap, bigDecimal, str);
        }

        public final BigDecimal c() {
            return this.f35841A;
        }

        public final String d() {
            return this.f35842B;
        }

        public final int describeContents() {
            return 0;
        }

        public final Bitmap e() {
            return this.f35843z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f35843z, state.f35843z) && Intrinsics.d(this.f35841A, state.f35841A) && Intrinsics.d(this.f35842B, state.f35842B);
        }

        public int hashCode() {
            Bitmap bitmap = this.f35843z;
            int i2 = 0;
            int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            BigDecimal bigDecimal = this.f35841A;
            if (bigDecimal != null) {
                i2 = bigDecimal.hashCode();
            }
            return ((hashCode + i2) * 31) + this.f35842B.hashCode();
        }

        public String toString() {
            Bitmap bitmap = this.f35843z;
            BigDecimal bigDecimal = this.f35841A;
            String str = this.f35842B;
            return "State(code=" + bitmap + ", balance=" + bigDecimal + ", cardName=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeParcelable(this.f35843z, i2);
            parcel.writeSerializable(this.f35841A);
            parcel.writeString(this.f35842B);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(Bitmap bitmap, BigDecimal bigDecimal, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : bitmap, (i2 & 2) != 0 ? null : bigDecimal, (i2 & 4) != 0 ? "" : str);
        }
    }
}
