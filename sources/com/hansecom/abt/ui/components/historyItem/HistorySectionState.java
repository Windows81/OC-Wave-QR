package com.hansecom.abt.ui.components.historyItem;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class HistorySectionState implements Parcelable {
    public static final Parcelable.Creator<HistorySectionState> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final PersistentList f38422A;

    /* renamed from: z  reason: collision with root package name */
    public final LocalDate f38423z;

    @Metadata
    public static final class Creator implements Parcelable.Creator<HistorySectionState> {
        /* renamed from: a */
        public final HistorySectionState createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 != readInt; i2++) {
                arrayList.add(HistoryItemState.CREATOR.createFromParcel(parcel));
            }
            return new HistorySectionState(localDate, ExtensionsKt.e(arrayList));
        }

        /* renamed from: b */
        public final HistorySectionState[] newArray(int i2) {
            return new HistorySectionState[i2];
        }
    }

    public HistorySectionState(LocalDate localDate, PersistentList persistentList) {
        Intrinsics.i(localDate, "date");
        Intrinsics.i(persistentList, "elements");
        this.f38423z = localDate;
        this.f38422A = persistentList;
    }

    public final LocalDate a() {
        return this.f38423z;
    }

    public final PersistentList b() {
        return this.f38422A;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistorySectionState)) {
            return false;
        }
        HistorySectionState historySectionState = (HistorySectionState) obj;
        return Intrinsics.d(this.f38423z, historySectionState.f38423z) && Intrinsics.d(this.f38422A, historySectionState.f38422A);
    }

    public int hashCode() {
        return (this.f38423z.hashCode() * 31) + this.f38422A.hashCode();
    }

    public String toString() {
        LocalDate localDate = this.f38423z;
        PersistentList persistentList = this.f38422A;
        return "HistorySectionState(date=" + localDate + ", elements=" + persistentList + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeSerializable(this.f38423z);
        PersistentList<HistoryItemState> persistentList = this.f38422A;
        parcel.writeInt(persistentList.size());
        for (HistoryItemState writeToParcel : persistentList) {
            writeToParcel.writeToParcel(parcel, i2);
        }
    }
}
