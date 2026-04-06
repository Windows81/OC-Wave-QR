package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ImmLeaksCleaner$Companion$cleaner$2 extends Lambda implements Function0<ImmLeaksCleaner.Cleaner> {

    /* renamed from: z  reason: collision with root package name */
    public static final ImmLeaksCleaner$Companion$cleaner$2 f72z = new ImmLeaksCleaner$Companion$cleaner$2();

    public ImmLeaksCleaner$Companion$cleaner$2() {
        super(0);
    }

    /* renamed from: b */
    public final ImmLeaksCleaner.Cleaner invoke() {
        Class<InputMethodManager> cls = InputMethodManager.class;
        try {
            Field declaredField = cls.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            Intrinsics.h(declaredField3, "hField");
            Intrinsics.h(declaredField, "servedViewField");
            Intrinsics.h(declaredField2, "nextServedViewField");
            return new ImmLeaksCleaner.ValidCleaner(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return ImmLeaksCleaner.FailedInitialization.f73a;
        }
    }
}
