package com.hansecom.abt.util.resourcesResolvers;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.Firebase;
import com.google.firebase.crashlytics.FirebaseCrashlyticsKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.lokalise.sdk.LokaliseResources;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata
public final class StringResourceKt {
    public static final String a(int i2, Object[] objArr, Composer composer, int i3) {
        Intrinsics.i(objArr, "formatArgs");
        if (ComposerKt.P()) {
            ComposerKt.Y(1721069581, i3, -1, "com.hansecom.abt.util.resourcesResolvers.stringResource (StringResource.kt:29)");
        }
        String b2 = b((Context) composer.C(AndroidCompositionLocals_androidKt.g()), StringValueKt.c(i2), Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return b2;
    }

    public static final String b(Context context, StringValue stringValue, Object... objArr) {
        Intrinsics.i(context, "<this>");
        Intrinsics.i(stringValue, "stringValue");
        Intrinsics.i(objArr, "formatArgs");
        try {
            if (stringValue instanceof StringValue.ResourceId) {
                return context.getString(((StringValue.ResourceId) stringValue).b(), Arrays.copyOf(objArr, objArr.length));
            }
            if (stringValue instanceof StringValue.Key) {
                String e2 = ((StringValue.Key) stringValue).e();
                Integer d2 = ((StringValue.Key) stringValue).d();
                String[] strArr = (String[]) ((StringValue.Key) stringValue).c().toArray(new String[0]);
                return d(context, e2, d2, Arrays.copyOf(strArr, strArr.length));
            } else if (stringValue instanceof StringValue.Value) {
                String b2 = ((StringValue.Value) stringValue).b();
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(b2, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.h(format, "format(...)");
                return format;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } catch (Throwable th) {
            Timber.f44337a.c(th);
            FirebaseCrashlyticsKt.a(Firebase.f29632a).c(th);
            return "";
        }
    }

    public static final String c(StringValue stringValue, Object[] objArr, Composer composer, int i2) {
        Intrinsics.i(stringValue, "stringValue");
        Intrinsics.i(objArr, "formatArgs");
        if (ComposerKt.P()) {
            ComposerKt.Y(1107255612, i2, -1, "com.hansecom.abt.util.resourcesResolvers.stringResource (StringResource.kt:24)");
        }
        String b2 = b((Context) composer.C(AndroidCompositionLocals_androidKt.g()), stringValue, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return b2;
    }

    public static final String d(Context context, String str, Integer num, Object... objArr) {
        int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
        if (identifier == 0) {
            String stringByKey = new LokaliseResources(context).getStringByKey(str, Arrays.copyOf(objArr, objArr.length));
            if (stringByKey != null) {
                return stringByKey;
            }
            if (num == null) {
                return "";
            }
            String string = context.getString(num.intValue());
            Intrinsics.f(string);
            return string;
        }
        String string2 = context.getResources().getString(identifier, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.h(string2, "getString(...)");
        return string2;
    }
}
