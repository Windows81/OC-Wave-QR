package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class PathNode {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16545a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16546b;

    @Metadata
    public static final class ArcTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16547c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16548d;

        /* renamed from: e  reason: collision with root package name */
        public final float f16549e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f16550f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f16551g;

        /* renamed from: h  reason: collision with root package name */
        public final float f16552h;

        /* renamed from: i  reason: collision with root package name */
        public final float f16553i;

        public ArcTo(float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f16547c = f2;
            this.f16548d = f3;
            this.f16549e = f4;
            this.f16550f = z2;
            this.f16551g = z3;
            this.f16552h = f5;
            this.f16553i = f6;
        }

        public final float c() {
            return this.f16552h;
        }

        public final float d() {
            return this.f16553i;
        }

        public final float e() {
            return this.f16547c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            return Float.compare(this.f16547c, arcTo.f16547c) == 0 && Float.compare(this.f16548d, arcTo.f16548d) == 0 && Float.compare(this.f16549e, arcTo.f16549e) == 0 && this.f16550f == arcTo.f16550f && this.f16551g == arcTo.f16551g && Float.compare(this.f16552h, arcTo.f16552h) == 0 && Float.compare(this.f16553i, arcTo.f16553i) == 0;
        }

        public final float f() {
            return this.f16549e;
        }

        public final float g() {
            return this.f16548d;
        }

        public final boolean h() {
            return this.f16550f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f16547c) * 31) + Float.hashCode(this.f16548d)) * 31) + Float.hashCode(this.f16549e)) * 31) + Boolean.hashCode(this.f16550f)) * 31) + Boolean.hashCode(this.f16551g)) * 31) + Float.hashCode(this.f16552h)) * 31) + Float.hashCode(this.f16553i);
        }

        public final boolean i() {
            return this.f16551g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f16547c + ", verticalEllipseRadius=" + this.f16548d + ", theta=" + this.f16549e + ", isMoreThanHalf=" + this.f16550f + ", isPositiveArc=" + this.f16551g + ", arcStartX=" + this.f16552h + ", arcStartY=" + this.f16553i + ')';
        }
    }

    @Metadata
    public static final class Close extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public static final Close f16554c = new Close();

        public Close() {
            super(false, false, 3, (DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class CurveTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16555c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16556d;

        /* renamed from: e  reason: collision with root package name */
        public final float f16557e;

        /* renamed from: f  reason: collision with root package name */
        public final float f16558f;

        /* renamed from: g  reason: collision with root package name */
        public final float f16559g;

        /* renamed from: h  reason: collision with root package name */
        public final float f16560h;

        public CurveTo(float f2, float f3, float f4, float f5, float f6, float f7) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f16555c = f2;
            this.f16556d = f3;
            this.f16557e = f4;
            this.f16558f = f5;
            this.f16559g = f6;
            this.f16560h = f7;
        }

        public final float c() {
            return this.f16555c;
        }

        public final float d() {
            return this.f16557e;
        }

        public final float e() {
            return this.f16559g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            return Float.compare(this.f16555c, curveTo.f16555c) == 0 && Float.compare(this.f16556d, curveTo.f16556d) == 0 && Float.compare(this.f16557e, curveTo.f16557e) == 0 && Float.compare(this.f16558f, curveTo.f16558f) == 0 && Float.compare(this.f16559g, curveTo.f16559g) == 0 && Float.compare(this.f16560h, curveTo.f16560h) == 0;
        }

        public final float f() {
            return this.f16556d;
        }

        public final float g() {
            return this.f16558f;
        }

        public final float h() {
            return this.f16560h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f16555c) * 31) + Float.hashCode(this.f16556d)) * 31) + Float.hashCode(this.f16557e)) * 31) + Float.hashCode(this.f16558f)) * 31) + Float.hashCode(this.f16559g)) * 31) + Float.hashCode(this.f16560h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f16555c + ", y1=" + this.f16556d + ", x2=" + this.f16557e + ", y2=" + this.f16558f + ", x3=" + this.f16559g + ", y3=" + this.f16560h + ')';
        }
    }

    @Metadata
    public static final class HorizontalTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16561c;

        public HorizontalTo(float f2) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f16561c = f2;
        }

        public final float c() {
            return this.f16561c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.f16561c, ((HorizontalTo) obj).f16561c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f16561c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f16561c + ')';
        }
    }

    @Metadata
    public static final class LineTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16562c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16563d;

        public LineTo(float f2, float f3) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f16562c = f2;
            this.f16563d = f3;
        }

        public final float c() {
            return this.f16562c;
        }

        public final float d() {
            return this.f16563d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            return Float.compare(this.f16562c, lineTo.f16562c) == 0 && Float.compare(this.f16563d, lineTo.f16563d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f16562c) * 31) + Float.hashCode(this.f16563d);
        }

        public String toString() {
            return "LineTo(x=" + this.f16562c + ", y=" + this.f16563d + ')';
        }
    }

    @Metadata
    public static final class MoveTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16564c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16565d;

        public MoveTo(float f2, float f3) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f16564c = f2;
            this.f16565d = f3;
        }

        public final float c() {
            return this.f16564c;
        }

        public final float d() {
            return this.f16565d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            return Float.compare(this.f16564c, moveTo.f16564c) == 0 && Float.compare(this.f16565d, moveTo.f16565d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f16564c) * 31) + Float.hashCode(this.f16565d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f16564c + ", y=" + this.f16565d + ')';
        }
    }

    @Metadata
    public static final class QuadTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16566c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16567d;

        /* renamed from: e  reason: collision with root package name */
        public final float f16568e;

        /* renamed from: f  reason: collision with root package name */
        public final float f16569f;

        public QuadTo(float f2, float f3, float f4, float f5) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f16566c = f2;
            this.f16567d = f3;
            this.f16568e = f4;
            this.f16569f = f5;
        }

        public final float c() {
            return this.f16566c;
        }

        public final float d() {
            return this.f16568e;
        }

        public final float e() {
            return this.f16567d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            return Float.compare(this.f16566c, quadTo.f16566c) == 0 && Float.compare(this.f16567d, quadTo.f16567d) == 0 && Float.compare(this.f16568e, quadTo.f16568e) == 0 && Float.compare(this.f16569f, quadTo.f16569f) == 0;
        }

        public final float f() {
            return this.f16569f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f16566c) * 31) + Float.hashCode(this.f16567d)) * 31) + Float.hashCode(this.f16568e)) * 31) + Float.hashCode(this.f16569f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f16566c + ", y1=" + this.f16567d + ", x2=" + this.f16568e + ", y2=" + this.f16569f + ')';
        }
    }

    @Metadata
    public static final class ReflectiveCurveTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16570c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16571d;

        /* renamed from: e  reason: collision with root package name */
        public final float f16572e;

        /* renamed from: f  reason: collision with root package name */
        public final float f16573f;

        public ReflectiveCurveTo(float f2, float f3, float f4, float f5) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f16570c = f2;
            this.f16571d = f3;
            this.f16572e = f4;
            this.f16573f = f5;
        }

        public final float c() {
            return this.f16570c;
        }

        public final float d() {
            return this.f16572e;
        }

        public final float e() {
            return this.f16571d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            return Float.compare(this.f16570c, reflectiveCurveTo.f16570c) == 0 && Float.compare(this.f16571d, reflectiveCurveTo.f16571d) == 0 && Float.compare(this.f16572e, reflectiveCurveTo.f16572e) == 0 && Float.compare(this.f16573f, reflectiveCurveTo.f16573f) == 0;
        }

        public final float f() {
            return this.f16573f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f16570c) * 31) + Float.hashCode(this.f16571d)) * 31) + Float.hashCode(this.f16572e)) * 31) + Float.hashCode(this.f16573f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f16570c + ", y1=" + this.f16571d + ", x2=" + this.f16572e + ", y2=" + this.f16573f + ')';
        }
    }

    @Metadata
    public static final class ReflectiveQuadTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16574c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16575d;

        public ReflectiveQuadTo(float f2, float f3) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f16574c = f2;
            this.f16575d = f3;
        }

        public final float c() {
            return this.f16574c;
        }

        public final float d() {
            return this.f16575d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            return Float.compare(this.f16574c, reflectiveQuadTo.f16574c) == 0 && Float.compare(this.f16575d, reflectiveQuadTo.f16575d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f16574c) * 31) + Float.hashCode(this.f16575d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f16574c + ", y=" + this.f16575d + ')';
        }
    }

    @Metadata
    public static final class RelativeArcTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16576c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16577d;

        /* renamed from: e  reason: collision with root package name */
        public final float f16578e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f16579f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f16580g;

        /* renamed from: h  reason: collision with root package name */
        public final float f16581h;

        /* renamed from: i  reason: collision with root package name */
        public final float f16582i;

        public RelativeArcTo(float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f16576c = f2;
            this.f16577d = f3;
            this.f16578e = f4;
            this.f16579f = z2;
            this.f16580g = z3;
            this.f16581h = f5;
            this.f16582i = f6;
        }

        public final float c() {
            return this.f16581h;
        }

        public final float d() {
            return this.f16582i;
        }

        public final float e() {
            return this.f16576c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            return Float.compare(this.f16576c, relativeArcTo.f16576c) == 0 && Float.compare(this.f16577d, relativeArcTo.f16577d) == 0 && Float.compare(this.f16578e, relativeArcTo.f16578e) == 0 && this.f16579f == relativeArcTo.f16579f && this.f16580g == relativeArcTo.f16580g && Float.compare(this.f16581h, relativeArcTo.f16581h) == 0 && Float.compare(this.f16582i, relativeArcTo.f16582i) == 0;
        }

        public final float f() {
            return this.f16578e;
        }

        public final float g() {
            return this.f16577d;
        }

        public final boolean h() {
            return this.f16579f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f16576c) * 31) + Float.hashCode(this.f16577d)) * 31) + Float.hashCode(this.f16578e)) * 31) + Boolean.hashCode(this.f16579f)) * 31) + Boolean.hashCode(this.f16580g)) * 31) + Float.hashCode(this.f16581h)) * 31) + Float.hashCode(this.f16582i);
        }

        public final boolean i() {
            return this.f16580g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f16576c + ", verticalEllipseRadius=" + this.f16577d + ", theta=" + this.f16578e + ", isMoreThanHalf=" + this.f16579f + ", isPositiveArc=" + this.f16580g + ", arcStartDx=" + this.f16581h + ", arcStartDy=" + this.f16582i + ')';
        }
    }

    @Metadata
    public static final class RelativeCurveTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16583c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16584d;

        /* renamed from: e  reason: collision with root package name */
        public final float f16585e;

        /* renamed from: f  reason: collision with root package name */
        public final float f16586f;

        /* renamed from: g  reason: collision with root package name */
        public final float f16587g;

        /* renamed from: h  reason: collision with root package name */
        public final float f16588h;

        public RelativeCurveTo(float f2, float f3, float f4, float f5, float f6, float f7) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f16583c = f2;
            this.f16584d = f3;
            this.f16585e = f4;
            this.f16586f = f5;
            this.f16587g = f6;
            this.f16588h = f7;
        }

        public final float c() {
            return this.f16583c;
        }

        public final float d() {
            return this.f16585e;
        }

        public final float e() {
            return this.f16587g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            return Float.compare(this.f16583c, relativeCurveTo.f16583c) == 0 && Float.compare(this.f16584d, relativeCurveTo.f16584d) == 0 && Float.compare(this.f16585e, relativeCurveTo.f16585e) == 0 && Float.compare(this.f16586f, relativeCurveTo.f16586f) == 0 && Float.compare(this.f16587g, relativeCurveTo.f16587g) == 0 && Float.compare(this.f16588h, relativeCurveTo.f16588h) == 0;
        }

        public final float f() {
            return this.f16584d;
        }

        public final float g() {
            return this.f16586f;
        }

        public final float h() {
            return this.f16588h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f16583c) * 31) + Float.hashCode(this.f16584d)) * 31) + Float.hashCode(this.f16585e)) * 31) + Float.hashCode(this.f16586f)) * 31) + Float.hashCode(this.f16587g)) * 31) + Float.hashCode(this.f16588h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f16583c + ", dy1=" + this.f16584d + ", dx2=" + this.f16585e + ", dy2=" + this.f16586f + ", dx3=" + this.f16587g + ", dy3=" + this.f16588h + ')';
        }
    }

    @Metadata
    public static final class RelativeHorizontalTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16589c;

        public RelativeHorizontalTo(float f2) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f16589c = f2;
        }

        public final float c() {
            return this.f16589c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.f16589c, ((RelativeHorizontalTo) obj).f16589c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f16589c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f16589c + ')';
        }
    }

    @Metadata
    public static final class RelativeLineTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16590c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16591d;

        public RelativeLineTo(float f2, float f3) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f16590c = f2;
            this.f16591d = f3;
        }

        public final float c() {
            return this.f16590c;
        }

        public final float d() {
            return this.f16591d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            return Float.compare(this.f16590c, relativeLineTo.f16590c) == 0 && Float.compare(this.f16591d, relativeLineTo.f16591d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f16590c) * 31) + Float.hashCode(this.f16591d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f16590c + ", dy=" + this.f16591d + ')';
        }
    }

    @Metadata
    public static final class RelativeMoveTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16592c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16593d;

        public RelativeMoveTo(float f2, float f3) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f16592c = f2;
            this.f16593d = f3;
        }

        public final float c() {
            return this.f16592c;
        }

        public final float d() {
            return this.f16593d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            return Float.compare(this.f16592c, relativeMoveTo.f16592c) == 0 && Float.compare(this.f16593d, relativeMoveTo.f16593d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f16592c) * 31) + Float.hashCode(this.f16593d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f16592c + ", dy=" + this.f16593d + ')';
        }
    }

    @Metadata
    public static final class RelativeQuadTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16594c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16595d;

        /* renamed from: e  reason: collision with root package name */
        public final float f16596e;

        /* renamed from: f  reason: collision with root package name */
        public final float f16597f;

        public RelativeQuadTo(float f2, float f3, float f4, float f5) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f16594c = f2;
            this.f16595d = f3;
            this.f16596e = f4;
            this.f16597f = f5;
        }

        public final float c() {
            return this.f16594c;
        }

        public final float d() {
            return this.f16596e;
        }

        public final float e() {
            return this.f16595d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            return Float.compare(this.f16594c, relativeQuadTo.f16594c) == 0 && Float.compare(this.f16595d, relativeQuadTo.f16595d) == 0 && Float.compare(this.f16596e, relativeQuadTo.f16596e) == 0 && Float.compare(this.f16597f, relativeQuadTo.f16597f) == 0;
        }

        public final float f() {
            return this.f16597f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f16594c) * 31) + Float.hashCode(this.f16595d)) * 31) + Float.hashCode(this.f16596e)) * 31) + Float.hashCode(this.f16597f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f16594c + ", dy1=" + this.f16595d + ", dx2=" + this.f16596e + ", dy2=" + this.f16597f + ')';
        }
    }

    @Metadata
    public static final class RelativeReflectiveCurveTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16598c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16599d;

        /* renamed from: e  reason: collision with root package name */
        public final float f16600e;

        /* renamed from: f  reason: collision with root package name */
        public final float f16601f;

        public RelativeReflectiveCurveTo(float f2, float f3, float f4, float f5) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f16598c = f2;
            this.f16599d = f3;
            this.f16600e = f4;
            this.f16601f = f5;
        }

        public final float c() {
            return this.f16598c;
        }

        public final float d() {
            return this.f16600e;
        }

        public final float e() {
            return this.f16599d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            return Float.compare(this.f16598c, relativeReflectiveCurveTo.f16598c) == 0 && Float.compare(this.f16599d, relativeReflectiveCurveTo.f16599d) == 0 && Float.compare(this.f16600e, relativeReflectiveCurveTo.f16600e) == 0 && Float.compare(this.f16601f, relativeReflectiveCurveTo.f16601f) == 0;
        }

        public final float f() {
            return this.f16601f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f16598c) * 31) + Float.hashCode(this.f16599d)) * 31) + Float.hashCode(this.f16600e)) * 31) + Float.hashCode(this.f16601f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f16598c + ", dy1=" + this.f16599d + ", dx2=" + this.f16600e + ", dy2=" + this.f16601f + ')';
        }
    }

    @Metadata
    public static final class RelativeReflectiveQuadTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16602c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16603d;

        public RelativeReflectiveQuadTo(float f2, float f3) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f16602c = f2;
            this.f16603d = f3;
        }

        public final float c() {
            return this.f16602c;
        }

        public final float d() {
            return this.f16603d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            return Float.compare(this.f16602c, relativeReflectiveQuadTo.f16602c) == 0 && Float.compare(this.f16603d, relativeReflectiveQuadTo.f16603d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f16602c) * 31) + Float.hashCode(this.f16603d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f16602c + ", dy=" + this.f16603d + ')';
        }
    }

    @Metadata
    public static final class RelativeVerticalTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16604c;

        public RelativeVerticalTo(float f2) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f16604c = f2;
        }

        public final float c() {
            return this.f16604c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.f16604c, ((RelativeVerticalTo) obj).f16604c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f16604c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f16604c + ')';
        }
    }

    @Metadata
    public static final class VerticalTo extends PathNode {

        /* renamed from: c  reason: collision with root package name */
        public final float f16605c;

        public VerticalTo(float f2) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f16605c = f2;
        }

        public final float c() {
            return this.f16605c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.f16605c, ((VerticalTo) obj).f16605c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f16605c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f16605c + ')';
        }
    }

    public /* synthetic */ PathNode(boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z3);
    }

    public final boolean a() {
        return this.f16545a;
    }

    public final boolean b() {
        return this.f16546b;
    }

    public PathNode(boolean z2, boolean z3) {
        this.f16545a = z2;
        this.f16546b = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PathNode(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? false : z3, (DefaultConstructorMarker) null);
    }
}
