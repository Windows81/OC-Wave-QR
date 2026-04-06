package okio;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TypedOptions<T> extends AbstractList<T> implements RandomAccess {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f43459B = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final List f43460A;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public int g() {
        return this.f43460A.size();
    }

    public Object get(int i2) {
        return this.f43460A.get(i2);
    }
}
