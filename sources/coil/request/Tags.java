package coil.request;

import coil.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Tags {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f23680b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final Tags f23681c = new Tags(MapsKt.h());

    /* renamed from: a  reason: collision with root package name */
    public final Map f23682a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Tags a(Map map) {
            return new Tags(Collections.b(map), (DefaultConstructorMarker) null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ Tags(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map a() {
        return this.f23682a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Tags) && Intrinsics.d(this.f23682a, ((Tags) obj).f23682a);
    }

    public int hashCode() {
        return this.f23682a.hashCode();
    }

    public String toString() {
        return "Tags(tags=" + this.f23682a + ')';
    }

    public Tags(Map map) {
        this.f23682a = map;
    }
}
