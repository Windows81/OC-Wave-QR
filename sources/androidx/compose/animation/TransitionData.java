package androidx.compose.animation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TransitionData {

    /* renamed from: a  reason: collision with root package name */
    public final Fade f2408a;

    /* renamed from: b  reason: collision with root package name */
    public final Slide f2409b;

    /* renamed from: c  reason: collision with root package name */
    public final ChangeSize f2410c;

    /* renamed from: d  reason: collision with root package name */
    public final Scale f2411d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2412e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f2413f;

    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z2, Map map) {
        this.f2408a = fade;
        this.f2409b = slide;
        this.f2410c = changeSize;
        this.f2411d = scale;
        this.f2412e = z2;
        this.f2413f = map;
    }

    public final ChangeSize a() {
        return this.f2410c;
    }

    public final Map b() {
        return this.f2413f;
    }

    public final Fade c() {
        return this.f2408a;
    }

    public final boolean d() {
        return this.f2412e;
    }

    public final Scale e() {
        return this.f2411d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return Intrinsics.d(this.f2408a, transitionData.f2408a) && Intrinsics.d(this.f2409b, transitionData.f2409b) && Intrinsics.d(this.f2410c, transitionData.f2410c) && Intrinsics.d(this.f2411d, transitionData.f2411d) && this.f2412e == transitionData.f2412e && Intrinsics.d(this.f2413f, transitionData.f2413f);
    }

    public final Slide f() {
        return this.f2409b;
    }

    public int hashCode() {
        Fade fade = this.f2408a;
        int i2 = 0;
        int hashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.f2409b;
        int hashCode2 = (hashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.f2410c;
        int hashCode3 = (hashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.f2411d;
        if (scale != null) {
            i2 = scale.hashCode();
        }
        return ((((hashCode3 + i2) * 31) + Boolean.hashCode(this.f2412e)) * 31) + this.f2413f.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.f2408a + ", slide=" + this.f2409b + ", changeSize=" + this.f2410c + ", scale=" + this.f2411d + ", hold=" + this.f2412e + ", effectsMap=" + this.f2413f + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TransitionData(androidx.compose.animation.Fade r5, androidx.compose.animation.Slide r6, androidx.compose.animation.ChangeSize r7, androidx.compose.animation.Scale r8, boolean r9, java.util.Map r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = r0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r8
        L_0x001c:
            r5 = r11 & 16
            if (r5 == 0) goto L_0x0021
            r9 = 0
        L_0x0021:
            r3 = r9
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002a
            java.util.Map r10 = kotlin.collections.MapsKt.h()
        L_0x002a:
            r11 = r10
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r2
            r9 = r0
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.TransitionData.<init>(androidx.compose.animation.Fade, androidx.compose.animation.Slide, androidx.compose.animation.ChangeSize, androidx.compose.animation.Scale, boolean, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
