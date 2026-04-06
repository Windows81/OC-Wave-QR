package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class Outline {

    @Metadata
    public static final class Generic extends Outline {

        /* renamed from: a  reason: collision with root package name */
        public final Path f16057a;

        public Generic(Path path) {
            super((DefaultConstructorMarker) null);
            this.f16057a = path;
        }

        public Rect a() {
            return this.f16057a.getBounds();
        }

        public final Path b() {
            return this.f16057a;
        }
    }

    @Metadata
    public static final class Rectangle extends Outline {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f16058a;

        public Rectangle(Rect rect) {
            super((DefaultConstructorMarker) null);
            this.f16058a = rect;
        }

        public Rect a() {
            return this.f16058a;
        }

        public final Rect b() {
            return this.f16058a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rectangle) && Intrinsics.d(this.f16058a, ((Rectangle) obj).f16058a);
        }

        public int hashCode() {
            return this.f16058a.hashCode();
        }
    }

    @Metadata
    public static final class Rounded extends Outline {

        /* renamed from: a  reason: collision with root package name */
        public final RoundRect f16059a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f16060b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Rounded(RoundRect roundRect) {
            super((DefaultConstructorMarker) null);
            Path path = null;
            this.f16059a = roundRect;
            if (!RoundRectKt.g(roundRect)) {
                Path a2 = AndroidPath_androidKt.a();
                Path.l(a2, roundRect, (Path.Direction) null, 2, (Object) null);
                path = a2;
            }
            this.f16060b = path;
        }

        public Rect a() {
            return RoundRectKt.f(this.f16059a);
        }

        public final RoundRect b() {
            return this.f16059a;
        }

        public final Path c() {
            return this.f16060b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rounded) && Intrinsics.d(this.f16059a, ((Rounded) obj).f16059a);
        }

        public int hashCode() {
            return this.f16059a.hashCode();
        }
    }

    public /* synthetic */ Outline(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Rect a();

    public Outline() {
    }
}
