package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;

@Metadata
public abstract class ActivityResultRegistry {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f224h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Map f225a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f226b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map f227c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final List f228d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final transient Map f229e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final Map f230f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f231g = new Bundle();

    @Metadata
    public static final class CallbackAndContract<O> {

        /* renamed from: a  reason: collision with root package name */
        public final ActivityResultCallback f232a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityResultContract f233b;

        public CallbackAndContract(ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract) {
            Intrinsics.i(activityResultCallback, "callback");
            Intrinsics.i(activityResultContract, "contract");
            this.f232a = activityResultCallback;
            this.f233b = activityResultContract;
        }

        public final ActivityResultCallback a() {
            return this.f232a;
        }

        public final ActivityResultContract b() {
            return this.f233b;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class LifecycleContainer {

        /* renamed from: a  reason: collision with root package name */
        public final Lifecycle f234a;

        /* renamed from: b  reason: collision with root package name */
        public final List f235b = new ArrayList();

        public LifecycleContainer(Lifecycle lifecycle) {
            Intrinsics.i(lifecycle, "lifecycle");
            this.f234a = lifecycle;
        }

        public final void a(LifecycleEventObserver lifecycleEventObserver) {
            Intrinsics.i(lifecycleEventObserver, "observer");
            this.f234a.a(lifecycleEventObserver);
            this.f235b.add(lifecycleEventObserver);
        }

        public final void b() {
            for (LifecycleEventObserver d2 : this.f235b) {
                this.f234a.d(d2);
            }
            this.f235b.clear();
        }
    }

    public static final void n(ActivityResultRegistry activityResultRegistry, String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.i(event, "event");
        if (Lifecycle.Event.ON_START == event) {
            activityResultRegistry.f229e.put(str, new CallbackAndContract(activityResultCallback, activityResultContract));
            if (activityResultRegistry.f230f.containsKey(str)) {
                Object obj = activityResultRegistry.f230f.get(str);
                activityResultRegistry.f230f.remove(str);
                activityResultCallback.a(obj);
            }
            ActivityResult activityResult = (ActivityResult) BundleCompat.a(activityResultRegistry.f231g, str, ActivityResult.class);
            if (activityResult != null) {
                activityResultRegistry.f231g.remove(str);
                activityResultCallback.a(activityResultContract.c(activityResult.b(), activityResult.a()));
            }
        } else if (Lifecycle.Event.ON_STOP == event) {
            activityResultRegistry.f229e.remove(str);
        } else if (Lifecycle.Event.ON_DESTROY == event) {
            activityResultRegistry.p(str);
        }
    }

    public final void d(int i2, String str) {
        this.f225a.put(Integer.valueOf(i2), str);
        this.f226b.put(str, Integer.valueOf(i2));
    }

    public final boolean e(int i2, int i3, Intent intent) {
        String str = (String) this.f225a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        g(str, i3, intent, (CallbackAndContract) this.f229e.get(str));
        return true;
    }

    public final boolean f(int i2, Object obj) {
        String str = (String) this.f225a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        CallbackAndContract callbackAndContract = (CallbackAndContract) this.f229e.get(str);
        if ((callbackAndContract != null ? callbackAndContract.a() : null) == null) {
            this.f231g.remove(str);
            this.f230f.put(str, obj);
            return true;
        }
        ActivityResultCallback a2 = callbackAndContract.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f228d.remove(str)) {
            return true;
        }
        a2.a(obj);
        return true;
    }

    public final void g(String str, int i2, Intent intent, CallbackAndContract callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.a() : null) == null || !this.f228d.contains(str)) {
            this.f230f.remove(str);
            this.f231g.putParcelable(str, new ActivityResult(i2, intent));
            return;
        }
        callbackAndContract.a().a(callbackAndContract.b().c(i2, intent));
        this.f228d.remove(str);
    }

    public final int h() {
        for (Number number : SequencesKt.i(ActivityResultRegistry$generateRandomNumber$1.f236z)) {
            if (!this.f225a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public abstract void i(int i2, ActivityResultContract activityResultContract, Object obj, ActivityOptionsCompat activityOptionsCompat);

    public final void j(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    this.f228d.addAll(stringArrayList2);
                }
                Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                if (bundle2 != null) {
                    this.f231g.putAll(bundle2);
                }
                int size = stringArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str = stringArrayList.get(i2);
                    if (this.f226b.containsKey(str)) {
                        Integer num = (Integer) this.f226b.remove(str);
                        if (!this.f231g.containsKey(str)) {
                            TypeIntrinsics.d(this.f225a).remove(num);
                        }
                    }
                    Integer num2 = integerArrayList.get(i2);
                    Intrinsics.h(num2, "rcs[i]");
                    int intValue = num2.intValue();
                    String str2 = stringArrayList.get(i2);
                    Intrinsics.h(str2, "keys[i]");
                    d(intValue, str2);
                }
            }
        }
    }

    public final void k(Bundle bundle) {
        Intrinsics.i(bundle, "outState");
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f226b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f226b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f228d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f231g));
    }

    public final ActivityResultLauncher l(String str, ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        Intrinsics.i(str, "key");
        Intrinsics.i(activityResultContract, "contract");
        Intrinsics.i(activityResultCallback, "callback");
        o(str);
        this.f229e.put(str, new CallbackAndContract(activityResultCallback, activityResultContract));
        if (this.f230f.containsKey(str)) {
            Object obj = this.f230f.get(str);
            this.f230f.remove(str);
            activityResultCallback.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) BundleCompat.a(this.f231g, str, ActivityResult.class);
        if (activityResult != null) {
            this.f231g.remove(str);
            activityResultCallback.a(activityResultContract.c(activityResult.b(), activityResult.a()));
        }
        return new ActivityResultRegistry$register$3(this, str, activityResultContract);
    }

    public final ActivityResultLauncher m(String str, LifecycleOwner lifecycleOwner, ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        Intrinsics.i(str, "key");
        Intrinsics.i(lifecycleOwner, "lifecycleOwner");
        Intrinsics.i(activityResultContract, "contract");
        Intrinsics.i(activityResultCallback, "callback");
        Lifecycle a2 = lifecycleOwner.a();
        if (!a2.b().f(Lifecycle.State.STARTED)) {
            o(str);
            LifecycleContainer lifecycleContainer = (LifecycleContainer) this.f227c.get(str);
            if (lifecycleContainer == null) {
                lifecycleContainer = new LifecycleContainer(a2);
            }
            lifecycleContainer.a(new a(this, str, activityResultCallback, activityResultContract));
            this.f227c.put(str, lifecycleContainer);
            return new ActivityResultRegistry$register$2(this, str, activityResultContract);
        }
        throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + a2.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public final void o(String str) {
        if (((Integer) this.f226b.get(str)) == null) {
            d(h(), str);
        }
    }

    public final void p(String str) {
        Integer num;
        Intrinsics.i(str, "key");
        if (!this.f228d.contains(str) && (num = (Integer) this.f226b.remove(str)) != null) {
            this.f225a.remove(num);
        }
        this.f229e.remove(str);
        if (this.f230f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f230f.get(str));
            this.f230f.remove(str);
        }
        if (this.f231g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) BundleCompat.a(this.f231g, str, ActivityResult.class)));
            this.f231g.remove(str);
        }
        LifecycleContainer lifecycleContainer = (LifecycleContainer) this.f227c.get(str);
        if (lifecycleContainer != null) {
            lifecycleContainer.b();
            this.f227c.remove(str);
        }
    }
}
