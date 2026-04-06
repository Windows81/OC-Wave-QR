package com.hansecom.abt.ui.components.fareCapping;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.R;
import com.hansecom.abt.data.domainExtensions.CappingPotExtKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import com.hansecom.mapi.models.CappingPot;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface FareCappingCardState extends Parcelable {

    /* renamed from: u  reason: collision with root package name */
    public static final Companion f38173u = Companion.f38174a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f38174a = new Companion();

        public final Concluded a(CappingPot cappingPot) {
            StringValue.ResourceId resourceId = new StringValue.ResourceId(R.string.U3);
            ZonedDateTime c2 = CappingPotExtKt.c(cappingPot);
            return new Concluded(R.drawable.f32997A, resourceId, c2 != null ? c2.toLocalDateTime() : null);
        }

        public final FareCappingCardState b(CappingPot cappingPot) {
            Intrinsics.i(cappingPot, "cappingPot");
            return CappingPotExtKt.d(cappingPot) ? a(cappingPot) : c(cappingPot);
        }

        public final InProgress c(CappingPot cappingPot) {
            String e2 = cappingPot.e();
            String str = "";
            if (e2 == null) {
                e2 = str;
            }
            StringValue d2 = StringValueKt.d(e2);
            String c2 = cappingPot.c();
            if (c2 != null) {
                str = c2;
            }
            StringValue d3 = StringValueKt.d(str);
            Integer b2 = cappingPot.b();
            float intValue = b2 != null ? ((float) b2.intValue()) / 100.0f : 0.0f;
            Integer a2 = cappingPot.a();
            return new InProgress(R.drawable.f33015q, d2, d3, intValue, a2 != null ? ((float) a2.intValue()) / 100.0f : 0.0f);
        }
    }

    @Metadata
    public static final class Concluded implements FareCappingCardState {
        public static final Parcelable.Creator<Concluded> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final StringValue f38175A;

        /* renamed from: B  reason: collision with root package name */
        public final LocalDateTime f38176B;

        /* renamed from: z  reason: collision with root package name */
        public final int f38177z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<Concluded> {
            /* renamed from: a */
            public final Concluded createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new Concluded(parcel.readInt(), (StringValue) parcel.readParcelable(Concluded.class.getClassLoader()), (LocalDateTime) parcel.readSerializable());
            }

            /* renamed from: b */
            public final Concluded[] newArray(int i2) {
                return new Concluded[i2];
            }
        }

        public Concluded(int i2, StringValue stringValue, LocalDateTime localDateTime) {
            Intrinsics.i(stringValue, "name");
            this.f38177z = i2;
            this.f38175A = stringValue;
            this.f38176B = localDateTime;
        }

        public final LocalDateTime a() {
            return this.f38176B;
        }

        public final int b() {
            return this.f38177z;
        }

        public final StringValue c() {
            return this.f38175A;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Concluded)) {
                return false;
            }
            Concluded concluded = (Concluded) obj;
            return this.f38177z == concluded.f38177z && Intrinsics.d(this.f38175A, concluded.f38175A) && Intrinsics.d(this.f38176B, concluded.f38176B);
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f38177z) * 31) + this.f38175A.hashCode()) * 31;
            LocalDateTime localDateTime = this.f38176B;
            return hashCode + (localDateTime == null ? 0 : localDateTime.hashCode());
        }

        public String toString() {
            int i2 = this.f38177z;
            StringValue stringValue = this.f38175A;
            LocalDateTime localDateTime = this.f38176B;
            return "Concluded(iconResId=" + i2 + ", name=" + stringValue + ", expiryDate=" + localDateTime + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f38177z);
            parcel.writeParcelable(this.f38175A, i2);
            parcel.writeSerializable(this.f38176B);
        }
    }

    @Metadata
    public static final class InProgress implements FareCappingCardState {
        public static final Parcelable.Creator<InProgress> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final StringValue f38178A;

        /* renamed from: B  reason: collision with root package name */
        public final StringValue f38179B;
        public final float C;
        public final float D;

        /* renamed from: z  reason: collision with root package name */
        public final int f38180z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<InProgress> {
            /* renamed from: a */
            public final InProgress createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                Class<InProgress> cls = InProgress.class;
                return new InProgress(parcel.readInt(), (StringValue) parcel.readParcelable(cls.getClassLoader()), (StringValue) parcel.readParcelable(cls.getClassLoader()), parcel.readFloat(), parcel.readFloat());
            }

            /* renamed from: b */
            public final InProgress[] newArray(int i2) {
                return new InProgress[i2];
            }
        }

        public InProgress(int i2, StringValue stringValue, StringValue stringValue2, float f2, float f3) {
            Intrinsics.i(stringValue, "name");
            Intrinsics.i(stringValue2, "prize");
            this.f38180z = i2;
            this.f38178A = stringValue;
            this.f38179B = stringValue2;
            this.C = f2;
            this.D = f3;
        }

        public final int a() {
            return this.f38180z;
        }

        public final StringValue b() {
            return this.f38178A;
        }

        public final StringValue c() {
            return this.f38179B;
        }

        public final float d() {
            return this.D;
        }

        public final int describeContents() {
            return 0;
        }

        public final float e() {
            return this.C;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InProgress)) {
                return false;
            }
            InProgress inProgress = (InProgress) obj;
            return this.f38180z == inProgress.f38180z && Intrinsics.d(this.f38178A, inProgress.f38178A) && Intrinsics.d(this.f38179B, inProgress.f38179B) && Float.compare(this.C, inProgress.C) == 0 && Float.compare(this.D, inProgress.D) == 0;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f38180z) * 31) + this.f38178A.hashCode()) * 31) + this.f38179B.hashCode()) * 31) + Float.hashCode(this.C)) * 31) + Float.hashCode(this.D);
        }

        public String toString() {
            int i2 = this.f38180z;
            StringValue stringValue = this.f38178A;
            StringValue stringValue2 = this.f38179B;
            float f2 = this.C;
            float f3 = this.D;
            return "InProgress(iconResId=" + i2 + ", name=" + stringValue + ", prize=" + stringValue2 + ", value=" + f2 + ", totalValue=" + f3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f38180z);
            parcel.writeParcelable(this.f38178A, i2);
            parcel.writeParcelable(this.f38179B, i2);
            parcel.writeFloat(this.C);
            parcel.writeFloat(this.D);
        }
    }
}
