package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class Adaptation {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16159b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final Adaptation f16160c = new Adaptation$Companion$Bradford$1(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* renamed from: d  reason: collision with root package name */
    public static final Adaptation f16161d = new Adaptation$Companion$VonKries$1(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* renamed from: e  reason: collision with root package name */
    public static final Adaptation f16162e = new Adaptation$Companion$Ciecat02$1(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* renamed from: a  reason: collision with root package name */
    public final float[] f16163a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Adaptation a() {
            return Adaptation.f16160c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Adaptation(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    public final float[] b() {
        return this.f16163a;
    }

    public Adaptation(float[] fArr) {
        this.f16163a = fArr;
    }
}
