package com.hansecom.abt.presentation.nfc;

import android.app.Activity;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import x.a;
import x.b;

@Metadata
public final class NfcHelper {

    /* renamed from: a  reason: collision with root package name */
    public final Context f34213a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f34214b = LazyKt.b(new a(this));

    public NfcHelper(Context context) {
        Intrinsics.i(context, "context");
        this.f34213a = context;
    }

    public static final void e(Tag tag) {
    }

    public static final NfcAdapter g(NfcHelper nfcHelper) {
        return NfcAdapter.getDefaultAdapter(nfcHelper.f34213a.getApplicationContext());
    }

    public final void c() {
        Unit unit;
        try {
            Result.Companion companion = Result.f40519A;
            NfcAdapter f2 = f();
            if (f2 != null) {
                Context context = this.f34213a;
                Intrinsics.g(context, "null cannot be cast to non-null type android.app.Activity");
                f2.disableReaderMode((Activity) context);
                unit = Unit.f40552a;
            } else {
                unit = null;
            }
            Result.b(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            Result.b(ResultKt.a(th));
        }
    }

    public final void d() {
        try {
            Result.Companion companion = Result.f40519A;
            NfcAdapter f2 = f();
            Unit unit = null;
            if (f2 != null) {
                Context context = this.f34213a;
                Intrinsics.g(context, "null cannot be cast to non-null type android.app.Activity");
                f2.enableReaderMode((Activity) context, new b(), 385, (Bundle) null);
                unit = Unit.f40552a;
            }
            Result.b(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            Result.b(ResultKt.a(th));
        }
    }

    public final NfcAdapter f() {
        return (NfcAdapter) this.f34214b.getValue();
    }
}
