package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class Preferences {

    @Metadata
    public static final class Key<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f20709a;

        public Key(String str) {
            Intrinsics.i(str, "name");
            this.f20709a = str;
        }

        public final String a() {
            return this.f20709a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                return Intrinsics.d(this.f20709a, ((Key) obj).f20709a);
            }
            return false;
        }

        public int hashCode() {
            return this.f20709a.hashCode();
        }

        public String toString() {
            return this.f20709a;
        }
    }

    @Metadata
    public static final class Pair<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Key f20710a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f20711b;

        public final Key a() {
            return this.f20710a;
        }

        public final Object b() {
            return this.f20711b;
        }
    }

    public abstract Map a();

    public abstract Object b(Key key);

    public final MutablePreferences c() {
        return new MutablePreferences(MapsKt.u(a()), false);
    }

    public final Preferences d() {
        return new MutablePreferences(MapsKt.u(a()), true);
    }
}
