package com.hansecom.abt.ui.components.historyItem;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.data.domainExtensions.TransactionExtKt;
import com.hansecom.mapi.models.Transaction;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HistoryItemState implements Parcelable {
    public static final Parcelable.Creator<HistoryItemState> CREATOR = new Creator();
    public static final Companion F = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final String f38418A;

    /* renamed from: B  reason: collision with root package name */
    public final LocalTime f38419B;
    public final BigDecimal C;
    public final String D;
    public final String E;

    /* renamed from: z  reason: collision with root package name */
    public final String f38420z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HistoryItemState a(Transaction transaction) {
            Intrinsics.i(transaction, "transaction");
            String f2 = transaction.f();
            String str = f2 == null ? "" : f2;
            String a2 = transaction.a();
            String str2 = a2 == null ? "" : a2;
            ZonedDateTime a3 = TransactionExtKt.a(transaction);
            LocalTime localTime = a3 != null ? a3.toLocalTime() : null;
            String c2 = transaction.c();
            BigDecimal bigDecimal = c2 != null ? new BigDecimal(c2) : BigDecimal.ZERO;
            Intrinsics.f(bigDecimal);
            String b2 = transaction.b();
            String str3 = b2 == null ? "" : b2;
            String d2 = transaction.d();
            if (d2 == null) {
                d2 = "";
            }
            return new HistoryItemState(str, str2, localTime, bigDecimal, str3, d2);
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Creator implements Parcelable.Creator<HistoryItemState> {
        /* renamed from: a */
        public final HistoryItemState createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            return new HistoryItemState(parcel.readString(), parcel.readString(), (LocalTime) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final HistoryItemState[] newArray(int i2) {
            return new HistoryItemState[i2];
        }
    }

    public HistoryItemState(String str, String str2, LocalTime localTime, BigDecimal bigDecimal, String str3, String str4) {
        Intrinsics.i(str, "title");
        Intrinsics.i(str2, "description");
        Intrinsics.i(bigDecimal, "price");
        Intrinsics.i(str3, "line");
        Intrinsics.i(str4, "stop");
        this.f38420z = str;
        this.f38418A = str2;
        this.f38419B = localTime;
        this.C = bigDecimal;
        this.D = str3;
        this.E = str4;
    }

    public final String a() {
        return this.f38418A;
    }

    public final String b() {
        return this.D;
    }

    public final BigDecimal c() {
        return this.C;
    }

    public final String d() {
        return this.E;
    }

    public final int describeContents() {
        return 0;
    }

    public final LocalTime e() {
        return this.f38419B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryItemState)) {
            return false;
        }
        HistoryItemState historyItemState = (HistoryItemState) obj;
        return Intrinsics.d(this.f38420z, historyItemState.f38420z) && Intrinsics.d(this.f38418A, historyItemState.f38418A) && Intrinsics.d(this.f38419B, historyItemState.f38419B) && Intrinsics.d(this.C, historyItemState.C) && Intrinsics.d(this.D, historyItemState.D) && Intrinsics.d(this.E, historyItemState.E);
    }

    public final String f() {
        return this.f38420z;
    }

    public int hashCode() {
        int hashCode = ((this.f38420z.hashCode() * 31) + this.f38418A.hashCode()) * 31;
        LocalTime localTime = this.f38419B;
        return ((((((hashCode + (localTime == null ? 0 : localTime.hashCode())) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode();
    }

    public String toString() {
        String str = this.f38420z;
        String str2 = this.f38418A;
        LocalTime localTime = this.f38419B;
        BigDecimal bigDecimal = this.C;
        String str3 = this.D;
        String str4 = this.E;
        return "HistoryItemState(title=" + str + ", description=" + str2 + ", time=" + localTime + ", price=" + bigDecimal + ", line=" + str3 + ", stop=" + str4 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeString(this.f38420z);
        parcel.writeString(this.f38418A);
        parcel.writeSerializable(this.f38419B);
        parcel.writeSerializable(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HistoryItemState(String str, String str2, LocalTime localTime, BigDecimal bigDecimal, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, localTime, bigDecimal, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4);
    }
}
