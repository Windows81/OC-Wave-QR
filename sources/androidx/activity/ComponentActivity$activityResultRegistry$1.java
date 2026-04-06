package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ComponentActivity$activityResultRegistry$1 extends ActivityResultRegistry {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f50i;

    public ComponentActivity$activityResultRegistry$1(ComponentActivity componentActivity) {
        this.f50i = componentActivity;
    }

    public static final void s(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i2, ActivityResultContract.SynchronousResult synchronousResult) {
        componentActivity$activityResultRegistry$1.f(i2, synchronousResult.a());
    }

    public static final void t(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i2, IntentSender.SendIntentException sendIntentException) {
        componentActivity$activityResultRegistry$1.e(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
    }

    public void i(int i2, ActivityResultContract activityResultContract, Object obj, ActivityOptionsCompat activityOptionsCompat) {
        Bundle bundle;
        Intrinsics.i(activityResultContract, "contract");
        ComponentActivity componentActivity = this.f50i;
        ActivityResultContract.SynchronousResult b2 = activityResultContract.b(componentActivity, obj);
        if (b2 != null) {
            new Handler(Looper.getMainLooper()).post(new h(this, i2, b2));
            return;
        }
        Intent a2 = activityResultContract.a(componentActivity, obj);
        if (a2.getExtras() != null) {
            Bundle extras = a2.getExtras();
            Intrinsics.f(extras);
            if (extras.getClassLoader() == null) {
                a2.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = activityOptionsCompat != null ? activityOptionsCompat.a() : null;
        }
        if (Intrinsics.d("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", a2.getAction())) {
            String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ActivityCompat.r(componentActivity, stringArrayExtra, i2);
        } else if (Intrinsics.d("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", a2.getAction())) {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.f(intentSenderRequest);
                ActivityCompat.t(componentActivity, intentSenderRequest.d(), i2, intentSenderRequest.a(), intentSenderRequest.b(), intentSenderRequest.c(), 0, bundle);
            } catch (IntentSender.SendIntentException e2) {
                new Handler(Looper.getMainLooper()).post(new i(this, i2, e2));
            }
        } else {
            ActivityCompat.s(componentActivity, a2, i2, bundle);
        }
    }
}
