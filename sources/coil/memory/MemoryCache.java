package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import coil.util.Utils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface MemoryCache {

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Context f23481a;

        /* renamed from: b  reason: collision with root package name */
        public double f23482b;

        /* renamed from: c  reason: collision with root package name */
        public int f23483c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f23484d = true;

        /* renamed from: e  reason: collision with root package name */
        public boolean f23485e = true;

        public Builder(Context context) {
            this.f23481a = context;
            this.f23482b = Utils.e(context);
        }

        public final MemoryCache a() {
            StrongMemoryCache strongMemoryCache;
            WeakMemoryCache realWeakMemoryCache = this.f23485e ? new RealWeakMemoryCache() : new EmptyWeakMemoryCache();
            if (this.f23484d) {
                double d2 = this.f23482b;
                int c2 = d2 > 0.0d ? Utils.c(this.f23481a, d2) : this.f23483c;
                strongMemoryCache = c2 > 0 ? new RealStrongMemoryCache(c2, realWeakMemoryCache) : new EmptyStrongMemoryCache(realWeakMemoryCache);
            } else {
                strongMemoryCache = new EmptyStrongMemoryCache(realWeakMemoryCache);
            }
            return new RealMemoryCache(strongMemoryCache, realWeakMemoryCache);
        }
    }

    @Metadata
    public static final class Value {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f23489a;

        /* renamed from: b  reason: collision with root package name */
        public final Map f23490b;

        public Value(Bitmap bitmap, Map map) {
            this.f23489a = bitmap;
            this.f23490b = map;
        }

        public final Bitmap a() {
            return this.f23489a;
        }

        public final Map b() {
            return this.f23490b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Value) {
                Value value = (Value) obj;
                return Intrinsics.d(this.f23489a, value.f23489a) && Intrinsics.d(this.f23490b, value.f23490b);
            }
        }

        public int hashCode() {
            return (this.f23489a.hashCode() * 31) + this.f23490b.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.f23489a + ", extras=" + this.f23490b + ')';
        }
    }

    Value a(Key key);

    void b(int i2);

    void c(Key key, Value value);

    @Metadata
    public static final class Key implements Parcelable {

        /* renamed from: B  reason: collision with root package name */
        public static final Companion f23486B = new Companion((DefaultConstructorMarker) null);
        @Deprecated
        public static final Parcelable.Creator<Key> CREATOR = new MemoryCache$Key$Companion$CREATOR$1();

        /* renamed from: A  reason: collision with root package name */
        public final Map f23487A;

        /* renamed from: z  reason: collision with root package name */
        public final String f23488z;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        public Key(String str, Map map) {
            this.f23488z = str;
            this.f23487A = map;
        }

        public static /* synthetic */ Key b(Key key, String str, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = key.f23488z;
            }
            if ((i2 & 2) != 0) {
                map = key.f23487A;
            }
            return key.a(str, map);
        }

        public final Key a(String str, Map map) {
            return new Key(str, map);
        }

        public final Map c() {
            return this.f23487A;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                return Intrinsics.d(this.f23488z, key.f23488z) && Intrinsics.d(this.f23487A, key.f23487A);
            }
        }

        public int hashCode() {
            return (this.f23488z.hashCode() * 31) + this.f23487A.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f23488z + ", extras=" + this.f23487A + ')';
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f23488z);
            parcel.writeInt(this.f23487A.size());
            for (Map.Entry entry : this.f23487A.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Key(String str, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? MapsKt.h() : map);
        }
    }
}
