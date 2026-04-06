package com.hansecom.abt.ui.components.snackbar;

import android.content.Context;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarHostState;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class AbtSnackbarHostState {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38783a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineScope f38784b;

    /* renamed from: c  reason: collision with root package name */
    public final SnackbarHostState f38785c = new SnackbarHostState();

    public AbtSnackbarHostState(Context context, CoroutineScope coroutineScope) {
        Intrinsics.i(context, "context");
        Intrinsics.i(coroutineScope, "defaultCoroutineScope");
        this.f38783a = context;
        this.f38784b = coroutineScope;
    }

    public static /* synthetic */ Job d(AbtSnackbarHostState abtSnackbarHostState, StringValue stringValue, SnackbarType snackbarType, String str, boolean z2, SnackbarDuration snackbarDuration, CoroutineScope coroutineScope, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            snackbarType = SnackbarType.ERROR;
        }
        SnackbarType snackbarType2 = snackbarType;
        if ((i2 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i2 & 16) != 0) {
            snackbarDuration = str2 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        SnackbarDuration snackbarDuration2 = snackbarDuration;
        if ((i2 & 32) != 0) {
            coroutineScope = abtSnackbarHostState.f38784b;
        }
        return abtSnackbarHostState.b(stringValue, snackbarType2, str2, z3, snackbarDuration2, coroutineScope);
    }

    public static /* synthetic */ Job e(AbtSnackbarHostState abtSnackbarHostState, CharSequence charSequence, SnackbarType snackbarType, String str, boolean z2, SnackbarDuration snackbarDuration, CoroutineScope coroutineScope, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            snackbarType = SnackbarType.ERROR;
        }
        SnackbarType snackbarType2 = snackbarType;
        if ((i2 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i2 & 16) != 0) {
            snackbarDuration = str2 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        SnackbarDuration snackbarDuration2 = snackbarDuration;
        if ((i2 & 32) != 0) {
            coroutineScope = abtSnackbarHostState.f38784b;
        }
        return abtSnackbarHostState.c(charSequence, snackbarType2, str2, z3, snackbarDuration2, coroutineScope);
    }

    public static /* synthetic */ Object g(AbtSnackbarHostState abtSnackbarHostState, CharSequence charSequence, SnackbarType snackbarType, String str, boolean z2, SnackbarDuration snackbarDuration, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            snackbarType = SnackbarType.ERROR;
        }
        SnackbarType snackbarType2 = snackbarType;
        if ((i2 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i2 & 16) != 0) {
            snackbarDuration = str2 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        return abtSnackbarHostState.f(charSequence, snackbarType2, str2, z3, snackbarDuration, continuation);
    }

    public final SnackbarHostState a() {
        return this.f38785c;
    }

    public final Job b(StringValue stringValue, SnackbarType snackbarType, String str, boolean z2, SnackbarDuration snackbarDuration, CoroutineScope coroutineScope) {
        Intrinsics.i(stringValue, "messageResource");
        Intrinsics.i(snackbarType, "type");
        Intrinsics.i(snackbarDuration, "duration");
        Intrinsics.i(coroutineScope, "coroutineScope");
        return c(StringResourceKt.b(this.f38783a, stringValue, new Object[0]), snackbarType, str, z2, snackbarDuration, coroutineScope);
    }

    public final Job c(CharSequence charSequence, SnackbarType snackbarType, String str, boolean z2, SnackbarDuration snackbarDuration, CoroutineScope coroutineScope) {
        Intrinsics.i(charSequence, "message");
        Intrinsics.i(snackbarType, "type");
        Intrinsics.i(snackbarDuration, "duration");
        Intrinsics.i(coroutineScope, "coroutineScope");
        return BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AbtSnackbarHostState$showSnackbar$1(this, charSequence, snackbarType, str, z2, snackbarDuration, (Continuation) null), 3, (Object) null);
    }

    public final Object f(CharSequence charSequence, SnackbarType snackbarType, String str, boolean z2, SnackbarDuration snackbarDuration, Continuation continuation) {
        return this.f38785c.d(new AbtSnackbarVisuals(snackbarType, charSequence, (String) null, snackbarDuration, str, z2, 4, (DefaultConstructorMarker) null), continuation);
    }
}
