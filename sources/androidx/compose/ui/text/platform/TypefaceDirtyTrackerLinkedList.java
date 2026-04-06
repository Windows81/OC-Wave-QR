package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class TypefaceDirtyTrackerLinkedList {

    /* renamed from: a  reason: collision with root package name */
    public final State f18992a;

    /* renamed from: b  reason: collision with root package name */
    public final TypefaceDirtyTrackerLinkedList f18993b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f18994c;

    public TypefaceDirtyTrackerLinkedList(State state, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList) {
        this.f18992a = state;
        this.f18993b = typefaceDirtyTrackerLinkedList;
        this.f18994c = state.getValue();
    }

    public final Typeface a() {
        Object obj = this.f18994c;
        Intrinsics.g(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r2.f18993b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r2 = this;
            androidx.compose.runtime.State r0 = r2.f18992a
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r1 = r2.f18994c
            if (r0 != r1) goto L_0x0017
            androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList r0 = r2.f18993b
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.TypefaceDirtyTrackerLinkedList.b():boolean");
    }
}
