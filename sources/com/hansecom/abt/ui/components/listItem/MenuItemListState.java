package com.hansecom.abt.ui.components.listItem;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class MenuItemListState implements Parcelable {
    public static final Parcelable.Creator<MenuItemListState> CREATOR = new Creator();

    /* renamed from: z  reason: collision with root package name */
    public final PersistentList f38494z;

    @Metadata
    public static final class Creator implements Parcelable.Creator<MenuItemListState> {
        /* renamed from: a */
        public final MenuItemListState createFromParcel(Parcel parcel) {
            Intrinsics.i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 != readInt; i2++) {
                arrayList.add(parcel.readParcelable(MenuItemListState.class.getClassLoader()));
            }
            return new MenuItemListState(ExtensionsKt.e(arrayList));
        }

        /* renamed from: b */
        public final MenuItemListState[] newArray(int i2) {
            return new MenuItemListState[i2];
        }
    }

    public MenuItemListState(PersistentList persistentList) {
        Intrinsics.i(persistentList, "items");
        this.f38494z = persistentList;
    }

    public final PersistentList a() {
        return this.f38494z;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MenuItemListState) && Intrinsics.d(this.f38494z, ((MenuItemListState) obj).f38494z);
    }

    public int hashCode() {
        return this.f38494z.hashCode();
    }

    public String toString() {
        PersistentList persistentList = this.f38494z;
        return "MenuItemListState(items=" + persistentList + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        PersistentList<Parcelable> persistentList = this.f38494z;
        parcel.writeInt(persistentList.size());
        for (Parcelable writeParcelable : persistentList) {
            parcel.writeParcelable(writeParcelable, i2);
        }
    }
}
