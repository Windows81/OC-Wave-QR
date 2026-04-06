package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.ui.components.barcode.BarcodeState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface FareMediaAddValueCashPaymentBarcode {

    @Metadata
    public interface Action {

        @Metadata
        public static final class GenerateBarcode implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final int f36131a;

            /* renamed from: b  reason: collision with root package name */
            public final int f36132b;

            public GenerateBarcode(int i2, int i3) {
                this.f36131a = i2;
                this.f36132b = i3;
            }

            public final int a() {
                return this.f36132b;
            }

            public final int b() {
                return this.f36131a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GenerateBarcode)) {
                    return false;
                }
                GenerateBarcode generateBarcode = (GenerateBarcode) obj;
                return this.f36131a == generateBarcode.f36131a && this.f36132b == generateBarcode.f36132b;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f36131a) * 31) + Integer.hashCode(this.f36132b);
            }

            public String toString() {
                int i2 = this.f36131a;
                int i3 = this.f36132b;
                return "GenerateBarcode(width=" + i2 + ", height=" + i3 + ")";
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
        public final String f36133A;

        /* renamed from: B  reason: collision with root package name */
        public final StringValue f36134B;

        /* renamed from: z  reason: collision with root package name */
        public final BarcodeState f36135z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                Class<State> cls = State.class;
                return new State((BarcodeState) parcel.readParcelable(cls.getClassLoader()), parcel.readString(), (StringValue) parcel.readParcelable(cls.getClassLoader()));
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(BarcodeState barcodeState, String str, StringValue stringValue) {
            Intrinsics.i(barcodeState, "barcodeState");
            this.f36135z = barcodeState;
            this.f36133A = str;
            this.f36134B = stringValue;
        }

        public static /* synthetic */ State b(State state, BarcodeState barcodeState, String str, StringValue stringValue, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                barcodeState = state.f36135z;
            }
            if ((i2 & 2) != 0) {
                str = state.f36133A;
            }
            if ((i2 & 4) != 0) {
                stringValue = state.f36134B;
            }
            return state.a(barcodeState, str, stringValue);
        }

        public final State a(BarcodeState barcodeState, String str, StringValue stringValue) {
            Intrinsics.i(barcodeState, "barcodeState");
            return new State(barcodeState, str, stringValue);
        }

        public final BarcodeState c() {
            return this.f36135z;
        }

        public final StringValue d() {
            return this.f36134B;
        }

        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f36133A;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f36135z, state.f36135z) && Intrinsics.d(this.f36133A, state.f36133A) && Intrinsics.d(this.f36134B, state.f36134B);
        }

        public int hashCode() {
            int hashCode = this.f36135z.hashCode() * 31;
            String str = this.f36133A;
            int i2 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            StringValue stringValue = this.f36134B;
            if (stringValue != null) {
                i2 = stringValue.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            BarcodeState barcodeState = this.f36135z;
            String str = this.f36133A;
            StringValue stringValue = this.f36134B;
            return "State(barcodeState=" + barcodeState + ", storeFinderLinkUrl=" + str + ", storeFinderLinkTitle=" + stringValue + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeParcelable(this.f36135z, i2);
            parcel.writeString(this.f36133A);
            parcel.writeParcelable(this.f36134B, i2);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(BarcodeState barcodeState, String str, StringValue stringValue, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? BarcodeState.Loading.f37964z : barcodeState, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : stringValue);
        }
    }
}
