package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MultiValueMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class NestedContentMap {

    /* renamed from: a  reason: collision with root package name */
    public final MutableScatterMap f14736a = MultiValueMap.e((MutableScatterMap) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public final MutableScatterMap f14737b = MultiValueMap.e((MutableScatterMap) null, 1, (DefaultConstructorMarker) null);

    public static final boolean g(MovableContentStateReference movableContentStateReference, NestedMovableContent nestedMovableContent) {
        return Intrinsics.d(nestedMovableContent.a(), movableContentStateReference);
    }

    public final void b(MovableContent movableContent, NestedMovableContent nestedMovableContent) {
        MultiValueMap.a(this.f14736a, movableContent, nestedMovableContent);
        MultiValueMap.a(this.f14737b, nestedMovableContent.a(), movableContent);
    }

    public final void c() {
        MultiValueMap.c(this.f14736a);
        MultiValueMap.c(this.f14737b);
    }

    public final boolean d(MovableContent movableContent) {
        return MultiValueMap.f(this.f14736a, movableContent);
    }

    public final NestedMovableContent e(MovableContent movableContent) {
        NestedMovableContent nestedMovableContent = (NestedMovableContent) MultiValueMap.m(this.f14736a, movableContent);
        if (MultiValueMap.j(this.f14736a)) {
            MultiValueMap.c(this.f14737b);
        }
        return nestedMovableContent;
    }

    public final void f(MovableContentStateReference movableContentStateReference) {
        Object e2 = this.f14737b.e(movableContentStateReference);
        if (e2 == null) {
            return;
        }
        if (e2 instanceof MutableObjectList) {
            ObjectList objectList = (ObjectList) e2;
            Object[] objArr = objectList.f1937a;
            int i2 = objectList.f1938b;
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj = objArr[i3];
                Intrinsics.g(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                MultiValueMap.n(this.f14736a, (MovableContent) obj, new o(movableContentStateReference));
            }
            return;
        }
        Intrinsics.g(e2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        MultiValueMap.n(this.f14736a, (MovableContent) e2, new o(movableContentStateReference));
    }
}
