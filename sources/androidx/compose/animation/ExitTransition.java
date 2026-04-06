package androidx.compose.animation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class ExitTransition {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f2277a = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final ExitTransition f2278b = new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, (Scale) null, false, (Map) null, 63, (DefaultConstructorMarker) null));

    /* renamed from: c  reason: collision with root package name */
    public static final ExitTransition f2279c = new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, (Scale) null, true, (Map) null, 47, (DefaultConstructorMarker) null));

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExitTransition a() {
            return ExitTransition.f2278b;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ExitTransition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract TransitionData b();

    public final ExitTransition c(ExitTransition exitTransition) {
        Fade c2 = exitTransition.b().c();
        if (c2 == null) {
            c2 = b().c();
        }
        Fade fade = c2;
        Slide f2 = exitTransition.b().f();
        if (f2 == null) {
            f2 = b().f();
        }
        Slide slide = f2;
        ChangeSize a2 = exitTransition.b().a();
        if (a2 == null) {
            a2 = b().a();
        }
        ChangeSize changeSize = a2;
        Scale e2 = exitTransition.b().e();
        if (e2 == null) {
            e2 = b().e();
        }
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, e2, exitTransition.b().d() || b().d(), MapsKt.n(b().b(), exitTransition.b().b())));
    }

    public boolean equals(Object obj) {
        return (obj instanceof ExitTransition) && Intrinsics.d(((ExitTransition) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (Intrinsics.d(this, f2278b)) {
            return "ExitTransition.None";
        }
        if (Intrinsics.d(this, f2279c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData b2 = b();
        StringBuilder sb = new StringBuilder();
        sb.append("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(b2.d());
        return sb.toString();
    }

    public ExitTransition() {
    }
}
