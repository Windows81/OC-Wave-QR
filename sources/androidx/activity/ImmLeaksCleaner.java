package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LifecycleEventObserver;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ImmLeaksCleaner implements LifecycleEventObserver {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f69A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final Lazy f70B = LazyKt.b(ImmLeaksCleaner$Companion$cleaner$2.f72z);

    /* renamed from: z  reason: collision with root package name */
    public final Activity f71z;

    @Metadata
    public static abstract class Cleaner {
        public /* synthetic */ Cleaner(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean a(InputMethodManager inputMethodManager);

        public abstract Object b(InputMethodManager inputMethodManager);

        public abstract View c(InputMethodManager inputMethodManager);

        public Cleaner() {
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Cleaner a() {
            return (Cleaner) ImmLeaksCleaner.f70B.getValue();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class FailedInitialization extends Cleaner {

        /* renamed from: a  reason: collision with root package name */
        public static final FailedInitialization f73a = new FailedInitialization();

        public FailedInitialization() {
            super((DefaultConstructorMarker) null);
        }

        public boolean a(InputMethodManager inputMethodManager) {
            Intrinsics.i(inputMethodManager, "<this>");
            return false;
        }

        public Object b(InputMethodManager inputMethodManager) {
            Intrinsics.i(inputMethodManager, "<this>");
            return null;
        }

        public View c(InputMethodManager inputMethodManager) {
            Intrinsics.i(inputMethodManager, "<this>");
            return null;
        }
    }

    @Metadata
    public static final class ValidCleaner extends Cleaner {

        /* renamed from: a  reason: collision with root package name */
        public final Field f74a;

        /* renamed from: b  reason: collision with root package name */
        public final Field f75b;

        /* renamed from: c  reason: collision with root package name */
        public final Field f76c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ValidCleaner(Field field, Field field2, Field field3) {
            super((DefaultConstructorMarker) null);
            Intrinsics.i(field, "hField");
            Intrinsics.i(field2, "servedViewField");
            Intrinsics.i(field3, "nextServedViewField");
            this.f74a = field;
            this.f75b = field2;
            this.f76c = field3;
        }

        public boolean a(InputMethodManager inputMethodManager) {
            Intrinsics.i(inputMethodManager, "<this>");
            try {
                this.f76c.set(inputMethodManager, (Object) null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        public Object b(InputMethodManager inputMethodManager) {
            Intrinsics.i(inputMethodManager, "<this>");
            try {
                return this.f74a.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        public View c(InputMethodManager inputMethodManager) {
            Intrinsics.i(inputMethodManager, "<this>");
            try {
                return (View) this.f75b.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r3.isActive();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
        /*
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.i(r3, r0)
            java.lang.String r3 = "event"
            kotlin.jvm.internal.Intrinsics.i(r4, r3)
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r4 == r3) goto L_0x000f
            return
        L_0x000f:
            android.app.Activity r3 = r2.f71z
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            java.lang.String r4 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            kotlin.jvm.internal.Intrinsics.g(r3, r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            androidx.activity.ImmLeaksCleaner$Companion r4 = f69A
            androidx.activity.ImmLeaksCleaner$Cleaner r4 = r4.a()
            java.lang.Object r0 = r4.b(r3)
            if (r0 != 0) goto L_0x002b
            return
        L_0x002b:
            monitor-enter(r0)
            android.view.View r1 = r4.c(r3)     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0034
            monitor-exit(r0)
            return
        L_0x0034:
            boolean r1 = r1.isAttachedToWindow()     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x003c
            monitor-exit(r0)
            return
        L_0x003c:
            boolean r4 = r4.a(r3)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)
            if (r4 == 0) goto L_0x0046
            r3.isActive()
        L_0x0046:
            return
        L_0x0047:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.j(androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Lifecycle$Event):void");
    }
}
