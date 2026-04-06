package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.ExpressiveMotionTokens;
import androidx.compose.material3.tokens.StandardMotionTokens;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface MotionScheme {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f10364a = Companion.f10365a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f10365a = new Companion();

        public final MotionScheme a() {
            return ExpressiveMotionSchemeImpl.f10366b;
        }

        public final MotionScheme b() {
            return StandardMotionSchemeImpl.f10373b;
        }
    }

    @Metadata
    public static final class ExpressiveMotionSchemeImpl implements MotionScheme {

        /* renamed from: b  reason: collision with root package name */
        public static final ExpressiveMotionSchemeImpl f10366b = new ExpressiveMotionSchemeImpl();

        /* renamed from: c  reason: collision with root package name */
        public static final SpringSpec f10367c;

        /* renamed from: d  reason: collision with root package name */
        public static final SpringSpec f10368d;

        /* renamed from: e  reason: collision with root package name */
        public static final SpringSpec f10369e;

        /* renamed from: f  reason: collision with root package name */
        public static final SpringSpec f10370f;

        /* renamed from: g  reason: collision with root package name */
        public static final SpringSpec f10371g;

        /* renamed from: h  reason: collision with root package name */
        public static final SpringSpec f10372h;

        static {
            ExpressiveMotionTokens expressiveMotionTokens = ExpressiveMotionTokens.f13128a;
            f10367c = AnimationSpecKt.l(expressiveMotionTokens.c(), expressiveMotionTokens.d(), (Object) null, 4, (Object) null);
            f10368d = AnimationSpecKt.l(expressiveMotionTokens.g(), expressiveMotionTokens.h(), (Object) null, 4, (Object) null);
            f10369e = AnimationSpecKt.l(expressiveMotionTokens.k(), expressiveMotionTokens.l(), (Object) null, 4, (Object) null);
            f10370f = AnimationSpecKt.l(expressiveMotionTokens.a(), expressiveMotionTokens.b(), (Object) null, 4, (Object) null);
            f10371g = AnimationSpecKt.l(expressiveMotionTokens.e(), expressiveMotionTokens.f(), (Object) null, 4, (Object) null);
            f10372h = AnimationSpecKt.l(expressiveMotionTokens.i(), expressiveMotionTokens.j(), (Object) null, 4, (Object) null);
        }

        public FiniteAnimationSpec a() {
            SpringSpec springSpec = f10372h;
            Intrinsics.g(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.slowEffectsSpec>");
            return springSpec;
        }

        public FiniteAnimationSpec b() {
            SpringSpec springSpec = f10371g;
            Intrinsics.g(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.fastEffectsSpec>");
            return springSpec;
        }

        public FiniteAnimationSpec c() {
            SpringSpec springSpec = f10368d;
            Intrinsics.g(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.fastSpatialSpec>");
            return springSpec;
        }

        public FiniteAnimationSpec d() {
            SpringSpec springSpec = f10370f;
            Intrinsics.g(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.defaultEffectsSpec>");
            return springSpec;
        }

        public FiniteAnimationSpec e() {
            SpringSpec springSpec = f10369e;
            Intrinsics.g(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.slowSpatialSpec>");
            return springSpec;
        }

        public FiniteAnimationSpec f() {
            SpringSpec springSpec = f10367c;
            Intrinsics.g(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.ExpressiveMotionSchemeImpl.defaultSpatialSpec>");
            return springSpec;
        }
    }

    @Metadata
    public static final class StandardMotionSchemeImpl implements MotionScheme {

        /* renamed from: b  reason: collision with root package name */
        public static final StandardMotionSchemeImpl f10373b = new StandardMotionSchemeImpl();

        /* renamed from: c  reason: collision with root package name */
        public static final SpringSpec f10374c;

        /* renamed from: d  reason: collision with root package name */
        public static final SpringSpec f10375d;

        /* renamed from: e  reason: collision with root package name */
        public static final SpringSpec f10376e;

        /* renamed from: f  reason: collision with root package name */
        public static final SpringSpec f10377f;

        /* renamed from: g  reason: collision with root package name */
        public static final SpringSpec f10378g;

        /* renamed from: h  reason: collision with root package name */
        public static final SpringSpec f10379h;

        static {
            StandardMotionTokens standardMotionTokens = StandardMotionTokens.f14149a;
            f10374c = AnimationSpecKt.l(standardMotionTokens.c(), standardMotionTokens.d(), (Object) null, 4, (Object) null);
            f10375d = AnimationSpecKt.l(standardMotionTokens.g(), standardMotionTokens.h(), (Object) null, 4, (Object) null);
            f10376e = AnimationSpecKt.l(standardMotionTokens.k(), standardMotionTokens.l(), (Object) null, 4, (Object) null);
            f10377f = AnimationSpecKt.l(standardMotionTokens.a(), standardMotionTokens.b(), (Object) null, 4, (Object) null);
            f10378g = AnimationSpecKt.l(standardMotionTokens.e(), standardMotionTokens.f(), (Object) null, 4, (Object) null);
            f10379h = AnimationSpecKt.l(standardMotionTokens.i(), standardMotionTokens.j(), (Object) null, 4, (Object) null);
        }

        public FiniteAnimationSpec a() {
            SpringSpec springSpec = f10379h;
            Intrinsics.g(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowEffectsSpec>");
            return springSpec;
        }

        public FiniteAnimationSpec b() {
            SpringSpec springSpec = f10378g;
            Intrinsics.g(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastEffectsSpec>");
            return springSpec;
        }

        public FiniteAnimationSpec c() {
            SpringSpec springSpec = f10375d;
            Intrinsics.g(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>");
            return springSpec;
        }

        public FiniteAnimationSpec d() {
            SpringSpec springSpec = f10377f;
            Intrinsics.g(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultEffectsSpec>");
            return springSpec;
        }

        public FiniteAnimationSpec e() {
            SpringSpec springSpec = f10376e;
            Intrinsics.g(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowSpatialSpec>");
            return springSpec;
        }

        public FiniteAnimationSpec f() {
            SpringSpec springSpec = f10374c;
            Intrinsics.g(springSpec, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultSpatialSpec>");
            return springSpec;
        }
    }

    FiniteAnimationSpec a();

    FiniteAnimationSpec b();

    FiniteAnimationSpec c();

    FiniteAnimationSpec d();

    FiniteAnimationSpec e();

    FiniteAnimationSpec f();
}
