package com.hansecom.abt.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class InstitutionState implements Parcelable {
    public static final Parcelable.Creator<InstitutionState> CREATOR = new Creator();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final String f34172A;

    /* renamed from: B  reason: collision with root package name */
    public final String f34173B;
    public final String C;
    public final String D;

    /* renamed from: z  reason: collision with root package name */
    public final int f34174z;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<InstitutionState> serializer() {
            return InstitutionState$$serializer.f34175a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    public static final class Creator implements Parcelable.Creator<InstitutionState> {
        /* renamed from: a */
        public final InstitutionState createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            return new InstitutionState(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final InstitutionState[] newArray(int i2) {
            return new InstitutionState[i2];
        }
    }

    public /* synthetic */ InstitutionState(int i2, int i3, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, InstitutionState$$serializer.f34175a.a());
        }
        this.f34174z = i3;
        this.f34172A = str;
        if ((i2 & 4) == 0) {
            this.f34173B = null;
        } else {
            this.f34173B = str2;
        }
        if ((i2 & 8) == 0) {
            this.C = null;
        } else {
            this.C = str3;
        }
        if ((i2 & 16) == 0) {
            this.D = null;
        } else {
            this.D = str4;
        }
    }

    public static final /* synthetic */ void f(InstitutionState institutionState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.r(serialDescriptor, 0, institutionState.f34174z);
        compositeEncoder.t(serialDescriptor, 1, institutionState.f34172A);
        if (compositeEncoder.w(serialDescriptor, 2) || institutionState.f34173B != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, institutionState.f34173B);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || institutionState.C != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, institutionState.C);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || institutionState.D != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, institutionState.D);
        }
    }

    public final int a() {
        return this.f34174z;
    }

    public final String b() {
        return this.D;
    }

    public final String c() {
        return this.f34173B;
    }

    public final String d() {
        return this.f34172A;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstitutionState)) {
            return false;
        }
        InstitutionState institutionState = (InstitutionState) obj;
        return this.f34174z == institutionState.f34174z && Intrinsics.d(this.f34172A, institutionState.f34172A) && Intrinsics.d(this.f34173B, institutionState.f34173B) && Intrinsics.d(this.C, institutionState.C) && Intrinsics.d(this.D, institutionState.D);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f34174z) * 31) + this.f34172A.hashCode()) * 31;
        String str = this.f34173B;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.C;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.D;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        int i2 = this.f34174z;
        String str = this.f34172A;
        String str2 = this.f34173B;
        String str3 = this.C;
        String str4 = this.D;
        return "InstitutionState(id=" + i2 + ", name=" + str + ", institutionType=" + str2 + ", phoneNumber=" + str3 + ", institutionAddress=" + str4 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeInt(this.f34174z);
        parcel.writeString(this.f34172A);
        parcel.writeString(this.f34173B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
    }

    public InstitutionState(int i2, String str, String str2, String str3, String str4) {
        Intrinsics.i(str, "name");
        this.f34174z = i2;
        this.f34172A = str;
        this.f34173B = str2;
        this.C = str3;
        this.D = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstitutionState(int i2, String str, String str2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4);
    }
}
