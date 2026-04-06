package androidx.compose.animation.core;

import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {

    /* renamed from: a  reason: collision with root package name */
    public final KeyframesSpecConfig f2608a;

    @Metadata
    public static final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {

        /* renamed from: c  reason: collision with root package name */
        public int f2609c;

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, easing, i2);
        }

        public final int d() {
            return this.f2609c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KeyframeEntity)) {
                return false;
            }
            KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
            return Intrinsics.d(keyframeEntity.b(), b()) && Intrinsics.d(keyframeEntity.a(), a()) && ArcMode.d(keyframeEntity.f2609c, this.f2609c);
        }

        public int hashCode() {
            Object b2 = b();
            return ((((b2 != null ? b2.hashCode() : 0) * 31) + ArcMode.e(this.f2609c)) * 31) + a().hashCode();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i3 & 2) != 0 ? EasingKt.e() : easing, (i3 & 4) != 0 ? ArcMode.f2493b.a() : i2, (DefaultConstructorMarker) null);
        }

        public KeyframeEntity(Object obj, Easing easing, int i2) {
            super(obj, easing, (DefaultConstructorMarker) null);
            this.f2609c = i2;
        }
    }

    @Metadata
    public static final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>> {
        public KeyframesSpecConfig() {
            super((DefaultConstructorMarker) null);
        }

        public KeyframeEntity f(Object obj, int i2) {
            KeyframeEntity keyframeEntity = new KeyframeEntity(obj, (Easing) null, 0, 6, (DefaultConstructorMarker) null);
            c().r(i2, keyframeEntity);
            return keyframeEntity;
        }
    }

    public KeyframesSpec(KeyframesSpecConfig keyframesSpecConfig) {
        this.f2608a = keyframesSpecConfig;
    }

    /* renamed from: f */
    public VectorizedKeyframesSpec a(TwoWayConverter twoWayConverter) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i2;
        MutableIntList mutableIntList = new MutableIntList(this.f2608a.c().d() + 2);
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(this.f2608a.c().d());
        MutableIntObjectMap c2 = this.f2608a.c();
        int[] iArr3 = c2.f1793b;
        Object[] objArr = c2.f1794c;
        long[] jArr3 = c2.f1792a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr3[i3];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr3[i7];
                            KeyframeEntity keyframeEntity = (KeyframeEntity) objArr[i7];
                            mutableIntList.k(i8);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            mutableIntObjectMap.r(i8, new VectorizedKeyframeSpecElementInfo((AnimationVector) twoWayConverter.a().invoke(keyframeEntity.b()), keyframeEntity.a(), keyframeEntity.d(), (DefaultConstructorMarker) null));
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i2 = i4;
                        }
                        j2 >>= i2;
                        i6++;
                        i4 = i2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i5 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.f2608a.c().a(0)) {
            mutableIntList.j(0, 0);
        }
        if (!this.f2608a.c().a(this.f2608a.b())) {
            mutableIntList.k(this.f2608a.b());
        }
        mutableIntList.r();
        return new VectorizedKeyframesSpec(mutableIntList, mutableIntObjectMap, this.f2608a.b(), this.f2608a.a(), EasingKt.e(), ArcMode.f2493b.a(), (DefaultConstructorMarker) null);
    }
}
