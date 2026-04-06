package kotlinx.android.extensions;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public enum CacheImplementation {
    SPARSE_ARRAY,
    HASH_MAP,
    NO_CACHE;
    

    /* renamed from: A  reason: collision with root package name */
    public static final CacheImplementation f41231A = null;

    /* renamed from: z  reason: collision with root package name */
    public static final Companion f41233z = null;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        CacheImplementation cacheImplementation;
        CacheImplementation[] d2;
        F = EnumEntriesKt.a(d2);
        f41233z = new Companion((DefaultConstructorMarker) null);
        f41231A = cacheImplementation;
    }
}
