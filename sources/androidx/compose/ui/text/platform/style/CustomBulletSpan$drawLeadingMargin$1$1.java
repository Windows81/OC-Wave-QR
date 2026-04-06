package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CustomBulletSpan$drawLeadingMargin$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f19010A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f19011B;
    public final /* synthetic */ Canvas C;
    public final /* synthetic */ Paint D;
    public final /* synthetic */ int E;
    public final /* synthetic */ float F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CustomBulletSpan f19012z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomBulletSpan$drawLeadingMargin$1$1(CustomBulletSpan customBulletSpan, long j2, int i2, Canvas canvas, Paint paint, int i3, float f2) {
        super(0);
        this.f19012z = customBulletSpan;
        this.f19010A = j2;
        this.f19011B = i2;
        this.C = canvas;
        this.D = paint;
        this.E = i3;
        this.F = f2;
    }

    public final void invoke() {
        BulletSpan_androidKt.d(this.f19012z.f19001a.a(this.f19010A, this.f19011B > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl, this.f19012z.f19007g), this.C, this.D, (float) this.E, this.F, this.f19011B);
    }
}
