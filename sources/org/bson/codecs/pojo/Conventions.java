package org.bson.codecs.pojo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Conventions {

    /* renamed from: a  reason: collision with root package name */
    public static final Convention f43783a;

    /* renamed from: b  reason: collision with root package name */
    public static final Convention f43784b;

    /* renamed from: c  reason: collision with root package name */
    public static final Convention f43785c = new ConventionSetPrivateFieldImpl();

    /* renamed from: d  reason: collision with root package name */
    public static final Convention f43786d = new ConventionUseGettersAsSettersImpl();

    /* renamed from: e  reason: collision with root package name */
    public static final Convention f43787e;

    /* renamed from: f  reason: collision with root package name */
    public static final List f43788f;

    /* renamed from: g  reason: collision with root package name */
    public static final List f43789g = Collections.emptyList();

    static {
        ConventionDefaultsImpl conventionDefaultsImpl = new ConventionDefaultsImpl();
        f43783a = conventionDefaultsImpl;
        ConventionAnnotationImpl conventionAnnotationImpl = new ConventionAnnotationImpl();
        f43784b = conventionAnnotationImpl;
        ConventionObjectIdGeneratorsImpl conventionObjectIdGeneratorsImpl = new ConventionObjectIdGeneratorsImpl();
        f43787e = conventionObjectIdGeneratorsImpl;
        f43788f = Collections.unmodifiableList(Arrays.asList(new Convention[]{conventionDefaultsImpl, conventionAnnotationImpl, conventionObjectIdGeneratorsImpl}));
    }
}
