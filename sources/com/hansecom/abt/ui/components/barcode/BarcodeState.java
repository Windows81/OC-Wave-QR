package com.hansecom.abt.ui.components.barcode;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface BarcodeState extends Parcelable {

    @Metadata
    public static final class Error implements BarcodeState {
        public static final Parcelable.Creator<Error> CREATOR = new Creator();

        /* renamed from: z  reason: collision with root package name */
        public final StringValue f37963z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<Error> {
            /* renamed from: a */
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new Error((StringValue) parcel.readParcelable(Error.class.getClassLoader()));
            }

            /* renamed from: b */
            public final Error[] newArray(int i2) {
                return new Error[i2];
            }
        }

        public Error(StringValue stringValue) {
            Intrinsics.i(stringValue, "message");
            this.f37963z = stringValue;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.f37963z, ((Error) obj).f37963z);
        }

        public int hashCode() {
            return this.f37963z.hashCode();
        }

        public String toString() {
            StringValue stringValue = this.f37963z;
            return "Error(message=" + stringValue + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeParcelable(this.f37963z, i2);
        }
    }

    @Metadata
    public static final class Loading implements BarcodeState {
        public static final Parcelable.Creator<Loading> CREATOR = new Creator();

        /* renamed from: z  reason: collision with root package name */
        public static final Loading f37964z = new Loading();

        @Metadata
        public static final class Creator implements Parcelable.Creator<Loading> {
            /* renamed from: a */
            public final Loading createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                parcel.readInt();
                return Loading.f37964z;
            }

            /* renamed from: b */
            public final Loading[] newArray(int i2) {
                return new Loading[i2];
            }
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -733882803;
        }

        public String toString() {
            return "Loading";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata
    public static final class Success implements BarcodeState {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final Bitmap f37965A;

        /* renamed from: z  reason: collision with root package name */
        public final String f37966z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<Success> {
            /* renamed from: a */
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new Success(parcel.readString(), (Bitmap) parcel.readParcelable(Success.class.getClassLoader()));
            }

            /* renamed from: b */
            public final Success[] newArray(int i2) {
                return new Success[i2];
            }
        }

        public Success(String str, Bitmap bitmap) {
            Intrinsics.i(str, "text");
            Intrinsics.i(bitmap, "bitmap");
            this.f37966z = str;
            this.f37965A = bitmap;
        }

        public final Bitmap a() {
            return this.f37965A;
        }

        public final String b() {
            return this.f37966z;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.d(this.f37966z, success.f37966z) && Intrinsics.d(this.f37965A, success.f37965A);
        }

        public int hashCode() {
            return (this.f37966z.hashCode() * 31) + this.f37965A.hashCode();
        }

        public String toString() {
            String str = this.f37966z;
            Bitmap bitmap = this.f37965A;
            return "Success(text=" + str + ", bitmap=" + bitmap + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f37966z);
            parcel.writeParcelable(this.f37965A, i2);
        }
    }
}
