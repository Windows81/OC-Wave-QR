package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.os.CancellationSignal;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass10 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21500a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21500a = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21500a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21500a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21500a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.<clinit>():void");
        }
    }

    public static class AnimationInfo extends SpecialEffectsInfo {

        /* renamed from: c  reason: collision with root package name */
        public boolean f21532c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f21533d = false;

        /* renamed from: e  reason: collision with root package name */
        public FragmentAnim.AnimationOrAnimator f21534e;

        public AnimationInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal, boolean z2) {
            super(operation, cancellationSignal);
            this.f21532c = z2;
        }

        public FragmentAnim.AnimationOrAnimator e(Context context) {
            if (this.f21533d) {
                return this.f21534e;
            }
            FragmentAnim.AnimationOrAnimator b2 = FragmentAnim.b(context, b().f(), b().e() == SpecialEffectsController.Operation.State.VISIBLE, this.f21532c);
            this.f21534e = b2;
            this.f21533d = true;
            return b2;
        }
    }

    public static class SpecialEffectsInfo {

        /* renamed from: a  reason: collision with root package name */
        public final SpecialEffectsController.Operation f21535a;

        /* renamed from: b  reason: collision with root package name */
        public final CancellationSignal f21536b;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal) {
            this.f21535a = operation;
            this.f21536b = cancellationSignal;
        }

        public void a() {
            this.f21535a.d(this.f21536b);
        }

        public SpecialEffectsController.Operation b() {
            return this.f21535a;
        }

        public CancellationSignal c() {
            return this.f21536b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d() {
            /*
                r3 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r3.f21535a
                androidx.fragment.app.Fragment r0 = r0.f()
                android.view.View r0 = r0.h0
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.h(r0)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.f21535a
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.e()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo.d():boolean");
        }
    }

    public static class TransitionInfo extends SpecialEffectsInfo {

        /* renamed from: c  reason: collision with root package name */
        public final Object f21537c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f21538d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f21539e;

        public TransitionInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal, boolean z2, boolean z3) {
            super(operation, cancellationSignal);
            if (operation.e() == SpecialEffectsController.Operation.State.VISIBLE) {
                this.f21537c = z2 ? operation.f().O() : operation.f().x();
                this.f21538d = z2 ? operation.f().p() : operation.f().o();
            } else {
                this.f21537c = z2 ? operation.f().R() : operation.f().A();
                this.f21538d = true;
            }
            if (!z3) {
                this.f21539e = null;
            } else if (z2) {
                this.f21539e = operation.f().T();
            } else {
                this.f21539e = operation.f().S();
            }
        }

        public FragmentTransitionImpl e() {
            FragmentTransitionImpl f2 = f(this.f21537c);
            FragmentTransitionImpl f3 = f(this.f21539e);
            if (f2 == null || f3 == null || f2 == f3) {
                return f2 != null ? f2 : f3;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f21537c + " which uses a different Transition  type than its shared element transition " + this.f21539e);
        }

        public final FragmentTransitionImpl f(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.f21737a;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.e(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.f21738b;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.e(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        public Object g() {
            return this.f21539e;
        }

        public Object h() {
            return this.f21537c;
        }

        public boolean i() {
            return this.f21539e != null;
        }

        public boolean j() {
            return this.f21538d;
        }
    }

    public DefaultSpecialEffectsController(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public void f(List list, boolean z2) {
        Iterator it = list.iterator();
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        while (it.hasNext()) {
            SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) it.next();
            SpecialEffectsController.Operation.State h2 = SpecialEffectsController.Operation.State.h(operation3.f().h0);
            int i2 = AnonymousClass10.f21500a[operation3.e().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (h2 == SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = operation3;
                }
            } else if (i2 == 4 && h2 != SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = operation3;
            }
        }
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Executing operations from " + operation + " to " + operation2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList<SpecialEffectsController.Operation> arrayList3 = new ArrayList<>(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) it2.next();
            CancellationSignal cancellationSignal = new CancellationSignal();
            operation4.j(cancellationSignal);
            arrayList.add(new AnimationInfo(operation4, cancellationSignal, z2));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            operation4.j(cancellationSignal2);
            boolean z3 = false;
            if (z2) {
                if (operation4 != operation) {
                    arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z2, z3));
                    operation4.a(new Runnable() {
                        public void run() {
                            if (arrayList3.contains(operation4)) {
                                arrayList3.remove(operation4);
                                DefaultSpecialEffectsController.this.s(operation4);
                            }
                        }
                    });
                }
            } else if (operation4 != operation2) {
                arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z2, z3));
                operation4.a(new Runnable() {
                    public void run() {
                        if (arrayList3.contains(operation4)) {
                            arrayList3.remove(operation4);
                            DefaultSpecialEffectsController.this.s(operation4);
                        }
                    }
                });
            }
            z3 = true;
            arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z2, z3));
            operation4.a(new Runnable() {
                public void run() {
                    if (arrayList3.contains(operation4)) {
                        arrayList3.remove(operation4);
                        DefaultSpecialEffectsController.this.s(operation4);
                    }
                }
            });
        }
        Map x2 = x(arrayList2, arrayList3, z2, operation, operation2);
        w(arrayList, arrayList3, x2.containsValue(Boolean.TRUE), x2);
        for (SpecialEffectsController.Operation s2 : arrayList3) {
            s(s2);
        }
        arrayList3.clear();
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + operation + " to " + operation2);
        }
    }

    public void s(SpecialEffectsController.Operation operation) {
        operation.e().d(operation.f().h0);
    }

    public void t(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!ViewGroupCompat.a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt.getVisibility() == 0) {
                        t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void u(Map map, View view) {
        String y2 = ViewCompat.y(view);
        if (y2 != null) {
            map.put(y2, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    public void v(ArrayMap arrayMap, Collection collection) {
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.y((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    public final void w(List list, List list2, boolean z2, Map map) {
        int i2;
        Context context;
        boolean z3;
        View view;
        int i3;
        final SpecialEffectsController.Operation operation;
        ViewGroup m2 = m();
        Context context2 = m2.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z4 = false;
        while (true) {
            i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            AnimationInfo animationInfo = (AnimationInfo) it.next();
            if (animationInfo.d()) {
                animationInfo.a();
            } else {
                FragmentAnim.AnimationOrAnimator e2 = animationInfo.e(context2);
                if (e2 == null) {
                    animationInfo.a();
                } else {
                    Animator animator = e2.f21588b;
                    if (animator == null) {
                        arrayList.add(animationInfo);
                    } else {
                        SpecialEffectsController.Operation b2 = animationInfo.b();
                        Fragment f2 = b2.f();
                        if (Boolean.TRUE.equals(map.get(b2))) {
                            if (FragmentManager.N0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f2 + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo.a();
                        } else {
                            boolean z5 = b2.e() == SpecialEffectsController.Operation.State.GONE;
                            List list3 = list2;
                            if (z5) {
                                list3.remove(b2);
                            }
                            View view2 = f2.h0;
                            m2.startViewTransition(view2);
                            AnonymousClass2 r20 = r0;
                            View view3 = view2;
                            final ViewGroup viewGroup = m2;
                            final View view4 = view3;
                            SpecialEffectsController.Operation operation2 = b2;
                            final boolean z6 = z5;
                            Animator animator2 = animator;
                            final SpecialEffectsController.Operation operation3 = operation2;
                            final Animator animator3 = animator2;
                            final AnimationInfo animationInfo2 = animationInfo;
                            AnonymousClass2 r0 = new AnimatorListenerAdapter() {
                                public void onAnimationEnd(Animator animator) {
                                    viewGroup.endViewTransition(view4);
                                    if (z6) {
                                        operation3.e().d(view4);
                                    }
                                    animationInfo2.a();
                                    if (FragmentManager.N0(2)) {
                                        Log.v("FragmentManager", "Animator from operation " + operation3 + " has ended.");
                                    }
                                }
                            };
                            animator3.addListener(r0);
                            animator3.setTarget(view3);
                            animator3.start();
                            if (FragmentManager.N0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Animator from operation ");
                                operation = operation2;
                                sb.append(operation);
                                sb.append(" has started.");
                                Log.v("FragmentManager", sb.toString());
                            } else {
                                operation = operation2;
                            }
                            animationInfo.c().c(new CancellationSignal.OnCancelListener() {
                                public void onCancel() {
                                    animator3.end();
                                    if (FragmentManager.N0(2)) {
                                        Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
                                    }
                                }
                            });
                            z4 = true;
                        }
                    }
                }
            }
            Map map2 = map;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AnimationInfo animationInfo3 = (AnimationInfo) it2.next();
            SpecialEffectsController.Operation b3 = animationInfo3.b();
            Fragment f3 = b3.f();
            if (z2) {
                if (FragmentManager.N0(i2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f3 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo3.a();
            } else if (z4) {
                if (FragmentManager.N0(i2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f3 + " as Animations cannot run alongside Animators.");
                }
                animationInfo3.a();
            } else {
                View view5 = f3.h0;
                Animation animation = (Animation) Preconditions.f(((FragmentAnim.AnimationOrAnimator) Preconditions.f(animationInfo3.e(context2))).f21587a);
                if (b3.e() != SpecialEffectsController.Operation.State.REMOVED) {
                    view5.startAnimation(animation);
                    animationInfo3.a();
                    z3 = z4;
                    context = context2;
                    i3 = i2;
                    view = view5;
                } else {
                    m2.startViewTransition(view5);
                    final SpecialEffectsController.Operation operation4 = b3;
                    AnonymousClass4 r14 = r0;
                    final ViewGroup viewGroup2 = m2;
                    z3 = z4;
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation, m2, view5);
                    final View view6 = view5;
                    context = context2;
                    view = view5;
                    final AnimationInfo animationInfo4 = animationInfo3;
                    AnonymousClass4 r02 = new Animation.AnimationListener() {
                        public void onAnimationEnd(Animation animation) {
                            viewGroup2.post(new Runnable() {
                                public void run() {
                                    AnonymousClass4 r0 = AnonymousClass4.this;
                                    viewGroup2.endViewTransition(view6);
                                    animationInfo4.a();
                                }
                            });
                            if (FragmentManager.N0(2)) {
                                Log.v("FragmentManager", "Animation from operation " + operation4 + " has ended.");
                            }
                        }

                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                            if (FragmentManager.N0(2)) {
                                Log.v("FragmentManager", "Animation from operation " + operation4 + " has reached onAnimationStart.");
                            }
                        }
                    };
                    endViewTransitionAnimation.setAnimationListener(r14);
                    view.startAnimation(endViewTransitionAnimation);
                    i3 = 2;
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + b3 + " has started.");
                    }
                }
                CancellationSignal c2 = animationInfo3.c();
                final View view7 = view;
                final ViewGroup viewGroup3 = m2;
                final AnimationInfo animationInfo5 = animationInfo3;
                AnonymousClass5 r8 = r0;
                final SpecialEffectsController.Operation operation5 = b3;
                AnonymousClass5 r03 = new CancellationSignal.OnCancelListener() {
                    public void onCancel() {
                        view7.clearAnimation();
                        viewGroup3.endViewTransition(view7);
                        animationInfo5.a();
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "Animation from operation " + operation5 + " has been cancelled.");
                        }
                    }
                };
                c2.c(r8);
                i2 = i3;
                z4 = z3;
                context2 = context;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.view.View} */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x033a, code lost:
        r1 = (android.view.View) r13.get((java.lang.String) r10.get(r0));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map x(java.util.List r34, java.util.List r35, boolean r36, androidx.fragment.app.SpecialEffectsController.Operation r37, androidx.fragment.app.SpecialEffectsController.Operation r38) {
        /*
            r33 = this;
            r6 = r33
            r7 = r36
            r8 = r37
            r9 = r38
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.Iterator r0 = r34.iterator()
            r15 = 0
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0062
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            boolean r2 = r1.d()
            if (r2 == 0) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            androidx.fragment.app.FragmentTransitionImpl r2 = r1.e()
            if (r15 != 0) goto L_0x002d
            r15 = r2
            goto L_0x0012
        L_0x002d:
            if (r2 == 0) goto L_0x0012
            if (r15 != r2) goto L_0x0032
            goto L_0x0012
        L_0x0032:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r2.append(r3)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r1.b()
            androidx.fragment.app.Fragment r3 = r3.f()
            r2.append(r3)
            java.lang.String r3 = " returned Transition "
            r2.append(r3)
            java.lang.Object r1 = r1.h()
            r2.append(r1)
            java.lang.String r1 = " which uses a different Transition  type than other Fragments."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0062:
            if (r15 != 0) goto L_0x0082
            java.util.Iterator r0 = r34.iterator()
        L_0x0068:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0081
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r1.b()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r10.put(r2, r3)
            r1.a()
            goto L_0x0068
        L_0x0081:
            return r10
        L_0x0082:
            android.view.View r14 = new android.view.View
            android.view.ViewGroup r0 = r33.m()
            android.content.Context r0 = r0.getContext()
            r14.<init>(r0)
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            java.util.Iterator r20 = r34.iterator()
            r0 = 0
            r2 = 0
            r21 = 0
        L_0x00ab:
            boolean r1 = r20.hasNext()
            r22 = 2
            java.lang.String r3 = "FragmentManager"
            if (r1 == 0) goto L_0x03a5
            java.lang.Object r1 = r20.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            boolean r17 = r1.i()
            if (r17 == 0) goto L_0x0388
            if (r8 == 0) goto L_0x0388
            if (r9 == 0) goto L_0x0388
            java.lang.Object r0 = r1.g()
            java.lang.Object r0 = r15.f(r0)
            java.lang.Object r1 = r15.u(r0)
            androidx.fragment.app.Fragment r0 = r38.f()
            java.util.ArrayList r0 = r0.U()
            androidx.fragment.app.Fragment r17 = r37.f()
            java.util.ArrayList r11 = r17.U()
            androidx.fragment.app.Fragment r17 = r37.f()
            r18 = r1
            java.util.ArrayList r1 = r17.V()
            r17 = r2
            r24 = r10
            r2 = 0
        L_0x00f0:
            int r10 = r1.size()
            if (r2 >= r10) goto L_0x0111
            java.lang.Object r10 = r1.get(r2)
            int r10 = r0.indexOf(r10)
            r19 = r1
            r1 = -1
            if (r10 == r1) goto L_0x010c
            java.lang.Object r1 = r11.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.set(r10, r1)
        L_0x010c:
            int r2 = r2 + 1
            r1 = r19
            goto L_0x00f0
        L_0x0111:
            androidx.fragment.app.Fragment r1 = r38.f()
            java.util.ArrayList r10 = r1.V()
            if (r7 != 0) goto L_0x012c
            androidx.fragment.app.Fragment r1 = r37.f()
            androidx.core.app.SharedElementCallback r1 = r1.B()
            androidx.fragment.app.Fragment r2 = r38.f()
            androidx.core.app.SharedElementCallback r2 = r2.y()
            goto L_0x013c
        L_0x012c:
            androidx.fragment.app.Fragment r1 = r37.f()
            androidx.core.app.SharedElementCallback r1 = r1.y()
            androidx.fragment.app.Fragment r2 = r38.f()
            androidx.core.app.SharedElementCallback r2 = r2.B()
        L_0x013c:
            int r11 = r0.size()
            r19 = r14
            r14 = 0
        L_0x0143:
            if (r14 >= r11) goto L_0x0163
            java.lang.Object r25 = r0.get(r14)
            r26 = r11
            r11 = r25
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r25 = r10.get(r14)
            r27 = r13
            r13 = r25
            java.lang.String r13 = (java.lang.String) r13
            r4.put(r11, r13)
            int r14 = r14 + 1
            r11 = r26
            r13 = r27
            goto L_0x0143
        L_0x0163:
            r27 = r13
            boolean r11 = androidx.fragment.app.FragmentManager.N0(r22)
            if (r11 == 0) goto L_0x01c5
            java.lang.String r11 = ">>> entering view names <<<"
            android.util.Log.v(r3, r11)
            java.util.Iterator r11 = r10.iterator()
        L_0x0174:
            boolean r13 = r11.hasNext()
            java.lang.String r14 = "Name: "
            if (r13 == 0) goto L_0x0199
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            r25 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r14)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            android.util.Log.v(r3, r11)
            r11 = r25
            goto L_0x0174
        L_0x0199:
            java.lang.String r11 = ">>> exiting view names <<<"
            android.util.Log.v(r3, r11)
            java.util.Iterator r11 = r0.iterator()
        L_0x01a2:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x01c5
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            r25 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r14)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            android.util.Log.v(r3, r11)
            r11 = r25
            goto L_0x01a2
        L_0x01c5:
            androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap
            r11.<init>()
            androidx.fragment.app.Fragment r13 = r37.f()
            android.view.View r13 = r13.h0
            r6.u(r11, r13)
            r11.o(r0)
            if (r1 == 0) goto L_0x0232
            boolean r13 = androidx.fragment.app.FragmentManager.N0(r22)
            if (r13 == 0) goto L_0x01f2
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Executing exit callback for operation "
            r13.append(r14)
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            android.util.Log.v(r3, r13)
        L_0x01f2:
            r1.d(r0, r11)
            int r1 = r0.size()
            r13 = 1
            int r1 = r1 - r13
        L_0x01fb:
            if (r1 < 0) goto L_0x022f
            java.lang.Object r13 = r0.get(r1)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r11.get(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 != 0) goto L_0x0211
            r4.remove(r13)
            r25 = r0
            goto L_0x022a
        L_0x0211:
            r25 = r0
            java.lang.String r0 = androidx.core.view.ViewCompat.y(r14)
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x022a
            java.lang.Object r0 = r4.remove(r13)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r13 = androidx.core.view.ViewCompat.y(r14)
            r4.put(r13, r0)
        L_0x022a:
            int r1 = r1 + -1
            r0 = r25
            goto L_0x01fb
        L_0x022f:
            r25 = r0
            goto L_0x023b
        L_0x0232:
            r25 = r0
            java.util.Set r0 = r11.keySet()
            r4.o(r0)
        L_0x023b:
            androidx.collection.ArrayMap r13 = new androidx.collection.ArrayMap
            r13.<init>()
            androidx.fragment.app.Fragment r0 = r38.f()
            android.view.View r0 = r0.h0
            r6.u(r13, r0)
            r13.o(r10)
            java.util.Collection r0 = r4.values()
            r13.o(r0)
            if (r2 == 0) goto L_0x02ac
            boolean r0 = androidx.fragment.app.FragmentManager.N0(r22)
            if (r0 == 0) goto L_0x026f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Executing enter callback for operation "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L_0x026f:
            r2.d(r10, r13)
            int r0 = r10.size()
            r1 = 1
            int r0 = r0 - r1
        L_0x0278:
            if (r0 < 0) goto L_0x02af
            java.lang.Object r1 = r10.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r13.get(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L_0x0292
            java.lang.String r1 = androidx.fragment.app.FragmentTransition.b(r4, r1)
            if (r1 == 0) goto L_0x02a9
            r4.remove(r1)
            goto L_0x02a9
        L_0x0292:
            java.lang.String r3 = androidx.core.view.ViewCompat.y(r2)
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x02a9
            java.lang.String r1 = androidx.fragment.app.FragmentTransition.b(r4, r1)
            if (r1 == 0) goto L_0x02a9
            java.lang.String r2 = androidx.core.view.ViewCompat.y(r2)
            r4.put(r1, r2)
        L_0x02a9:
            int r0 = r0 + -1
            goto L_0x0278
        L_0x02ac:
            androidx.fragment.app.FragmentTransition.d(r4, r13)
        L_0x02af:
            java.util.Set r0 = r4.keySet()
            r6.v(r11, r0)
            java.util.Collection r0 = r4.values()
            r6.v(r13, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x02dc
            r12.clear()
            r5.clear()
            r28 = r4
            r10 = r5
            r4 = r8
            r7 = r12
            r11 = r15
            r2 = r17
            r1 = r19
            r8 = r24
            r5 = r27
            r0 = 0
            r14 = 0
            r15 = r9
            goto L_0x0397
        L_0x02dc:
            androidx.fragment.app.Fragment r0 = r38.f()
            androidx.fragment.app.Fragment r1 = r37.f()
            r14 = 1
            androidx.fragment.app.FragmentTransition.a(r0, r1, r7, r11, r14)
            android.view.ViewGroup r3 = r33.m()
            androidx.fragment.app.DefaultSpecialEffectsController$6 r2 = new androidx.fragment.app.DefaultSpecialEffectsController$6
            r1 = r25
            r0 = r2
            r14 = r18
            r1 = r33
            r7 = r2
            r26 = r17
            r2 = r38
            r9 = r3
            r3 = r37
            r28 = r4
            r4 = r36
            r8 = r5
            r5 = r13
            r0.<init>(r2, r3, r4, r5)
            androidx.core.view.OneShotPreDrawListener.a(r9, r7)
            java.util.Collection r0 = r11.values()
            r12.addAll(r0)
            boolean r0 = r25.isEmpty()
            if (r0 != 0) goto L_0x032a
            r1 = r25
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r11.get(r1)
            r2 = r1
            android.view.View r2 = (android.view.View) r2
            r15.p(r14, r2)
            goto L_0x032d
        L_0x032a:
            r0 = 0
            r2 = r26
        L_0x032d:
            java.util.Collection r1 = r13.values()
            r8.addAll(r1)
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L_0x035b
            java.lang.Object r1 = r10.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.get(r1)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x035b
            android.view.ViewGroup r3 = r33.m()
            androidx.fragment.app.DefaultSpecialEffectsController$7 r4 = new androidx.fragment.app.DefaultSpecialEffectsController$7
            r5 = r27
            r4.<init>(r15, r1, r5)
            androidx.core.view.OneShotPreDrawListener.a(r3, r4)
            r1 = r19
            r21 = 1
            goto L_0x035f
        L_0x035b:
            r5 = r27
            r1 = r19
        L_0x035f:
            r15.s(r14, r1, r12)
            r16 = 0
            r17 = 0
            r3 = 0
            r4 = 0
            r7 = r12
            r12 = r15
            r13 = r14
            r9 = r14
            r14 = r3
            r11 = r15
            r15 = r4
            r18 = r9
            r19 = r8
            r12.n(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4 = r37
            r10 = r8
            r8 = r24
            r8.put(r4, r3)
            r15 = r38
            r14 = r0
            r8.put(r15, r3)
            r0 = r9
            goto L_0x0397
        L_0x0388:
            r26 = r2
            r28 = r4
            r4 = r8
            r8 = r10
            r7 = r12
            r1 = r14
            r11 = r15
            r14 = 0
            r10 = r5
            r15 = r9
            r5 = r13
            r2 = r26
        L_0x0397:
            r14 = r1
            r13 = r5
            r12 = r7
            r5 = r10
            r9 = r15
            r7 = r36
            r10 = r8
            r15 = r11
            r8 = r4
            r4 = r28
            goto L_0x00ab
        L_0x03a5:
            r26 = r2
            r28 = r4
            r4 = r8
            r8 = r10
            r7 = r12
            r1 = r14
            r11 = r15
            r14 = 0
            r10 = r5
            r15 = r9
            r5 = r13
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r34.iterator()
            r12 = 0
            r13 = 0
        L_0x03bd:
            boolean r16 = r9.hasNext()
            if (r16 == 0) goto L_0x04f0
            java.lang.Object r16 = r9.next()
            r20 = r16
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r20 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r20
            boolean r16 = r20.d()
            if (r16 == 0) goto L_0x03e3
            androidx.fragment.app.SpecialEffectsController$Operation r14 = r20.b()
            r36 = r9
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.put(r14, r9)
            r20.a()
            r9 = r36
        L_0x03e1:
            r14 = 0
            goto L_0x03bd
        L_0x03e3:
            r36 = r9
            java.lang.Object r9 = r20.h()
            java.lang.Object r9 = r11.f(r9)
            androidx.fragment.app.SpecialEffectsController$Operation r14 = r20.b()
            if (r0 == 0) goto L_0x03fa
            if (r14 == r4) goto L_0x03f7
            if (r14 != r15) goto L_0x03fa
        L_0x03f7:
            r17 = 1
            goto L_0x03fc
        L_0x03fa:
            r17 = 0
        L_0x03fc:
            if (r9 != 0) goto L_0x041c
            if (r17 != 0) goto L_0x0408
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.put(r14, r9)
            r20.a()
        L_0x0408:
            r29 = r1
            r24 = r3
            r30 = r7
            r32 = r10
            r1 = r12
            r7 = r13
            r10 = r15
            r3 = r26
            r13 = 0
            r23 = 1
            r12 = r35
            goto L_0x04df
        L_0x041c:
            r24 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r18 = r12
            androidx.fragment.app.Fragment r12 = r14.f()
            android.view.View r12 = r12.h0
            r6.t(r3, r12)
            if (r17 == 0) goto L_0x0439
            if (r14 != r4) goto L_0x0436
            r3.removeAll(r7)
            goto L_0x0439
        L_0x0436:
            r3.removeAll(r10)
        L_0x0439:
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto L_0x0452
            r11.a(r9, r1)
            r12 = r35
            r29 = r1
            r30 = r7
            r32 = r10
            r7 = r13
            r13 = r14
            r10 = r15
            r1 = r18
            r23 = 1
            goto L_0x04b1
        L_0x0452:
            r11.b(r9, r3)
            r19 = 0
            r25 = 0
            r17 = 0
            r27 = 0
            r29 = r1
            r1 = r18
            r12 = r11
            r30 = r7
            r7 = r13
            r13 = r9
            r31 = r14
            r23 = 1
            r14 = r9
            r32 = r10
            r10 = r15
            r15 = r3
            r16 = r17
            r17 = r27
            r18 = r19
            r19 = r25
            r12.n(r13, r14, r15, r16, r17, r18, r19)
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = r31.e()
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r12 != r13) goto L_0x04ad
            r12 = r35
            r13 = r31
            r12.remove(r13)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r3)
            androidx.fragment.app.Fragment r15 = r13.f()
            android.view.View r15 = r15.h0
            r14.remove(r15)
            androidx.fragment.app.Fragment r15 = r13.f()
            android.view.View r15 = r15.h0
            r11.m(r9, r15, r14)
            android.view.ViewGroup r14 = r33.m()
            androidx.fragment.app.DefaultSpecialEffectsController$8 r15 = new androidx.fragment.app.DefaultSpecialEffectsController$8
            r15.<init>(r3)
            androidx.core.view.OneShotPreDrawListener.a(r14, r15)
            goto L_0x04b1
        L_0x04ad:
            r12 = r35
            r13 = r31
        L_0x04b1:
            androidx.fragment.app.SpecialEffectsController$Operation$State r14 = r13.e()
            androidx.fragment.app.SpecialEffectsController$Operation$State r15 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r14 != r15) goto L_0x04c4
            r2.addAll(r3)
            if (r21 == 0) goto L_0x04c1
            r11.o(r9, r5)
        L_0x04c1:
            r3 = r26
            goto L_0x04c9
        L_0x04c4:
            r3 = r26
            r11.p(r9, r3)
        L_0x04c9:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r8.put(r13, r14)
            boolean r13 = r20.j()
            if (r13 == 0) goto L_0x04da
            r13 = 0
            java.lang.Object r7 = r11.k(r7, r9, r13)
            goto L_0x04df
        L_0x04da:
            r13 = 0
            java.lang.Object r1 = r11.k(r1, r9, r13)
        L_0x04df:
            r9 = r36
            r12 = r1
            r26 = r3
            r13 = r7
            r15 = r10
            r3 = r24
            r1 = r29
            r7 = r30
            r10 = r32
            goto L_0x03e1
        L_0x04f0:
            r24 = r3
            r30 = r7
            r32 = r10
            r1 = r12
            r7 = r13
            r10 = r15
            r23 = 1
            java.lang.Object r1 = r11.j(r7, r1, r0)
            if (r1 != 0) goto L_0x0502
            return r8
        L_0x0502:
            java.util.Iterator r3 = r34.iterator()
        L_0x0506:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0585
            java.lang.Object r5 = r3.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r5
            boolean r7 = r5.d()
            if (r7 == 0) goto L_0x0519
            goto L_0x0506
        L_0x0519:
            java.lang.Object r7 = r5.h()
            androidx.fragment.app.SpecialEffectsController$Operation r9 = r5.b()
            if (r0 == 0) goto L_0x052a
            if (r9 == r4) goto L_0x0527
            if (r9 != r10) goto L_0x052a
        L_0x0527:
            r12 = r23
            goto L_0x052b
        L_0x052a:
            r12 = 0
        L_0x052b:
            if (r7 != 0) goto L_0x0533
            if (r12 == 0) goto L_0x0530
            goto L_0x0533
        L_0x0530:
            r12 = r24
            goto L_0x0582
        L_0x0533:
            android.view.ViewGroup r7 = r33.m()
            boolean r7 = androidx.core.view.ViewCompat.D(r7)
            if (r7 != 0) goto L_0x056c
            boolean r7 = androidx.fragment.app.FragmentManager.N0(r22)
            if (r7 == 0) goto L_0x0566
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "SpecialEffectsController: Container "
            r7.append(r12)
            android.view.ViewGroup r12 = r33.m()
            r7.append(r12)
            java.lang.String r12 = " has not been laid out. Completing operation "
            r7.append(r12)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r12 = r24
            android.util.Log.v(r12, r7)
            goto L_0x0568
        L_0x0566:
            r12 = r24
        L_0x0568:
            r5.a()
            goto L_0x0582
        L_0x056c:
            r12 = r24
            androidx.fragment.app.SpecialEffectsController$Operation r7 = r5.b()
            androidx.fragment.app.Fragment r7 = r7.f()
            androidx.core.os.CancellationSignal r13 = r5.c()
            androidx.fragment.app.DefaultSpecialEffectsController$9 r14 = new androidx.fragment.app.DefaultSpecialEffectsController$9
            r14.<init>(r5, r9)
            r11.q(r7, r1, r13, r14)
        L_0x0582:
            r24 = r12
            goto L_0x0506
        L_0x0585:
            r12 = r24
            android.view.ViewGroup r3 = r33.m()
            boolean r3 = androidx.core.view.ViewCompat.D(r3)
            if (r3 != 0) goto L_0x0592
            return r8
        L_0x0592:
            r3 = 4
            androidx.fragment.app.FragmentTransition.e(r2, r3)
            r3 = r32
            java.util.ArrayList r16 = r11.l(r3)
            boolean r4 = androidx.fragment.app.FragmentManager.N0(r22)
            if (r4 == 0) goto L_0x060f
            java.lang.String r4 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r12, r4)
            java.lang.String r4 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r12, r4)
            java.util.Iterator r4 = r30.iterator()
        L_0x05b0:
            boolean r5 = r4.hasNext()
            java.lang.String r7 = " Name: "
            java.lang.String r9 = "View: "
            if (r5 == 0) goto L_0x05dd
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r5)
            r10.append(r7)
            java.lang.String r5 = androidx.core.view.ViewCompat.y(r5)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            android.util.Log.v(r12, r5)
            goto L_0x05b0
        L_0x05dd:
            java.lang.String r4 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r12, r4)
            java.util.Iterator r4 = r3.iterator()
        L_0x05e6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x060f
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r5)
            r10.append(r7)
            java.lang.String r5 = androidx.core.view.ViewCompat.y(r5)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            android.util.Log.v(r12, r5)
            goto L_0x05e6
        L_0x060f:
            android.view.ViewGroup r4 = r33.m()
            r11.c(r4, r1)
            android.view.ViewGroup r13 = r33.m()
            r12 = r11
            r14 = r30
            r15 = r3
            r17 = r28
            r12.r(r13, r14, r15, r16, r17)
            r1 = 0
            androidx.fragment.app.FragmentTransition.e(r2, r1)
            r1 = r30
            r11.t(r0, r1, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.x(java.util.List, java.util.List, boolean, androidx.fragment.app.SpecialEffectsController$Operation, androidx.fragment.app.SpecialEffectsController$Operation):java.util.Map");
    }
}
