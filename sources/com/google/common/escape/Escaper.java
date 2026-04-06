package com.google.common.escape;

import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;

@ElementTypesAreNonnullByDefault
@DoNotMock
public abstract class Escaper {

    /* renamed from: a  reason: collision with root package name */
    public final Function f28698a = new a(this);

    public abstract String a(String str);
}
