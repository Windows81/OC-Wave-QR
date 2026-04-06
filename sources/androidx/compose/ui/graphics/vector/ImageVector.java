package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ImageVector {

    /* renamed from: k  reason: collision with root package name */
    public static final Companion f16488k;

    /* renamed from: l  reason: collision with root package name */
    public static int f16489l;

    /* renamed from: m  reason: collision with root package name */
    public static final Object f16490m;

    /* renamed from: a  reason: collision with root package name */
    public final String f16491a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16492b;

    /* renamed from: c  reason: collision with root package name */
    public final float f16493c;

    /* renamed from: d  reason: collision with root package name */
    public final float f16494d;

    /* renamed from: e  reason: collision with root package name */
    public final float f16495e;

    /* renamed from: f  reason: collision with root package name */
    public final VectorGroup f16496f;

    /* renamed from: g  reason: collision with root package name */
    public final long f16497g;

    /* renamed from: h  reason: collision with root package name */
    public final int f16498h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f16499i;

    /* renamed from: j  reason: collision with root package name */
    public final int f16500j;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final String f16501a;

        /* renamed from: b  reason: collision with root package name */
        public final float f16502b;

        /* renamed from: c  reason: collision with root package name */
        public final float f16503c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16504d;

        /* renamed from: e  reason: collision with root package name */
        public final float f16505e;

        /* renamed from: f  reason: collision with root package name */
        public final long f16506f;

        /* renamed from: g  reason: collision with root package name */
        public final int f16507g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f16508h;

        /* renamed from: i  reason: collision with root package name */
        public final ArrayList f16509i;

        /* renamed from: j  reason: collision with root package name */
        public GroupParams f16510j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f16511k;

        public /* synthetic */ Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f2, f3, f4, f5, j2, i2, z2);
        }

        public static /* synthetic */ Builder b(Builder builder, String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, int i2, Object obj) {
            int i3 = i2;
            String str2 = (i3 & 1) != 0 ? "" : str;
            float f9 = 0.0f;
            float f10 = (i3 & 2) != 0 ? 0.0f : f2;
            float f11 = (i3 & 4) != 0 ? 0.0f : f3;
            float f12 = (i3 & 8) != 0 ? 0.0f : f4;
            float f13 = 1.0f;
            float f14 = (i3 & 16) != 0 ? 1.0f : f5;
            if ((i3 & 32) == 0) {
                f13 = f6;
            }
            float f15 = (i3 & 64) != 0 ? 0.0f : f7;
            if ((i3 & 128) == 0) {
                f9 = f8;
            }
            return builder.a(str2, f10, f11, f12, f14, f13, f15, f9, (i3 & 256) != 0 ? VectorKt.d() : list);
        }

        public static /* synthetic */ Builder d(Builder builder, List list, int i2, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, int i5, Object obj) {
            int i6 = i5;
            int a2 = (i6 & 2) != 0 ? VectorKt.a() : i2;
            String str2 = (i6 & 4) != 0 ? "" : str;
            Brush brush3 = null;
            Brush brush4 = (i6 & 8) != 0 ? null : brush;
            float f9 = 1.0f;
            float f10 = (i6 & 16) != 0 ? 1.0f : f2;
            if ((i6 & 32) == 0) {
                brush3 = brush2;
            }
            float f11 = (i6 & 64) != 0 ? 1.0f : f3;
            float f12 = 0.0f;
            float f13 = (i6 & 128) != 0 ? 0.0f : f4;
            int b2 = (i6 & 256) != 0 ? VectorKt.b() : i3;
            int c2 = (i6 & 512) != 0 ? VectorKt.c() : i4;
            float f14 = (i6 & 1024) != 0 ? 4.0f : f5;
            float f15 = (i6 & 2048) != 0 ? 0.0f : f6;
            if ((i6 & 4096) == 0) {
                f9 = f7;
            }
            if ((i6 & 8192) == 0) {
                f12 = f8;
            }
            return builder.c(list, a2, str2, brush4, f10, brush3, f11, f13, b2, c2, f14, f15, f9, f12);
        }

        public final Builder a(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list) {
            h();
            boolean unused = ImageVectorKt.f(this.f16509i, new GroupParams(str, f2, f3, f4, f5, f6, f7, f8, list, (List) null, 512, (DefaultConstructorMarker) null));
            return this;
        }

        public final Builder c(List list, int i2, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8) {
            h();
            List a2 = i().a();
            VectorPath vectorPath = r1;
            VectorPath vectorPath2 = new VectorPath(str, list, i2, brush, f2, brush2, f3, f4, i3, i4, f5, f6, f7, f8, (DefaultConstructorMarker) null);
            a2.add(vectorPath);
            return this;
        }

        public final VectorGroup e(GroupParams groupParams) {
            return new VectorGroup(groupParams.c(), groupParams.f(), groupParams.d(), groupParams.e(), groupParams.g(), groupParams.h(), groupParams.i(), groupParams.j(), groupParams.b(), groupParams.a());
        }

        public final ImageVector f() {
            h();
            while (this.f16509i.size() > 1) {
                g();
            }
            ImageVector imageVector = new ImageVector(this.f16501a, this.f16502b, this.f16503c, this.f16504d, this.f16505e, e(this.f16510j), this.f16506f, this.f16507g, this.f16508h, 0, 512, (DefaultConstructorMarker) null);
            this.f16511k = true;
            return imageVector;
        }

        public final Builder g() {
            h();
            i().a().add(e((GroupParams) ImageVectorKt.e(this.f16509i)));
            return this;
        }

        public final void h() {
            if (this.f16511k) {
                InlineClassHelperKt.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        public final GroupParams i() {
            return (GroupParams) ImageVectorKt.d(this.f16509i);
        }

        public Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, boolean z2) {
            this.f16501a = str;
            this.f16502b = f2;
            this.f16503c = f3;
            this.f16504d = f4;
            this.f16505e = f5;
            this.f16506f = j2;
            this.f16507g = i2;
            this.f16508h = z2;
            ArrayList arrayList = new ArrayList();
            this.f16509i = arrayList;
            GroupParams groupParams = new GroupParams((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (DefaultConstructorMarker) null);
            this.f16510j = groupParams;
            boolean unused = ImageVectorKt.f(arrayList, groupParams);
        }

        @Metadata
        public static final class GroupParams {

            /* renamed from: a  reason: collision with root package name */
            public String f16512a;

            /* renamed from: b  reason: collision with root package name */
            public float f16513b;

            /* renamed from: c  reason: collision with root package name */
            public float f16514c;

            /* renamed from: d  reason: collision with root package name */
            public float f16515d;

            /* renamed from: e  reason: collision with root package name */
            public float f16516e;

            /* renamed from: f  reason: collision with root package name */
            public float f16517f;

            /* renamed from: g  reason: collision with root package name */
            public float f16518g;

            /* renamed from: h  reason: collision with root package name */
            public float f16519h;

            /* renamed from: i  reason: collision with root package name */
            public List f16520i;

            /* renamed from: j  reason: collision with root package name */
            public List f16521j;

            public GroupParams(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, List list2) {
                this.f16512a = str;
                this.f16513b = f2;
                this.f16514c = f3;
                this.f16515d = f4;
                this.f16516e = f5;
                this.f16517f = f6;
                this.f16518g = f7;
                this.f16519h = f8;
                this.f16520i = list;
                this.f16521j = list2;
            }

            public final List a() {
                return this.f16521j;
            }

            public final List b() {
                return this.f16520i;
            }

            public final String c() {
                return this.f16512a;
            }

            public final float d() {
                return this.f16514c;
            }

            public final float e() {
                return this.f16515d;
            }

            public final float f() {
                return this.f16513b;
            }

            public final float g() {
                return this.f16516e;
            }

            public final float h() {
                return this.f16517f;
            }

            public final float i() {
                return this.f16518g;
            }

            public final float j() {
                return this.f16519h;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ GroupParams(java.lang.String r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, java.util.List r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
                /*
                    r10 = this;
                    r0 = r21
                    r1 = r0 & 1
                    if (r1 == 0) goto L_0x0009
                    java.lang.String r1 = ""
                    goto L_0x000a
                L_0x0009:
                    r1 = r11
                L_0x000a:
                    r2 = r0 & 2
                    r3 = 0
                    if (r2 == 0) goto L_0x0011
                    r2 = r3
                    goto L_0x0012
                L_0x0011:
                    r2 = r12
                L_0x0012:
                    r4 = r0 & 4
                    if (r4 == 0) goto L_0x0018
                    r4 = r3
                    goto L_0x0019
                L_0x0018:
                    r4 = r13
                L_0x0019:
                    r5 = r0 & 8
                    if (r5 == 0) goto L_0x001f
                    r5 = r3
                    goto L_0x0020
                L_0x001f:
                    r5 = r14
                L_0x0020:
                    r6 = r0 & 16
                    r7 = 1065353216(0x3f800000, float:1.0)
                    if (r6 == 0) goto L_0x0028
                    r6 = r7
                    goto L_0x0029
                L_0x0028:
                    r6 = r15
                L_0x0029:
                    r8 = r0 & 32
                    if (r8 == 0) goto L_0x002e
                    goto L_0x0030
                L_0x002e:
                    r7 = r16
                L_0x0030:
                    r8 = r0 & 64
                    if (r8 == 0) goto L_0x0036
                    r8 = r3
                    goto L_0x0038
                L_0x0036:
                    r8 = r17
                L_0x0038:
                    r9 = r0 & 128(0x80, float:1.794E-43)
                    if (r9 == 0) goto L_0x003d
                    goto L_0x003f
                L_0x003d:
                    r3 = r18
                L_0x003f:
                    r9 = r0 & 256(0x100, float:3.59E-43)
                    if (r9 == 0) goto L_0x0048
                    java.util.List r9 = androidx.compose.ui.graphics.vector.VectorKt.d()
                    goto L_0x004a
                L_0x0048:
                    r9 = r19
                L_0x004a:
                    r0 = r0 & 512(0x200, float:7.175E-43)
                    if (r0 == 0) goto L_0x0054
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    goto L_0x0056
                L_0x0054:
                    r0 = r20
                L_0x0056:
                    r11 = r10
                    r12 = r1
                    r13 = r2
                    r14 = r4
                    r15 = r5
                    r16 = r6
                    r17 = r7
                    r18 = r8
                    r19 = r3
                    r20 = r9
                    r21 = r0
                    r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.ImageVector.Builder.GroupParams.<init>(java.lang.String, float, float, float, float, float, float, float, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Builder(java.lang.String r14, float r15, float r16, float r17, float r18, long r19, int r21, boolean r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000a
                java.lang.String r1 = ""
                r3 = r1
                goto L_0x000b
            L_0x000a:
                r3 = r14
            L_0x000b:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0017
                androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.ui.graphics.Color.f15975b
                long r1 = r1.f()
                r8 = r1
                goto L_0x0019
            L_0x0017:
                r8 = r19
            L_0x0019:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0025
                androidx.compose.ui.graphics.BlendMode$Companion r1 = androidx.compose.ui.graphics.BlendMode.f15926b
                int r1 = r1.z()
                r10 = r1
                goto L_0x0027
            L_0x0025:
                r10 = r21
            L_0x0027:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x002e
                r0 = 0
                r11 = r0
                goto L_0x0030
            L_0x002e:
                r11 = r22
            L_0x0030:
                r12 = 0
                r2 = r13
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.ImageVector.Builder.<init>(java.lang.String, float, float, float, float, long, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            int a2;
            synchronized (ImageVector.f16490m) {
                a2 = ImageVector.f16489l;
                ImageVector.f16489l = a2 + 1;
            }
            return a2;
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion((DefaultConstructorMarker) null);
        f16488k = companion;
        f16490m = companion;
    }

    public /* synthetic */ ImageVector(String str, float f2, float f3, float f4, float f5, VectorGroup vectorGroup, long j2, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f2, f3, f4, f5, vectorGroup, j2, i2, z2, i3);
    }

    public final boolean d() {
        return this.f16499i;
    }

    public final float e() {
        return this.f16493c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        return Intrinsics.d(this.f16491a, imageVector.f16491a) && Dp.o(this.f16492b, imageVector.f16492b) && Dp.o(this.f16493c, imageVector.f16493c) && this.f16494d == imageVector.f16494d && this.f16495e == imageVector.f16495e && Intrinsics.d(this.f16496f, imageVector.f16496f) && Color.n(this.f16497g, imageVector.f16497g) && BlendMode.F(this.f16498h, imageVector.f16498h) && this.f16499i == imageVector.f16499i;
    }

    public final float f() {
        return this.f16492b;
    }

    public final int g() {
        return this.f16500j;
    }

    public final String h() {
        return this.f16491a;
    }

    public int hashCode() {
        return (((((((((((((((this.f16491a.hashCode() * 31) + Dp.p(this.f16492b)) * 31) + Dp.p(this.f16493c)) * 31) + Float.hashCode(this.f16494d)) * 31) + Float.hashCode(this.f16495e)) * 31) + this.f16496f.hashCode()) * 31) + Color.t(this.f16497g)) * 31) + BlendMode.G(this.f16498h)) * 31) + Boolean.hashCode(this.f16499i);
    }

    public final VectorGroup i() {
        return this.f16496f;
    }

    public final int j() {
        return this.f16498h;
    }

    public final long k() {
        return this.f16497g;
    }

    public final float l() {
        return this.f16495e;
    }

    public final float m() {
        return this.f16494d;
    }

    public ImageVector(String str, float f2, float f3, float f4, float f5, VectorGroup vectorGroup, long j2, int i2, boolean z2, int i3) {
        this.f16491a = str;
        this.f16492b = f2;
        this.f16493c = f3;
        this.f16494d = f4;
        this.f16495e = f5;
        this.f16496f = vectorGroup;
        this.f16497g = j2;
        this.f16498h = i2;
        this.f16499i = z2;
        this.f16500j = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageVector(String str, float f2, float f3, float f4, float f5, VectorGroup vectorGroup, long j2, int i2, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f2, f3, f4, f5, vectorGroup, j2, i2, z2, (i4 & 512) != 0 ? f16488k.a() : i3, (DefaultConstructorMarker) null);
    }
}
