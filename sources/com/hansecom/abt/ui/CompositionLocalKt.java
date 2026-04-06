package com.hansecom.abt.ui;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import kotlin.Metadata;

@Metadata
public final class CompositionLocalKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f37856a = androidx.compose.runtime.CompositionLocalKt.h((SnapshotMutationPolicy) null, new a(), 1, (Object) null);

    public static final AbtSnackbarHostState b() {
        throw new IllegalStateException("No SnackbarHostState provided");
    }

    public static final ProvidableCompositionLocal c() {
        return f37856a;
    }
}
