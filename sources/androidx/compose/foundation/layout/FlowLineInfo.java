package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class FlowLineInfo {

    /* renamed from: a  reason: collision with root package name */
    public int f3985a;

    /* renamed from: b  reason: collision with root package name */
    public int f3986b;

    /* renamed from: c  reason: collision with root package name */
    public float f3987c;

    /* renamed from: d  reason: collision with root package name */
    public float f3988d;

    public /* synthetic */ FlowLineInfo(int i2, int i3, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, f2, f3);
    }

    public final int a() {
        return this.f3985a;
    }

    public final float b() {
        return this.f3988d;
    }

    public final float c() {
        return this.f3987c;
    }

    public final int d() {
        return this.f3986b;
    }

    public final void e(int i2, int i3, float f2, float f3) {
        this.f3985a = i2;
        this.f3986b = i3;
        this.f3987c = f2;
        this.f3988d = f3;
    }

    public FlowLineInfo(int i2, int i3, float f2, float f3) {
        this.f3985a = i2;
        this.f3986b = i3;
        this.f3987c = f2;
        this.f3988d = f3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowLineInfo(int i2, int i3, float f2, float f3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 4) != 0 ? Dp.m((float) 0) : f2, (i4 & 8) != 0 ? Dp.m((float) 0) : f3, (DefaultConstructorMarker) null);
    }
}
