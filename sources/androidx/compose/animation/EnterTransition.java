package androidx.compose.animation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class EnterTransition {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f2274a = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final EnterTransition f2275b = new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, (Scale) null, false, (Map) null, 63, (DefaultConstructorMarker) null));

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnterTransition a() {
            return EnterTransition.f2275b;
        }

        public Companion() {
        }
    }

    public /* synthetic */ EnterTransition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract TransitionData b();

    public final EnterTransition c(EnterTransition enterTransition) {
        Fade c2 = enterTransition.b().c();
        if (c2 == null) {
            c2 = b().c();
        }
        Fade fade = c2;
        Slide f2 = enterTransition.b().f();
        if (f2 == null) {
            f2 = b().f();
        }
        Slide slide = f2;
        ChangeSize a2 = enterTransition.b().a();
        if (a2 == null) {
            a2 = b().a();
        }
        ChangeSize changeSize = a2;
        Scale e2 = enterTransition.b().e();
        if (e2 == null) {
            e2 = b().e();
        }
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, e2, false, MapsKt.n(b().b(), enterTransition.b().b()), 16, (DefaultConstructorMarker) null));
    }

    public boolean equals(Object obj) {
        return (obj instanceof EnterTransition) && Intrinsics.d(((EnterTransition) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (Intrinsics.d(this, f2275b)) {
            return "EnterTransition.None";
        }
        TransitionData b2 = b();
        StringBuilder sb = new StringBuilder();
        sb.append("EnterTransition: \nFade - ");
        Fade c2 = b2.c();
        String str = null;
        sb.append(c2 != null ? c2.toString() : null);
        sb.append(",\nSlide - ");
        Slide f2 = b2.f();
        sb.append(f2 != null ? f2.toString() : null);
        sb.append(",\nShrink - ");
        ChangeSize a2 = b2.a();
        sb.append(a2 != null ? a2.toString() : null);
        sb.append(",\nScale - ");
        Scale e2 = b2.e();
        if (e2 != null) {
            str = e2.toString();
        }
        sb.append(str);
        return sb.toString();
    }

    public EnterTransition() {
    }
}
