package androidx.compose.animation.core;

import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframesSpec;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata
public final class KeyframesWithSplineSpec<T> implements DurationBasedAnimationSpec<T> {

    /* renamed from: a  reason: collision with root package name */
    public final KeyframesWithSplineSpecConfig f2613a;

    /* renamed from: b  reason: collision with root package name */
    public float f2614b;

    @Metadata
    public static final class KeyframesWithSplineSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframesSpec.KeyframeEntity<T>> {
    }

    public VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter) {
        Object[] objArr;
        int[] iArr;
        Object[] objArr2;
        int[] iArr2;
        int i2;
        MutableIntObjectMap c2 = this.f2613a.c();
        MutableIntList mutableIntList = new MutableIntList(c2.d() + 2);
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(c2.d());
        int[] iArr3 = c2.f1793b;
        Object[] objArr3 = c2.f1794c;
        long[] jArr = c2.f1792a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr3[i7];
                            KeyframesSpec.KeyframeEntity keyframeEntity = (KeyframesSpec.KeyframeEntity) objArr3[i7];
                            mutableIntList.k(i8);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            mutableIntObjectMap.r(i8, new Pair(twoWayConverter.a().invoke(keyframeEntity.b()), keyframeEntity.a()));
                            i2 = 8;
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i2 = i4;
                        }
                        j2 >>= i2;
                        i6++;
                        i4 = i2;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i5 != i4) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!c2.a(0)) {
            mutableIntList.j(0, 0);
        }
        if (!c2.a(this.f2613a.b())) {
            mutableIntList.k(this.f2613a.b());
        }
        mutableIntList.r();
        return new VectorizedMonoSplineKeyframesSpec(mutableIntList, mutableIntObjectMap, this.f2613a.b(), this.f2613a.a(), this.f2614b);
    }
}
