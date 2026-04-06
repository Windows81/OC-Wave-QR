package androidx.compose.material3.internal;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.compose.material3.internal.n  reason: case insensitive filesystem */
public final /* synthetic */ class C0141n implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f12443A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnchoredDragScope f12444z;

    public /* synthetic */ C0141n(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef) {
        this.f12444z = anchoredDragScope;
        this.f12443A = floatRef;
    }

    public final Object m(Object obj, Object obj2) {
        return AnchoredDraggableKt$animateTo$2.C(this.f12444z, this.f12443A, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
    }
}
