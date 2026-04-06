package coil.request;

import coil.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class Parameters implements Iterable<Pair<? extends String, ? extends Entry>>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f23664A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final Parameters f23665B = new Parameters();

    /* renamed from: z  reason: collision with root package name */
    public final Map f23666z;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Map f23667a;

        public Builder(Parameters parameters) {
            this.f23667a = MapsKt.u(parameters.f23666z);
        }

        public final Parameters a() {
            return new Parameters(Collections.b(this.f23667a), (DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Entry {

        /* renamed from: a  reason: collision with root package name */
        public final Object f23668a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23669b;

        public final String a() {
            return this.f23669b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                return Intrinsics.d(this.f23668a, entry.f23668a) && Intrinsics.d(this.f23669b, entry.f23669b);
            }
        }

        public int hashCode() {
            Object obj = this.f23668a;
            int i2 = 0;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.f23669b;
            if (str != null) {
                i2 = str.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Entry(value=" + this.f23668a + ", memoryCacheKey=" + this.f23669b + ')';
        }
    }

    public /* synthetic */ Parameters(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Parameters) && Intrinsics.d(this.f23666z, ((Parameters) obj).f23666z);
    }

    public final Map g() {
        if (isEmpty()) {
            return MapsKt.h();
        }
        Map map = this.f23666z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String a2 = ((Entry) entry.getValue()).a();
            if (a2 != null) {
                linkedHashMap.put(entry.getKey(), a2);
            }
        }
        return linkedHashMap;
    }

    public final Builder h() {
        return new Builder(this);
    }

    public int hashCode() {
        return this.f23666z.hashCode();
    }

    public final boolean isEmpty() {
        return this.f23666z.isEmpty();
    }

    public Iterator iterator() {
        Map map = this.f23666z;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(TuplesKt.a((String) entry.getKey(), (Entry) entry.getValue()));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(entries=" + this.f23666z + ')';
    }

    public Parameters(Map map) {
        this.f23666z = map;
    }

    public Parameters() {
        this(MapsKt.h());
    }
}
