package com.hansecom.abt.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class UiResult implements Parcelable {

    @Metadata
    public static final class Error extends UiResult {
        public static final Parcelable.Creator<Error> CREATOR = new Creator();

        /* renamed from: z  reason: collision with root package name */
        public final StringValue f37860z;

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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(StringValue stringValue) {
            super((DefaultConstructorMarker) null);
            Intrinsics.i(stringValue, "message");
            this.f37860z = stringValue;
        }

        public final StringValue d() {
            return this.f37860z;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.f37860z, ((Error) obj).f37860z);
        }

        public int hashCode() {
            return this.f37860z.hashCode();
        }

        public String toString() {
            StringValue stringValue = this.f37860z;
            return "Error(message=" + stringValue + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeParcelable(this.f37860z, i2);
        }
    }

    @Metadata
    public static final class Init extends UiResult {
        public static final Parcelable.Creator<Init> CREATOR = new Creator();

        /* renamed from: z  reason: collision with root package name */
        public static final Init f37861z = new Init();

        @Metadata
        public static final class Creator implements Parcelable.Creator<Init> {
            /* renamed from: a */
            public final Init createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                parcel.readInt();
                return Init.f37861z;
            }

            /* renamed from: b */
            public final Init[] newArray(int i2) {
                return new Init[i2];
            }
        }

        public Init() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Init);
        }

        public int hashCode() {
            return -1092616043;
        }

        public String toString() {
            return "Init";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata
    public static final class Loading extends UiResult {
        public static final Parcelable.Creator<Loading> CREATOR = new Creator();

        /* renamed from: z  reason: collision with root package name */
        public static final Loading f37862z = new Loading();

        @Metadata
        public static final class Creator implements Parcelable.Creator<Loading> {
            /* renamed from: a */
            public final Loading createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                parcel.readInt();
                return Loading.f37862z;
            }

            /* renamed from: b */
            public final Loading[] newArray(int i2) {
                return new Loading[i2];
            }
        }

        public Loading() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -178988137;
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
    public static final class Success extends UiResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();

        /* renamed from: z  reason: collision with root package name */
        public static final Success f37863z = new Success();

        @Metadata
        public static final class Creator implements Parcelable.Creator<Success> {
            /* renamed from: a */
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                parcel.readInt();
                return Success.f37863z;
            }

            /* renamed from: b */
            public final Success[] newArray(int i2) {
                return new Success[i2];
            }
        }

        public Success() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public int hashCode() {
            return 1912158814;
        }

        public String toString() {
            return "Success";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ UiResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final StringValue a() {
        StringValue stringValue = null;
        Error error = this instanceof Error ? (Error) this : null;
        if (error != null) {
            stringValue = error.d();
        }
        return StringValueKt.b(stringValue);
    }

    public final boolean b() {
        return this instanceof Loading;
    }

    public final boolean c() {
        return this instanceof Success;
    }

    public UiResult() {
    }
}
