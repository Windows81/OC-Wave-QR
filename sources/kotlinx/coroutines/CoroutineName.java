package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CoroutineName extends AbstractCoroutineContextElement {

    /* renamed from: B  reason: collision with root package name */
    public static final Key f41383B = new Key((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final String f41384A;

    @Metadata
    public static final class Key implements CoroutineContext.Key<CoroutineName> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Key() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineName) && Intrinsics.d(this.f41384A, ((CoroutineName) obj).f41384A);
    }

    public int hashCode() {
        return this.f41384A.hashCode();
    }

    public final String o0() {
        return this.f41384A;
    }

    public String toString() {
        return "CoroutineName(" + this.f41384A + ')';
    }
}
