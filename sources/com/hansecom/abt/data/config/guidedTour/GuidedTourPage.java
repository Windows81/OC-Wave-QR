package com.hansecom.abt.data.config.guidedTour;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class GuidedTourPage implements Parcelable {
    public static final KSerializer[] C = {null, MediaType.Companion.serializer(), null};
    public static final Parcelable.Creator<GuidedTourPage> CREATOR = new Creator();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final MediaType f33191A;

    /* renamed from: B  reason: collision with root package name */
    public final String f33192B;

    /* renamed from: z  reason: collision with root package name */
    public final StringValue f33193z;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GuidedTourPage> serializer() {
            return GuidedTourPage$$serializer.f33194a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    public static final class Creator implements Parcelable.Creator<GuidedTourPage> {
        /* renamed from: a */
        public final GuidedTourPage createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            return new GuidedTourPage((StringValue) parcel.readParcelable(GuidedTourPage.class.getClassLoader()), MediaType.valueOf(parcel.readString()), parcel.readString());
        }

        /* renamed from: b */
        public final GuidedTourPage[] newArray(int i2) {
            return new GuidedTourPage[i2];
        }
    }

    public /* synthetic */ GuidedTourPage(int i2, StringValue stringValue, MediaType mediaType, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i2 & 5)) {
            PluginExceptionsKt.a(i2, 5, GuidedTourPage$$serializer.f33194a.a());
        }
        this.f33193z = stringValue;
        if ((i2 & 2) == 0) {
            this.f33191A = MediaType.UNKNOWN;
        } else {
            this.f33191A = mediaType;
        }
        this.f33192B = str;
    }

    public static final /* synthetic */ void e(GuidedTourPage guidedTourPage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = C;
        compositeEncoder.A(serialDescriptor, 0, StringValueSerializer.f39098a, guidedTourPage.f33193z);
        if (compositeEncoder.w(serialDescriptor, 1) || guidedTourPage.f33191A != MediaType.UNKNOWN) {
            compositeEncoder.A(serialDescriptor, 1, kSerializerArr[1], guidedTourPage.f33191A);
        }
        compositeEncoder.t(serialDescriptor, 2, guidedTourPage.f33192B);
    }

    public final MediaType b() {
        return this.f33191A;
    }

    public final String c() {
        return this.f33192B;
    }

    public final StringValue d() {
        return this.f33193z;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuidedTourPage)) {
            return false;
        }
        GuidedTourPage guidedTourPage = (GuidedTourPage) obj;
        return Intrinsics.d(this.f33193z, guidedTourPage.f33193z) && this.f33191A == guidedTourPage.f33191A && Intrinsics.d(this.f33192B, guidedTourPage.f33192B);
    }

    public int hashCode() {
        return (((this.f33193z.hashCode() * 31) + this.f33191A.hashCode()) * 31) + this.f33192B.hashCode();
    }

    public String toString() {
        StringValue stringValue = this.f33193z;
        MediaType mediaType = this.f33191A;
        String str = this.f33192B;
        return "GuidedTourPage(titleKey=" + stringValue + ", mediaType=" + mediaType + ", mediaUrl=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeParcelable(this.f33193z, i2);
        parcel.writeString(this.f33191A.name());
        parcel.writeString(this.f33192B);
    }

    public GuidedTourPage(StringValue stringValue, MediaType mediaType, String str) {
        Intrinsics.i(stringValue, "titleKey");
        Intrinsics.i(mediaType, "mediaType");
        Intrinsics.i(str, "mediaUrl");
        this.f33193z = stringValue;
        this.f33191A = mediaType;
        this.f33192B = str;
    }
}
