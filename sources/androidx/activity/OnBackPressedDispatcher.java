package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f80a;

    /* renamed from: b  reason: collision with root package name */
    public final Consumer f81b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f82c;

    /* renamed from: d  reason: collision with root package name */
    public OnBackPressedCallback f83d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedCallback f84e;

    /* renamed from: f  reason: collision with root package name */
    public OnBackInvokedDispatcher f85f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f86g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f87h;

    @Metadata
    public static final class Api33Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Api33Impl f93a = new Api33Impl();

        public static final void c(Function0 function0) {
            function0.invoke();
        }

        public final OnBackInvokedCallback b(Function0 function0) {
            Intrinsics.i(function0, "onBackInvoked");
            return new C0011r(function0);
        }

        public final void d(Object obj, int i2, Object obj2) {
            Intrinsics.i(obj, "dispatcher");
            Intrinsics.i(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i2, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            Intrinsics.i(obj, "dispatcher");
            Intrinsics.i(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    @Metadata
    public static final class Api34Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Api34Impl f94a = new Api34Impl();

        public final OnBackInvokedCallback a(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
            Intrinsics.i(function1, "onBackStarted");
            Intrinsics.i(function12, "onBackProgressed");
            Intrinsics.i(function0, "onBackInvoked");
            Intrinsics.i(function02, "onBackCancelled");
            return new OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1(function1, function12, function0, function02);
        }
    }

    @Metadata
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {

        /* renamed from: A  reason: collision with root package name */
        public final OnBackPressedCallback f99A;

        /* renamed from: B  reason: collision with root package name */
        public Cancellable f100B;
        public final /* synthetic */ OnBackPressedDispatcher C;

        /* renamed from: z  reason: collision with root package name */
        public final Lifecycle f101z;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.i(lifecycle, "lifecycle");
            Intrinsics.i(onBackPressedCallback, "onBackPressedCallback");
            this.C = onBackPressedDispatcher;
            this.f101z = lifecycle;
            this.f99A = onBackPressedCallback;
            lifecycle.a(this);
        }

        public void cancel() {
            this.f101z.d(this);
            this.f99A.i(this);
            Cancellable cancellable = this.f100B;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.f100B = null;
        }

        public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Intrinsics.i(lifecycleOwner, "source");
            Intrinsics.i(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.f100B = this.C.j(this.f99A);
            } else if (event == Lifecycle.Event.ON_STOP) {
                Cancellable cancellable = this.f100B;
                if (cancellable != null) {
                    cancellable.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    @Metadata
    public final class OnBackPressedCancellable implements Cancellable {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f102A;

        /* renamed from: z  reason: collision with root package name */
        public final OnBackPressedCallback f103z;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.i(onBackPressedCallback, "onBackPressedCallback");
            this.f102A = onBackPressedDispatcher;
            this.f103z = onBackPressedCallback;
        }

        public void cancel() {
            this.f102A.f82c.remove(this.f103z);
            if (Intrinsics.d(this.f102A.f83d, this.f103z)) {
                this.f103z.c();
                this.f102A.f83d = null;
            }
            this.f103z.i(this);
            Function0 b2 = this.f103z.b();
            if (b2 != null) {
                b2.invoke();
            }
            this.f103z.k((Function0) null);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable, Consumer consumer) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f80a = runnable;
        this.f81b = consumer;
        this.f82c = new ArrayDeque();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            if (i2 >= 34) {
                onBackInvokedCallback = Api34Impl.f94a.a(new Function1<BackEventCompat, Unit>(this) {

                    /* renamed from: z  reason: collision with root package name */
                    public final /* synthetic */ OnBackPressedDispatcher f88z;

                    {
                        this.f88z = r1;
                    }

                    public final void b(BackEventCompat backEventCompat) {
                        Intrinsics.i(backEventCompat, "backEvent");
                        this.f88z.n(backEventCompat);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((BackEventCompat) obj);
                        return Unit.f40552a;
                    }
                }, new Function1<BackEventCompat, Unit>(this) {

                    /* renamed from: z  reason: collision with root package name */
                    public final /* synthetic */ OnBackPressedDispatcher f89z;

                    {
                        this.f89z = r1;
                    }

                    public final void b(BackEventCompat backEventCompat) {
                        Intrinsics.i(backEventCompat, "backEvent");
                        this.f89z.m(backEventCompat);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((BackEventCompat) obj);
                        return Unit.f40552a;
                    }
                }, new Function0<Unit>(this) {

                    /* renamed from: z  reason: collision with root package name */
                    public final /* synthetic */ OnBackPressedDispatcher f90z;

                    {
                        this.f90z = r1;
                    }

                    public final void invoke() {
                        this.f90z.l();
                    }
                }, new Function0<Unit>(this) {

                    /* renamed from: z  reason: collision with root package name */
                    public final /* synthetic */ OnBackPressedDispatcher f91z;

                    {
                        this.f91z = r1;
                    }

                    public final void invoke() {
                        this.f91z.k();
                    }
                });
            } else {
                onBackInvokedCallback = Api33Impl.f93a.b(new Function0<Unit>(this) {

                    /* renamed from: z  reason: collision with root package name */
                    public final /* synthetic */ OnBackPressedDispatcher f92z;

                    {
                        this.f92z = r1;
                    }

                    public final void invoke() {
                        this.f92z.l();
                    }
                });
            }
            this.f84e = onBackInvokedCallback;
        }
    }

    public final void h(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.i(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    public final void i(LifecycleOwner lifecycleOwner, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.i(lifecycleOwner, "owner");
        Intrinsics.i(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle a2 = lifecycleOwner.a();
        if (a2.b() != Lifecycle.State.DESTROYED) {
            onBackPressedCallback.a(new LifecycleOnBackPressedCancellable(this, a2, onBackPressedCallback));
            q();
            onBackPressedCallback.k(new OnBackPressedDispatcher$addCallback$1(this));
        }
    }

    public final Cancellable j(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.i(onBackPressedCallback, "onBackPressedCallback");
        this.f82c.add(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.a(onBackPressedCancellable);
        q();
        onBackPressedCallback.k(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return onBackPressedCancellable;
    }

    public final void k() {
        Object obj;
        OnBackPressedCallback onBackPressedCallback = this.f83d;
        if (onBackPressedCallback == null) {
            ArrayDeque arrayDeque = this.f82c;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((OnBackPressedCallback) obj).g()) {
                    break;
                }
            }
            onBackPressedCallback = (OnBackPressedCallback) obj;
        }
        this.f83d = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.c();
        }
    }

    public final void l() {
        Object obj;
        OnBackPressedCallback onBackPressedCallback = this.f83d;
        if (onBackPressedCallback == null) {
            ArrayDeque arrayDeque = this.f82c;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((OnBackPressedCallback) obj).g()) {
                    break;
                }
            }
            onBackPressedCallback = (OnBackPressedCallback) obj;
        }
        this.f83d = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.d();
            return;
        }
        Runnable runnable = this.f80a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.activity.OnBackPressedCallback} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.activity.OnBackPressedCallback} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: androidx.activity.OnBackPressedCallback} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.activity.OnBackPressedCallback} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(androidx.activity.BackEventCompat r4) {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.f83d
            if (r0 != 0) goto L_0x0026
            kotlin.collections.ArrayDeque r0 = r3.f82c
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L_0x000e:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.previous()
            r2 = r1
            androidx.activity.OnBackPressedCallback r2 = (androidx.activity.OnBackPressedCallback) r2
            boolean r2 = r2.g()
            if (r2 == 0) goto L_0x000e
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            r0 = r1
            androidx.activity.OnBackPressedCallback r0 = (androidx.activity.OnBackPressedCallback) r0
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            r0.e(r4)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.OnBackPressedDispatcher.m(androidx.activity.BackEventCompat):void");
    }

    public final void n(BackEventCompat backEventCompat) {
        Object obj;
        ArrayDeque arrayDeque = this.f82c;
        ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((OnBackPressedCallback) obj).g()) {
                break;
            }
        }
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) obj;
        if (this.f83d != null) {
            k();
        }
        this.f83d = onBackPressedCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.f(backEventCompat);
        }
    }

    public final void o(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        Intrinsics.i(onBackInvokedDispatcher, "invoker");
        this.f85f = onBackInvokedDispatcher;
        p(this.f87h);
    }

    public final void p(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f85f;
        OnBackInvokedCallback onBackInvokedCallback = this.f84e;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z2 && !this.f86g) {
                Api33Impl.f93a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f86g = true;
            } else if (!z2 && this.f86g) {
                Api33Impl.f93a.e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f86g = false;
            }
        }
    }

    public final void q() {
        boolean z2 = this.f87h;
        ArrayDeque arrayDeque = this.f82c;
        boolean z3 = false;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((OnBackPressedCallback) it.next()).g()) {
                        z3 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f87h = z3;
        if (z3 != z2) {
            Consumer consumer = this.f81b;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z3));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z3);
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, (Consumer) null);
    }
}
