package com.hansecom.abt.ui.components.circleIcons;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CircleIconStyle {

    /* renamed from: a  reason: collision with root package name */
    public final long f38091a;

    /* renamed from: b  reason: collision with root package name */
    public final long f38092b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38093c;

    /* renamed from: d  reason: collision with root package name */
    public final Size f38094d;

    @Metadata
    public enum Size {
        SMALL(Dp.m((float) 96), Dp.m((float) 48)),
        MEDIUM(Dp.m((float) 120), Dp.m((float) 64));
        

        /* renamed from: A  reason: collision with root package name */
        public final float f38096A;

        /* renamed from: z  reason: collision with root package name */
        public final float f38097z;

        static {
            Size[] d2;
            E = EnumEntriesKt.a(d2);
        }

        /* access modifiers changed from: public */
        Size(float f2, float f3) {
            this.f38097z = f2;
            this.f38096A = f3;
        }

        public final float f() {
            return this.f38097z;
        }

        public final float h() {
            return this.f38096A;
        }
    }

    @Metadata
    public static abstract class Type {

        @Metadata
        public static final class Error extends Type {

            /* renamed from: a  reason: collision with root package name */
            public final Size f38098a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Error(Size size) {
                super((DefaultConstructorMarker) null);
                Intrinsics.i(size, "size");
                this.f38098a = size;
            }

            public CircleIconStyle a(Composer composer, int i2) {
                composer.X(-391251637);
                if (ComposerKt.P()) {
                    ComposerKt.Y(-391251637, i2, -1, "com.hansecom.abt.ui.components.circleIcons.CircleIconStyle.Type.Error.getStyle (CircleIconStyle.kt:55)");
                }
                AbtTheme abtTheme = AbtTheme.f38851a;
                CircleIconStyle circleIconStyle = new CircleIconStyle(abtTheme.b(composer, 6).z(), abtTheme.b(composer, 6).b(), R.drawable.f33016r, this.f38098a, (DefaultConstructorMarker) null);
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
                composer.M();
                return circleIconStyle;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && this.f38098a == ((Error) obj).f38098a;
            }

            public int hashCode() {
                return this.f38098a.hashCode();
            }

            public String toString() {
                Size size = this.f38098a;
                return "Error(size=" + size + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Error(Size size, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? Size.SMALL : size);
            }
        }

        @Metadata
        public static final class Informative extends Type {

            /* renamed from: a  reason: collision with root package name */
            public final Size f38099a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Informative(Size size) {
                super((DefaultConstructorMarker) null);
                Intrinsics.i(size, "size");
                this.f38099a = size;
            }

            public CircleIconStyle a(Composer composer, int i2) {
                composer.X(-1218138689);
                if (ComposerKt.P()) {
                    ComposerKt.Y(-1218138689, i2, -1, "com.hansecom.abt.ui.components.circleIcons.CircleIconStyle.Type.Informative.getStyle (CircleIconStyle.kt:33)");
                }
                AbtTheme abtTheme = AbtTheme.f38851a;
                CircleIconStyle circleIconStyle = new CircleIconStyle(abtTheme.b(composer, 6).z(), abtTheme.b(composer, 6).x(), R.drawable.I, this.f38099a, (DefaultConstructorMarker) null);
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
                composer.M();
                return circleIconStyle;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Informative) && this.f38099a == ((Informative) obj).f38099a;
            }

            public int hashCode() {
                return this.f38099a.hashCode();
            }

            public String toString() {
                Size size = this.f38099a;
                return "Informative(size=" + size + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Informative(Size size, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? Size.SMALL : size);
            }
        }

        @Metadata
        public static final class Positive extends Type {

            /* renamed from: a  reason: collision with root package name */
            public final Size f38100a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Positive(Size size) {
                super((DefaultConstructorMarker) null);
                Intrinsics.i(size, "size");
                this.f38100a = size;
            }

            public CircleIconStyle a(Composer composer, int i2) {
                composer.X(1801876040);
                if (ComposerKt.P()) {
                    ComposerKt.Y(1801876040, i2, -1, "com.hansecom.abt.ui.components.circleIcons.CircleIconStyle.Type.Positive.getStyle (CircleIconStyle.kt:44)");
                }
                AbtTheme abtTheme = AbtTheme.f38851a;
                CircleIconStyle circleIconStyle = new CircleIconStyle(abtTheme.b(composer, 6).z(), abtTheme.b(composer, 6).v(), R.drawable.f33010l, this.f38100a, (DefaultConstructorMarker) null);
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
                composer.M();
                return circleIconStyle;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Positive) && this.f38100a == ((Positive) obj).f38100a;
            }

            public int hashCode() {
                return this.f38100a.hashCode();
            }

            public String toString() {
                Size size = this.f38100a;
                return "Positive(size=" + size + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Positive(Size size, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? Size.SMALL : size);
            }
        }

        @Metadata
        public static final class Warning extends Type {

            /* renamed from: a  reason: collision with root package name */
            public final Size f38101a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Warning(Size size) {
                super((DefaultConstructorMarker) null);
                Intrinsics.i(size, "size");
                this.f38101a = size;
            }

            public CircleIconStyle a(Composer composer, int i2) {
                composer.X(1961886815);
                if (ComposerKt.P()) {
                    ComposerKt.Y(1961886815, i2, -1, "com.hansecom.abt.ui.components.circleIcons.CircleIconStyle.Type.Warning.getStyle (CircleIconStyle.kt:66)");
                }
                AbtTheme abtTheme = AbtTheme.f38851a;
                CircleIconStyle circleIconStyle = new CircleIconStyle(abtTheme.b(composer, 6).i(), abtTheme.b(composer, 6).A(), R.drawable.b0, this.f38101a, (DefaultConstructorMarker) null);
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
                composer.M();
                return circleIconStyle;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Warning) && this.f38101a == ((Warning) obj).f38101a;
            }

            public int hashCode() {
                return this.f38101a.hashCode();
            }

            public String toString() {
                Size size = this.f38101a;
                return "Warning(size=" + size + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Warning(Size size, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? Size.SMALL : size);
            }
        }

        public /* synthetic */ Type(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract CircleIconStyle a(Composer composer, int i2);

        public Type() {
        }
    }

    public /* synthetic */ CircleIconStyle(long j2, long j3, int i2, Size size, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, i2, size);
    }

    public final long a() {
        return this.f38091a;
    }

    public final long b() {
        return this.f38092b;
    }

    public final int c() {
        return this.f38093c;
    }

    public final Size d() {
        return this.f38094d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CircleIconStyle)) {
            return false;
        }
        CircleIconStyle circleIconStyle = (CircleIconStyle) obj;
        return Color.n(this.f38091a, circleIconStyle.f38091a) && Color.n(this.f38092b, circleIconStyle.f38092b) && this.f38093c == circleIconStyle.f38093c && this.f38094d == circleIconStyle.f38094d;
    }

    public int hashCode() {
        return (((((Color.t(this.f38091a) * 31) + Color.t(this.f38092b)) * 31) + Integer.hashCode(this.f38093c)) * 31) + this.f38094d.hashCode();
    }

    public String toString() {
        String u2 = Color.u(this.f38091a);
        String u3 = Color.u(this.f38092b);
        int i2 = this.f38093c;
        Size size = this.f38094d;
        return "CircleIconStyle(containerColor=" + u2 + ", contentColor=" + u3 + ", defaultIcon=" + i2 + ", size=" + size + ")";
    }

    public CircleIconStyle(long j2, long j3, int i2, Size size) {
        Intrinsics.i(size, "size");
        this.f38091a = j2;
        this.f38092b = j3;
        this.f38093c = i2;
        this.f38094d = size;
    }
}
