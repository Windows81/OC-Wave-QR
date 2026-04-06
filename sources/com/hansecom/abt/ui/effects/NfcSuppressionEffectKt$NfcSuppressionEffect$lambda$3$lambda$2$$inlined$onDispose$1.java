package com.hansecom.abt.ui.effects;

import androidx.compose.runtime.DisposableEffectResult;
import com.hansecom.abt.presentation.nfc.NfcHelper;
import kotlin.Metadata;

@Metadata
public final class NfcSuppressionEffectKt$NfcSuppressionEffect$lambda$3$lambda$2$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NfcHelper f38834a;

    public NfcSuppressionEffectKt$NfcSuppressionEffect$lambda$3$lambda$2$$inlined$onDispose$1(NfcHelper nfcHelper) {
        this.f38834a = nfcHelper;
    }

    public void d() {
        this.f38834a.c();
    }
}
