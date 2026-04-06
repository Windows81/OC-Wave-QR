package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class CreationExtras {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f22062b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Map f22063a = new LinkedHashMap();

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Empty extends CreationExtras {

        /* renamed from: c  reason: collision with root package name */
        public static final Empty f22064c = new Empty();

        public Object a(Key key) {
            Intrinsics.i(key, "key");
            return null;
        }
    }

    @Metadata
    public interface Key<T> {
    }

    public abstract Object a(Key key);

    public final Map b() {
        return this.f22063a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CreationExtras) && Intrinsics.d(this.f22063a, ((CreationExtras) obj).f22063a);
    }

    public int hashCode() {
        return this.f22063a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f22063a + ')';
    }
}
