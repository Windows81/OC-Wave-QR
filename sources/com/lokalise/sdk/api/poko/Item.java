package com.lokalise.sdk.api.poko;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Item {
    @SerializedName("key")
    @Expose(deserialize = true, serialize = false)
    private final String key;
    @SerializedName("type")
    @Expose(deserialize = true, serialize = false)
    private final int type;
    @SerializedName("value")
    @Expose(deserialize = true, serialize = false)
    private final String value;

    public Item(int i2, String str, String str2) {
        Intrinsics.i(str, "key");
        Intrinsics.i(str2, "value");
        this.type = i2;
        this.key = str;
        this.value = str2;
    }

    public static /* synthetic */ Item copy$default(Item item, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = item.type;
        }
        if ((i3 & 2) != 0) {
            str = item.key;
        }
        if ((i3 & 4) != 0) {
            str2 = item.value;
        }
        return item.copy(i2, str, str2);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.value;
    }

    public final Item copy(int i2, String str, String str2) {
        Intrinsics.i(str, "key");
        Intrinsics.i(str2, "value");
        return new Item(i2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return this.type == item.type && Intrinsics.d(this.key, item.key) && Intrinsics.d(this.value, item.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final int getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.type) * 31) + this.key.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        int i2 = this.type;
        String str = this.key;
        String str2 = this.value;
        return "Item(type=" + i2 + ", key=" + str + ", value=" + str2 + ")";
    }
}
