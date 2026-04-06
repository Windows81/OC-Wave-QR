package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class BulletKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long f18258a = TextUnitKt.f(1);

    /* renamed from: b  reason: collision with root package name */
    public static final long f18259b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f18260c;

    /* renamed from: d  reason: collision with root package name */
    public static final Bullet f18261d;

    static {
        long d2 = TextUnitKt.d(0.25d);
        f18259b = d2;
        long d3 = TextUnitKt.d(0.25d);
        f18260c = d3;
        f18261d = new Bullet(CircleShape.f18266a, d2, d3, (Brush) null, 1.0f, Fill.f16295a, (DefaultConstructorMarker) null);
    }

    public static final Bullet a() {
        return f18261d;
    }

    public static final long b() {
        return f18258a;
    }
}
