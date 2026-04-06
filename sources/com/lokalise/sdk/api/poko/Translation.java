package com.lokalise.sdk.api.poko;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Translation {
    @SerializedName("is_default")
    @Expose(deserialize = true, serialize = false)
    private final int _default;
    @SerializedName("iso")
    @Expose(deserialize = true, serialize = false)
    private final String iso;
    @SerializedName("items")
    @Expose(deserialize = true, serialize = false)
    private final List<Item> items;

    public Translation(String str, List<Item> list, int i2) {
        Intrinsics.i(str, "iso");
        Intrinsics.i(list, "items");
        this.iso = str;
        this.items = list;
        this._default = i2;
    }

    private final int component3() {
        return this._default;
    }

    public static /* synthetic */ Translation copy$default(Translation translation, String str, List<Item> list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = translation.iso;
        }
        if ((i3 & 2) != 0) {
            list = translation.items;
        }
        if ((i3 & 4) != 0) {
            i2 = translation._default;
        }
        return translation.copy(str, list, i2);
    }

    public final String component1() {
        return this.iso;
    }

    public final List<Item> component2() {
        return this.items;
    }

    public final Translation copy(String str, List<Item> list, int i2) {
        Intrinsics.i(str, "iso");
        Intrinsics.i(list, "items");
        return new Translation(str, list, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Translation)) {
            return false;
        }
        Translation translation = (Translation) obj;
        return Intrinsics.d(this.iso, translation.iso) && Intrinsics.d(this.items, translation.items) && this._default == translation._default;
    }

    public final String getIso() {
        return this.iso;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public int hashCode() {
        return (((this.iso.hashCode() * 31) + this.items.hashCode()) * 31) + Integer.hashCode(this._default);
    }

    public final boolean isDefault() {
        return this._default == 1;
    }

    public String toString() {
        String str = this.iso;
        List<Item> list = this.items;
        int i2 = this._default;
        return "Translation(iso=" + str + ", items=" + list + ", _default=" + i2 + ")";
    }
}
