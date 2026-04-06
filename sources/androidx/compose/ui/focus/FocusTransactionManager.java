package androidx.compose.ui.focus;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class FocusTransactionManager {

    /* renamed from: a  reason: collision with root package name */
    public final MutableScatterMap f15825a = ScatterMapKt.c();

    /* renamed from: b  reason: collision with root package name */
    public final MutableVector f15826b = new MutableVector(new Function0[16], 0);

    /* renamed from: c  reason: collision with root package name */
    public boolean f15827c;

    /* renamed from: d  reason: collision with root package name */
    public int f15828d;

    public final void e() {
        this.f15827c = true;
    }

    public final void f() {
        this.f15825a.k();
        this.f15827c = false;
        MutableVector mutableVector = this.f15826b;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        for (int i2 = 0; i2 < p2; i2++) {
            ((Function0) objArr[i2]).invoke();
        }
        this.f15826b.l();
    }

    public final void g() {
        MutableScatterMap mutableScatterMap = this.f15825a;
        Object[] objArr = mutableScatterMap.f1960b;
        long[] jArr = mutableScatterMap.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            ((FocusTargetNode) objArr[(i2 << 3) + i4]).d3();
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        this.f15825a.k();
        this.f15827c = false;
        this.f15826b.l();
    }

    public final int h() {
        return this.f15828d;
    }

    public final boolean i() {
        return this.f15827c;
    }

    public final FocusStateImpl j(FocusTargetNode focusTargetNode) {
        if (!ComposeUiFlags.f15479g) {
            return (FocusStateImpl) this.f15825a.e(focusTargetNode);
        }
        throw new IllegalStateException("uncommittedFocusState must not be accessed when isTrackFocusEnabled is on");
    }

    public final void k(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl) {
        if (!ComposeUiFlags.f15479g) {
            FocusStateImpl focusStateImpl2 = (FocusStateImpl) this.f15825a.e(focusTargetNode);
            if (focusStateImpl2 == null) {
                focusStateImpl2 = FocusStateImpl.Inactive;
            }
            if (focusStateImpl2 != focusStateImpl) {
                this.f15828d++;
            }
            MutableScatterMap mutableScatterMap = this.f15825a;
            if (focusStateImpl != null) {
                mutableScatterMap.x(focusTargetNode, focusStateImpl);
            } else {
                InlineClassHelperKt.d("requires a non-null focus state");
                throw new KotlinNothingValueException();
            }
        }
    }
}
