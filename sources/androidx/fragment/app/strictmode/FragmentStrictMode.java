package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import f.a;
import f.b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FragmentStrictMode {

    /* renamed from: a  reason: collision with root package name */
    public static final FragmentStrictMode f21801a = new FragmentStrictMode();

    /* renamed from: b  reason: collision with root package name */
    public static Policy f21802b = Policy.f21807e;

    @Metadata
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    @Metadata
    public interface OnViolationListener {
        void a(Violation violation);
    }

    @Metadata
    public static final class Policy {

        /* renamed from: d  reason: collision with root package name */
        public static final Companion f21806d = new Companion((DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        public static final Policy f21807e = new Policy(SetsKt.d(), (OnViolationListener) null, MapsKt.h());

        /* renamed from: a  reason: collision with root package name */
        public final Set f21808a;

        /* renamed from: b  reason: collision with root package name */
        public final OnViolationListener f21809b;

        /* renamed from: c  reason: collision with root package name */
        public final Map f21810c;

        @Metadata
        public static final class Builder {
        }

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        public Policy(Set set, OnViolationListener onViolationListener, Map map) {
            Intrinsics.i(set, "flags");
            Intrinsics.i(map, "allowedViolations");
            this.f21808a = set;
            this.f21809b = onViolationListener;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f21810c = linkedHashMap;
        }

        public final Set a() {
            return this.f21808a;
        }

        public final OnViolationListener b() {
            return this.f21809b;
        }

        public final Map c() {
            return this.f21810c;
        }
    }

    public static final void e(Policy policy, Violation violation) {
        Intrinsics.i(policy, "$policy");
        Intrinsics.i(violation, "$violation");
        policy.b().a(violation);
    }

    public static final void f(String str, Violation violation) {
        Intrinsics.i(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    public static final void h(Fragment fragment, String str) {
        Intrinsics.i(fragment, "fragment");
        Intrinsics.i(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        FragmentStrictMode fragmentStrictMode = f21801a;
        fragmentStrictMode.g(fragmentReuseViolation);
        Policy c2 = fragmentStrictMode.c(fragment);
        if (c2.a().contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.q(c2, fragment.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.d(c2, fragmentReuseViolation);
        }
    }

    public static final void i(Fragment fragment, ViewGroup viewGroup) {
        Intrinsics.i(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = f21801a;
        fragmentStrictMode.g(fragmentTagUsageViolation);
        Policy c2 = fragmentStrictMode.c(fragment);
        if (c2.a().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.q(c2, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.d(c2, fragmentTagUsageViolation);
        }
    }

    public static final void j(Fragment fragment) {
        Intrinsics.i(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f21801a;
        fragmentStrictMode.g(getRetainInstanceUsageViolation);
        Policy c2 = fragmentStrictMode.c(fragment);
        if (c2.a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.q(c2, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.d(c2, getRetainInstanceUsageViolation);
        }
    }

    public static final void k(Fragment fragment) {
        Intrinsics.i(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f21801a;
        fragmentStrictMode.g(getTargetFragmentRequestCodeUsageViolation);
        Policy c2 = fragmentStrictMode.c(fragment);
        if (c2.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.q(c2, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.d(c2, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    public static final void l(Fragment fragment) {
        Intrinsics.i(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f21801a;
        fragmentStrictMode.g(getTargetFragmentUsageViolation);
        Policy c2 = fragmentStrictMode.c(fragment);
        if (c2.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.q(c2, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.d(c2, getTargetFragmentUsageViolation);
        }
    }

    public static final void m(Fragment fragment) {
        Intrinsics.i(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f21801a;
        fragmentStrictMode.g(setRetainInstanceUsageViolation);
        Policy c2 = fragmentStrictMode.c(fragment);
        if (c2.a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.q(c2, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.d(c2, setRetainInstanceUsageViolation);
        }
    }

    public static final void n(Fragment fragment, boolean z2) {
        Intrinsics.i(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z2);
        FragmentStrictMode fragmentStrictMode = f21801a;
        fragmentStrictMode.g(setUserVisibleHintViolation);
        Policy c2 = fragmentStrictMode.c(fragment);
        if (c2.a().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.q(c2, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.d(c2, setUserVisibleHintViolation);
        }
    }

    public static final void o(Fragment fragment, ViewGroup viewGroup) {
        Intrinsics.i(fragment, "fragment");
        Intrinsics.i(viewGroup, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = f21801a;
        fragmentStrictMode.g(wrongFragmentContainerViolation);
        Policy c2 = fragmentStrictMode.c(fragment);
        if (c2.a().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.q(c2, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.d(c2, wrongFragmentContainerViolation);
        }
    }

    public final Policy c(Fragment fragment) {
        while (fragment != null) {
            if (fragment.h0()) {
                FragmentManager J = fragment.J();
                Intrinsics.h(J, "declaringFragment.parentFragmentManager");
                if (J.G0() != null) {
                    Policy G0 = J.G0();
                    Intrinsics.f(G0);
                    return G0;
                }
            }
            fragment = fragment.I();
        }
        return f21802b;
    }

    public final void d(Policy policy, Violation violation) {
        Fragment a2 = violation.a();
        String name = a2.getClass().getName();
        if (policy.a().contains(Flag.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        if (policy.b() != null) {
            p(a2, new a(policy, violation));
        }
        if (policy.a().contains(Flag.PENALTY_DEATH)) {
            p(a2, new b(name, violation));
        }
    }

    public final void g(Violation violation) {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.a().getClass().getName(), violation);
        }
    }

    public final void p(Fragment fragment, Runnable runnable) {
        if (fragment.h0()) {
            Handler m2 = fragment.J().A0().m();
            Intrinsics.h(m2, "fragment.parentFragmentManager.host.handler");
            if (Intrinsics.d(m2.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                m2.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    public final boolean q(Policy policy, Class cls, Class cls2) {
        Set set = (Set) policy.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.d(cls2.getSuperclass(), Violation.class) || !CollectionsKt.W(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
