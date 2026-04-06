package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DeviceRenderNodeData {

    /* renamed from: a  reason: collision with root package name */
    public final long f17732a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17733b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17734c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17735d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17736e;

    /* renamed from: f  reason: collision with root package name */
    public final int f17737f;

    /* renamed from: g  reason: collision with root package name */
    public final int f17738g;

    /* renamed from: h  reason: collision with root package name */
    public float f17739h;

    /* renamed from: i  reason: collision with root package name */
    public float f17740i;

    /* renamed from: j  reason: collision with root package name */
    public float f17741j;

    /* renamed from: k  reason: collision with root package name */
    public float f17742k;

    /* renamed from: l  reason: collision with root package name */
    public float f17743l;

    /* renamed from: m  reason: collision with root package name */
    public int f17744m;

    /* renamed from: n  reason: collision with root package name */
    public int f17745n;

    /* renamed from: o  reason: collision with root package name */
    public float f17746o;

    /* renamed from: p  reason: collision with root package name */
    public float f17747p;

    /* renamed from: q  reason: collision with root package name */
    public float f17748q;

    /* renamed from: r  reason: collision with root package name */
    public float f17749r;

    /* renamed from: s  reason: collision with root package name */
    public float f17750s;

    /* renamed from: t  reason: collision with root package name */
    public float f17751t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f17752u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f17753v;

    /* renamed from: w  reason: collision with root package name */
    public float f17754w;

    /* renamed from: x  reason: collision with root package name */
    public RenderEffect f17755x;

    /* renamed from: y  reason: collision with root package name */
    public int f17756y;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
        return this.f17732a == deviceRenderNodeData.f17732a && this.f17733b == deviceRenderNodeData.f17733b && this.f17734c == deviceRenderNodeData.f17734c && this.f17735d == deviceRenderNodeData.f17735d && this.f17736e == deviceRenderNodeData.f17736e && this.f17737f == deviceRenderNodeData.f17737f && this.f17738g == deviceRenderNodeData.f17738g && Float.compare(this.f17739h, deviceRenderNodeData.f17739h) == 0 && Float.compare(this.f17740i, deviceRenderNodeData.f17740i) == 0 && Float.compare(this.f17741j, deviceRenderNodeData.f17741j) == 0 && Float.compare(this.f17742k, deviceRenderNodeData.f17742k) == 0 && Float.compare(this.f17743l, deviceRenderNodeData.f17743l) == 0 && this.f17744m == deviceRenderNodeData.f17744m && this.f17745n == deviceRenderNodeData.f17745n && Float.compare(this.f17746o, deviceRenderNodeData.f17746o) == 0 && Float.compare(this.f17747p, deviceRenderNodeData.f17747p) == 0 && Float.compare(this.f17748q, deviceRenderNodeData.f17748q) == 0 && Float.compare(this.f17749r, deviceRenderNodeData.f17749r) == 0 && Float.compare(this.f17750s, deviceRenderNodeData.f17750s) == 0 && Float.compare(this.f17751t, deviceRenderNodeData.f17751t) == 0 && this.f17752u == deviceRenderNodeData.f17752u && this.f17753v == deviceRenderNodeData.f17753v && Float.compare(this.f17754w, deviceRenderNodeData.f17754w) == 0 && Intrinsics.d(this.f17755x, deviceRenderNodeData.f17755x) && CompositingStrategy.f(this.f17756y, deviceRenderNodeData.f17756y);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.f17732a) * 31) + Integer.hashCode(this.f17733b)) * 31) + Integer.hashCode(this.f17734c)) * 31) + Integer.hashCode(this.f17735d)) * 31) + Integer.hashCode(this.f17736e)) * 31) + Integer.hashCode(this.f17737f)) * 31) + Integer.hashCode(this.f17738g)) * 31) + Float.hashCode(this.f17739h)) * 31) + Float.hashCode(this.f17740i)) * 31) + Float.hashCode(this.f17741j)) * 31) + Float.hashCode(this.f17742k)) * 31) + Float.hashCode(this.f17743l)) * 31) + Integer.hashCode(this.f17744m)) * 31) + Integer.hashCode(this.f17745n)) * 31) + Float.hashCode(this.f17746o)) * 31) + Float.hashCode(this.f17747p)) * 31) + Float.hashCode(this.f17748q)) * 31) + Float.hashCode(this.f17749r)) * 31) + Float.hashCode(this.f17750s)) * 31) + Float.hashCode(this.f17751t)) * 31) + Boolean.hashCode(this.f17752u)) * 31) + Boolean.hashCode(this.f17753v)) * 31) + Float.hashCode(this.f17754w)) * 31;
        RenderEffect renderEffect = this.f17755x;
        return ((hashCode + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + CompositingStrategy.g(this.f17756y);
    }

    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.f17732a + ", left=" + this.f17733b + ", top=" + this.f17734c + ", right=" + this.f17735d + ", bottom=" + this.f17736e + ", width=" + this.f17737f + ", height=" + this.f17738g + ", scaleX=" + this.f17739h + ", scaleY=" + this.f17740i + ", translationX=" + this.f17741j + ", translationY=" + this.f17742k + ", elevation=" + this.f17743l + ", ambientShadowColor=" + this.f17744m + ", spotShadowColor=" + this.f17745n + ", rotationZ=" + this.f17746o + ", rotationX=" + this.f17747p + ", rotationY=" + this.f17748q + ", cameraDistance=" + this.f17749r + ", pivotX=" + this.f17750s + ", pivotY=" + this.f17751t + ", clipToOutline=" + this.f17752u + ", clipToBounds=" + this.f17753v + ", alpha=" + this.f17754w + ", renderEffect=" + this.f17755x + ", compositingStrategy=" + CompositingStrategy.h(this.f17756y) + ')';
    }
}
