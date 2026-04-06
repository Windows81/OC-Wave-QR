package com.hansecom.abt.util.resourcesResolvers;

import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class c implements LinkInteractionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f39101a;

    public /* synthetic */ c(Function1 function1) {
        this.f39101a = function1;
    }

    public final void a(LinkAnnotation linkAnnotation) {
        StyledStringResourceKt.h(this.f39101a, linkAnnotation);
    }
}
