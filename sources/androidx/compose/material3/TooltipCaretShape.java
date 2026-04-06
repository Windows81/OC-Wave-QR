package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata
final class TooltipCaretShape implements Shape {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f11576a;

    /* renamed from: b  reason: collision with root package name */
    public final Shape f11577b;

    /* renamed from: c  reason: collision with root package name */
    public final Shape f11578c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f11579d = AndroidPath_androidKt.a();

    /* renamed from: e  reason: collision with root package name */
    public final Path f11580e = AndroidPath_androidKt.a();

    /* renamed from: f  reason: collision with root package name */
    public final Path f11581f = AndroidPath_androidKt.a();

    public TooltipCaretShape(MutableState mutableState, Shape shape, Shape shape2) {
        this.f11576a = mutableState;
        this.f11577b = shape;
        this.f11578c = shape2;
    }

    public Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        this.f11579d.b();
        this.f11580e.b();
        this.f11581f.b();
        Outline a2 = this.f11577b.a(j2, layoutDirection, density);
        Outline a3 = this.f11578c.a(j2, layoutDirection, density);
        if (a2 instanceof Outline.Generic) {
            Path.p(this.f11579d, ((Outline.Generic) a2).b(), 0, 2, (Object) null);
        } else if (a2 instanceof Outline.Rounded) {
            Path.l(this.f11579d, ((Outline.Rounded) a2).b(), (Path.Direction) null, 2, (Object) null);
        } else if (a2 instanceof Outline.Rectangle) {
            Path.d(this.f11579d, ((Outline.Rectangle) a2).b(), (Path.Direction) null, 2, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (a3 instanceof Outline.Generic) {
            Path.p(this.f11581f, ((Outline.Generic) a3).b(), 0, 2, (Object) null);
        } else if (a3 instanceof Outline.Rounded) {
            Path.l(this.f11581f, ((Outline.Rounded) a3).b(), (Path.Direction) null, 2, (Object) null);
        } else if (a3 instanceof Outline.Rectangle) {
            Path.d(this.f11581f, ((Outline.Rectangle) a3).b(), (Path.Direction) null, 2, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f11581f.a(((Matrix) this.f11576a.getValue()).q());
        this.f11580e.u(this.f11579d, this.f11581f, PathOperation.f16081b.d());
        return new Outline.Generic(this.f11580e);
    }
}
