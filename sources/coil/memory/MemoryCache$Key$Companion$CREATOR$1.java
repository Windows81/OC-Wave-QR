package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import coil.memory.MemoryCache;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MemoryCache$Key$Companion$CREATOR$1 implements Parcelable.Creator<MemoryCache.Key> {
    /* renamed from: a */
    public MemoryCache.Key createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        Intrinsics.f(readString);
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            String readString2 = parcel.readString();
            Intrinsics.f(readString2);
            String readString3 = parcel.readString();
            Intrinsics.f(readString3);
            linkedHashMap.put(readString2, readString3);
        }
        return new MemoryCache.Key(readString, linkedHashMap);
    }

    /* renamed from: b */
    public MemoryCache.Key[] newArray(int i2) {
        return new MemoryCache.Key[i2];
    }
}
